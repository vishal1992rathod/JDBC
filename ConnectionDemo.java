package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {

// Designing the method for establishing the connection 
	public Connection getconnection() {
		Connection connection=null;
	   try {
			// step 1 load the Driver class
			Class.forName("com.mysql.jdbc.Driver");
			// step2 Establish the connection 
			 connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			
			
		}catch(Exception e) {
			e.printStackTrace();
	
			}
	return connection;
	
	}
	
}
