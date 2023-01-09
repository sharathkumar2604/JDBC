package com.xworkz.person;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonRunner {
public static void main(String[] args) {
	

	
	String username="root";
	String password="Sathish@123@";
	String host="jdbc:mysql://localhost:3306/college";

	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(host, username, password);
		
		String query="INSERT INTO students VALUES(?,?,?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, 2);
		statement.setString(2, "Shreyas");
		statement.setInt(3, 32);
		statement.setString(4, "Mandya");
		statement.setString(5, "Malavalli");
		
		statement.setInt(1, 3);
		statement.setString(2, "Raghu");
		statement.setInt(3, 29);
		statement.setString(4, "Mysore");
		statement.setString(5, "Degree");
		
		statement.setInt(1, 4);
		statement.setString(2, "gopal");
		statement.setInt(3, 30);
		statement.setString(4, "Ballary");
		statement.setString(5, "Bcom");
		
		statement.setInt(1, 5);
		statement.setString(2, "Rakesh");
		statement.setInt(3, 32);
		statement.setString(4, "Gadag");
		statement.setString(5, "Diplomo");
		
		
		statement.executeUpdate();
		
		statement.close();
		connection.close();
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	



}
}
