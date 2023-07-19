package oracleDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CountNoOfRows {

	public static void main(String[] args) throws Exception {
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
	 ResultSet rowCount
	 = st.executeQuery("SELECT COUNT(*) as rowCount from courses");
	 

	 st.close(); // close statement
	 con.close(); // close connection
	 System.out.println("Connection Closed....");
	 
	
}

	 
	}

}
