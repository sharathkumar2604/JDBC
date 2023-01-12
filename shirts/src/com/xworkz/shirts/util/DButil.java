package com.xworkz.shirts.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.shirts.constants.SqlCredentials;

public class DButil {

	public static Connection getConnection()
	{
	
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),SqlCredentials.USERNAME.getValue(),SqlCredentials.PASSWORD.getValue());
			
				return connection;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
			return null;

		
	}
	}