package com.xworkz.tree;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Runner {

	
	public static void main(String[] args) {
		

		
		String username="root";
		String password="Sathish@123@";
		String host="jdbc:mysql://localhost:3306/tree";

		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection(host, username, password);
			
			String query="SELECT * FROM plants where slno=?";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 1);
			
			ResultSet set =statement.executeQuery();
			set.next();
			int slno = set.getInt("slno");
			String name  = set.getString("name");
			String color =set.getString("color");
			String type = set.getString("type");
			int age =set.getInt("age");
			double height = set.getDouble("height");			
			System.out.println(slno);
			System.out.println(name);
			System.out.println(color);
			System.out.println(type);
			System.out.println(age);
			System.out.println(height);
			statement.executeQuery();
			statement.close();
			connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
}}