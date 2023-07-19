package oracleDB;

//Java Program to Establish Connection in JDBC

//Importing database
import java.sql.*;
//Importing required classes
import java.util.*;


//Main class
class SelectDemo {

 // Main driver method
 public static void main(String a[]) throws Exception
 {

     // Creating the connection using Oracle DB
     // Note: url syntax is standard, so do grasp
	 String url
     = "jdbc:oracle:thin:@localhost:1521:xe"; // table details
 String username = "scott"; // MySQL credentials
 String password = "tiger";
 String query
     = "select * from tab"; // query to be run
 Class.forName("oracle.jdbc.driver.OracleDriver"); // Driver name
 Connection con = DriverManager.getConnection(url,username,password);
 if(con!=null) {
	 System.out.println(
		     "Connection Established successfully");
 
 
 Statement st = con.createStatement();
 
 ResultSet rs
     = st.executeQuery(query); // Execute query
 
 while(rs.next()) {
	 System.out.println(rs.getString(1)+" "+rs.getString(2));
 }
 ResultSet rs1
 = st.executeQuery("select * from courses");
 while(rs1.next()) {
	 System.out.println(rs1.getString(1)+" "+rs1.getString(2)+" "+rs1.getString(3)+" "+rs1.getString(4));
 }

 st.close(); // close statement
 con.close(); // close connection
 System.out.println("Connection Closed....");
 }
}
}
 
