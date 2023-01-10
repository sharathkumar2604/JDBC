package com.xworkz.shoes.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.shoes.MysqlCredentials;
import com.xworkz.shoes.DTO.ShoesDTO;

public class ShoesRepoImpl implements ShoesRepo {

	@Override
	public boolean save(ShoesDTO dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(MysqlCredentials.URL.getValues(),MysqlCredentials.USERNAME.getValues(),MysqlCredentials.PASSWORD.getValues());
		
		String query="insert into shoes values(?,?,?,?,?)";
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, dto.getSlno());
		statement.setString(2,dto.getName());
		statement.setString(3,dto.getColor());
		statement.setString(4,dto.getType());
		statement.setInt(5,dto.getPrice());
		
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
		
		
		
		return false;
	}

	@Override
	public ShoesDTO read() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(MysqlCredentials.URL.getValues(),MysqlCredentials.USERNAME.getValues(),MysqlCredentials.PASSWORD.getValues());
		
		String query="select * from shoes where slno=?";
		PreparedStatement statement = connection.prepareStatement(query);
		
		
		statement.setInt(1,1);
		
		ResultSet set= statement.executeQuery();
		
		set.next();
		
		
		int slno=set.getInt(1);
		String name =set.getString(2);
		String color=set.getString(3);
		String type=set.getString(4);
		String price=set.getString(5);
		
	System.out.println("slno:"+slno+" "+"name:"+" " +name+ "color:"+" " +color+ "type:"+" " +type+ "price:"+" "+price);
			
		
		statement.close();
		connection.close();
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public ShoesDTO findByName(String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(MysqlCredentials.URL.getValues(),MysqlCredentials.USERNAME.getValues(),MysqlCredentials.PASSWORD.getValues());
		
		String query="select * from shoes where name=?";
		PreparedStatement statement = connection.prepareStatement(query);
		
		
		statement.setString(1,name);
		
		ResultSet set= statement.executeQuery();
		
		while(set.next())
		{		
		int slno=set.getInt(1);
		String name1 =set.getString(2);
		String color=set.getString(3);
		String type=set.getString(4);
		String price=set.getString(5);
		
			ShoesDTO dto = new ShoesDTO(slno, name1, color, type, slno);
		return dto;
		}
		statement.close();
		connection.close();
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
		
		

	}

	@Override
	public ShoesDTO findByNameAndSlno(String name, int slno) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(MysqlCredentials.URL.getValues(),MysqlCredentials.USERNAME.getValues(),MysqlCredentials.PASSWORD.getValues());
		
		String query="select * from shoes where name=? and slno=?";
		PreparedStatement statement = connection.prepareStatement(query);
		
		
		statement.setString(1,name );
		statement.setInt(2,slno);
		
		ResultSet set= statement.executeQuery();
		
		while(set.next())
		{		
		int slno1=set.getInt(1);
		String name1 =set.getString(2);
		String color=set.getString(3);
		String type=set.getString(4);
		String price=set.getString(5);
		
			ShoesDTO dto = new ShoesDTO(slno1, name1, color, type, slno);
		return dto;
		}
		statement.close();
		connection.close();
		

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
		
		return null;
	}
		

	
	

}
