package oracleDB;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {

	public static void main(String[] args) throws Exception {

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
	 

	}

}
}
