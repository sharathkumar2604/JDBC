package com.xworkz.fridge.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.fridge.constants.SqlCredentials;

public class DButil {
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		
			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValues(),SqlCredentials.USERNAME.getValues(),SqlCredentials.PASSWORD.getValues());
		
		 return connection;
		 
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}

}
