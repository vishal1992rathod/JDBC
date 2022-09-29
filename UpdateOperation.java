package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateOperation {

	public static void main(String[] args) {
		try {
			
			// load the driver class 
						Class.forName("com.mysql.jdbc.Driver");
						// Establish the connection
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
				PreparedStatement ps=con.prepareStatement("update user set LastName=?,FirstName=?,MiddelName=?,Address=?,City=?,Salary=? Where id=?");
				ps.setString(1, "Gaikwad");
				ps.setString(2, "Ramesh");
				ps.setString(3, "Tukaram");
				ps.setString(4, "ShivajiNagar");
				ps.setString(5, "Solapur");
				ps.setString(6, "22000");
				ps.setString(7, "4");
				int x=ps.executeUpdate();
				System.out.println("Update the record>>"+ x);
				con.close();	
				ps.close();
				
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			
			
		}

	}

}
