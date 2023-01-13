package com.xworkz.school.repo;

import java.awt.Taskbar.State;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.school.constants.SqlCrudentials;
import com.xworkz.school.dto.SchoolDto;

public class SchoolRepoImpl implements SchoolRepo {

	@Override
	public boolean save(SchoolDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCrudentials.URL.getValue(),
					SqlCrudentials.USERNAME.getValue(), SqlCrudentials.PASSWORD.getValue());

			String query = "insert into school values(?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getSlno());
			statement.setString(2, dto.getName());
			statement.setInt(3, dto.getNoOfStudents());
			statement.setInt(4, dto.getNoOfStaff());
			statement.setString(5, dto.getLocation());

		int status=	statement.executeUpdate();
		
		System.out.println(status);
			statement.close();
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<SchoolDto> read() {
List<SchoolDto> list =new ArrayList<SchoolDto>();


try {
	Class.forName("com.mysql.cj.jdbc.Driver");

	Connection connection = DriverManager.getConnection(SqlCrudentials.URL.getValue(),
			SqlCrudentials.USERNAME.getValue(), SqlCrudentials.PASSWORD.getValue());

	String query = "select * from school ";

	PreparedStatement statement = connection.prepareStatement(query);
		
		
	ResultSet set = statement.executeQuery();
	
	while(set.next())
	{
		int slno=set.getInt(1);
		String name=set.getString(2);
		int noOfStudent=set.getInt(3);
		int noOfStaff = set.getInt(4);
		String location =set.getString(5);
		
		SchoolDto dto =new SchoolDto(slno, name, noOfStudent, noOfStaff, location);
		
		list.add(dto);
		
		
	}
	return list;
	
	
}catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public SchoolDto findByName(String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCrudentials.URL.getValue(),
					SqlCrudentials.USERNAME.getValue(), SqlCrudentials.PASSWORD.getValue());

			String query = "select * from school where name=? ";

			PreparedStatement statement = connection.prepareStatement(query);
				
statement.setString(1, name);				
			ResultSet set = statement.executeQuery();
			
			set.next();
				int slno=set.getInt(1);
				String name1=set.getString(2);
				int noOfStudent=set.getInt(3);
				int noOfStaff = set.getInt(4);
				String location =set.getString(5);
				
				SchoolDto dto =new SchoolDto(slno, name1, noOfStudent, noOfStaff, location);
				
				
				return dto;
				
		
		}
				catch (Exception e) {
					e.printStackTrace();
				}
					return null;
	}	
		
		
		
	}
