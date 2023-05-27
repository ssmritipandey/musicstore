package bookanalysis;
//import java.util.*;
import java.sql.*;

class dbconnection{
	Connection con;
	PreparedStatement ps; // execute parametrized query
	ResultSet rs; // retrive col values 
	dbconnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bookanalysisdb","root","Smriti@001"); //password and username
			System.out.println("Connection established");
			}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}
		
	public void insert(int customer_id, float cust_total) throws Exception{
		ps = con.prepareStatement("INSERT INTO invoice_cust(customer_id, cust_total) VALUES(?,?)");
		ps.setInt(1, customer_id); //1st ? value, int as both values are int
		ps.setFloat(2, cust_total); // 2nd ? value
		ps.executeUpdate();//record instantly into table
			
	}
	
	public void update(int customer_id, float cust_total) throws Exception{	
		ps = con.prepareStatement("UPDATE invoice_cust SET cust_total = ? WHERE customer_id = ?");
	    ps.setFloat(1, cust_total); // 1st placeholder represents cust_total
	    ps.setInt(2, customer_id); // 2nd placeholder represents customer_id
	    ps.executeUpdate(); // Execute the update query
	    System.out.println("Row updated successfully.");
			
	}

	public void delete(int customer_id) throws Exception{
		ps = con.prepareStatement(" DELETE FROM invoice_cust WHERE customer_id= ?");
		ps.setInt(1, customer_id); //1st ? value, int as both values are int
		ps.executeUpdate();//record instantly into table
			
	}
	
	public void display() throws Exception{
		ps = con.prepareStatement("SELECT customer_id, cust_total FROM invoice_cust");
		rs = ps.executeQuery();
		while (rs.next()) {
            int custId = rs.getInt("customer_id");
            float total = rs.getFloat("cust_total");
            System.out.printf("Customer ID: %s, Total: %.2f%n", custId, total);
        }
		
	}
	
	
	public void searchbyid(int customer_id) throws Exception{
		ps = con.prepareStatement("select * from invoice_cust where customer_id = ?");
		ps.setInt(1, customer_id);
		rs = ps.executeQuery();
		if(rs.next()) {
			System.out.printf("%-15s%5s\n",rs.getString(1),rs.getString(2)); 
		}
		else {
			System.out.println("Record doesn't exist");
		}
		
	}
	
	/*
	 * public void searchbyamount(float cust_total) throws Exception{ ps =
	 * con.prepareStatement("select * from invoice_cust where cust_total = ?");
	 * ps.setFloat(2, cust_total); rs = ps.executeQuery(); if(rs.next()) {
	 * System.out.printf("%-15s%5s\n",rs.getString(1),rs.getString(2)); } else {
	 * System.out.println("Record doesn't exist"); }
	 * 
	 * }
	 */
	
	public void close() throws Exception {
		con.close(); //close the connection
		System.out.println("Connection closed");

	}	
	
}

