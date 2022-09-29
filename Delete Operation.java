package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteOperation {

	public static void main(String[] args) {
		try {
			// step 1 load the Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Step 2 Establishing the connection 
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			// Step 3 Prepare statement 
			PreparedStatement ps=con.prepareStatement("delete from user where id=?");
		ps.setString(1, "13");
		int i=ps.executeUpdate();
		System.out.println("deleted record>>"+i);
		con.close();
		ps.close();
		
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}
		
		}
