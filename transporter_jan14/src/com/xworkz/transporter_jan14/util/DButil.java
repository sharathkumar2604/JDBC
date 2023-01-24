package com.xworkz.transporter_jan14.util;

import java.sql.Connection;
import java.sql.DriverManager;
import com.xworkz.transporter_jan14.constants.SqlCredentials;

public class DButil {
	
	public static Connection getConnection()
	{
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(), SqlCredentials.USERNAME.getValue(),SqlCredentials.PASSWORD.getValue());
		  
		return connection;
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
		
		
		
	}

}
