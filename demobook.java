package bookanalysis;
import java.io.*;

public class demobook {
	public static void main(String[] args) throws Exception{
		int choice=-1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //input from console
		dbconnection con = new dbconnection();
		
		do {
			System.out.println("1. Insert");
			System.out.println("2. Display all records");
			System.out.println("3. Search by ID");
			System.out.println("4. Update");
			System.out.println("5. Delete");
			System.out.println("0. Exit");
			System.out.println(" Enter your choice");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1:
				System.out.println("Enter how many entries needed? ");
				int n =Integer.parseInt(br.readLine());
				for(int i=0; i<n; i++) 
				{
					//record from user
					System.out.println("Enter customer id");
					int customer_id = Integer.parseInt(br.readLine());
					System.out.println("Enter customer total purchase amount");
					float cust_total = Float.parseFloat(br.readLine());
					con.insert(customer_id, cust_total);
					//con.insert(60, 100); -> static insertion
				}
				break;
			case 2:
				con.display();
				break;
			case 3:
				System.out.println("Enter how many entries to be searched ? ");
				int t =Integer.parseInt(br.readLine());
				for(int i=0; i<t; i++) 
				{
					System.out.print("Enter customer id to search");
					int customer_id = Integer.parseInt(br.readLine());
					con.searchbyid(customer_id);
				}
				break;
			case 4:
				System.out.print("Which customer id to update");
				int customer_id = Integer.parseInt(br.readLine());
				System.out.println("Enter  new total purchase amount");
				float cust_total = Float.parseFloat(br.readLine());
				con.update(customer_id,cust_total);
				break;
				
			case 5:
				System.out.print("Which customer id to delete");
				customer_id = Integer.parseInt(br.readLine());
				con.delete(customer_id);
				break;
				
			
			
		/*
		 * case : System.out.print("Enter amount to search"); float cust_total =
		 * Float.parseFloat(br.readLine()); con.searchbyamount(cust_total);
		 * 
		 * break;
		 */
			
			
			case 0:
				con.close();
				break;
			}
			
		}while(choice !=0);
	}

}
