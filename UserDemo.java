package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserDemo {
	// LastName,FirstName,MiddelName,Address,City,Salary
	private void insertUserDetails(String LastName,String FirstName,String MiddelName,String Address,String City,String Salary) throws SQLException  {
		Connection connection= null;
		PreparedStatement ps = null;
		
		try {
		ConnectionDemo connectionDemo = new ConnectionDemo();
		 connection=connectionDemo.getconnection();
		  ps = connection.prepareStatement("insert into user (FirstName,LastName,MiddelName,Address,City,Salary) values(?,?,?,?,?,?)");
		ps.setString(1,FirstName);
		ps.setString(2, LastName);
		ps.setString(3, MiddelName);
		ps.setString(4, Address);
		ps.setString(5, City);
		ps.setString(6, Salary);
		
		int i=ps.executeUpdate();
		System.out.println("record inserted>>"+i);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ps.close();
			connection.close();
		}
			
	}
public static void main(String [] args) throws SQLException {
	Scanner scanner = new Scanner(System.in);
	for (int i=1;i<2;i++) {
	System.out.println("Enter the FirstName>>");
	String lastName=scanner.next();
	System.out.println("Enter the LastName>>");
	String FirstName=scanner.next();
	System.out.println("Enter the MiddelName>>");
	String MiddelName=scanner.next();
	System.out.println("Enter the Address>>");
	String Address=scanner.next();
	System.out.println("Enter the City>>");
	String City =scanner.next();
	System.out.println("Enter the Salary>>");
	String Salary=scanner.next();
	
	UserDemo userDemo=new UserDemo();
	userDemo.insertUserDetails(lastName,FirstName, MiddelName, Address, City, Salary);
	
}
}
}
