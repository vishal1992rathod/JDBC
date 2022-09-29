package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectOperation {

	

	public static void main(String[] args) {
		try {
			// Step 1 load the Driver 
			Class.forName("com.mysql.jdbc.Driver");
			// Step 2 Establishing the connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// prepare statement 
			PreparedStatement ps =con.prepareStatement("select* from user");
			ResultSet rs=ps.executeQuery(); // we will be getting result set after executing 
			while(rs.next()) { // we will be getting set has record or not 
				System.out.println("ID>>" +rs.getInt(1)); // Retrieve the data for that column 
				System.out.println("LastName>>" +rs.getString(2));
				System.out.println("FirstName>>"+rs.getString(3));
				System.out.println("MiddelName>>"+rs.getString(4));
				System.out.println("Address>>" +rs.getString(5));
				System.out.println("City>>" +rs.getString(6));
				System.out.println("Salary>>"+rs.getString(7));
				
			}
			// Step 4  close the resources 
			con.close();
			ps.close();
			rs.close();
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
	}

}
