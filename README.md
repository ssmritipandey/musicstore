# Music Store Analysis
This repository contains the code and SQL queries for analyzing a music store database. The SQL queries are used to extract and manipulate data from the database, while the Java program allows for editing and displaying the data in a tabular format.

## SQL Queries
The following SQL queries are used to extract and analyze data from the music store database:
1. ***SELECT*** : This query is used to retrieve specific columns or all columns from a table. It allows for filtering and sorting the data based on specified conditions.
2. ***JOIN***: This query is used to combine rows from two or more tables based on a related column between them. It enables us to retrieve data from multiple tables in a single query.
3. ***GROUP BY*** : This query is used to group rows that have the same values in specified columns. It is often used with aggregate functions, such as SUM, COUNT, AVG, etc., to perform calculations on grouped data.
4. ***ORDER BY*** : This query is used to sort the retrieved data based on one or more columns in ascending or descending order.
5. ***UPDATE*** : This query is used to modify existing records in a table by specifying the new values for one or more columns.
6. ***DELETE*** : This query is used to remove one or more records from a table based on specified conditions.

## Java Program
The Java program included in this repository provides a user-friendly interface to interact with the music store database. It allows for editing and displaying data in a tabular format. The program utilizes the ***JDBC (Java Database Connectivity)*** API to connect to the database and execute SQL queries.
The main features of the Java program are as follows:
1. *Connect to the database* : The program establishes a connection to the music store database using the JDBC API. The connection details, such as the database URL, username, and password, can be configured in the program.
2. *Edit and update data* : The program allows users to edit the data in the tables of the music store database. Users can modify existing records by selecting a specific row and providing new values for the columns. The program uses ***SQL UPDATE*** queries to update the data in the database.
3. *Display data* : The program retrieves data from the database and displays it in a tabular format. Users can choose to display specific columns or all columns from a table. The program uses ***SQL SELECT*** queries to retrieve the data.
4. *Execute custom SQL queries* : The program provides an option to execute custom SQL queries entered by the user. This feature allows for additional data analysis or retrieval beyond the predefined functionalities.
