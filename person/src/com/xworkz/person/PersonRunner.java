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
		statement.setString(2, "Raghu");
		statement.setInt(3, 32);
		statement.setString(4, "Gadag");
		statement.setString(5, "Degree");
		
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
