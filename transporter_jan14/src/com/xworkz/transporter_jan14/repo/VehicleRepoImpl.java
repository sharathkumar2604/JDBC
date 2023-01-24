package com.xworkz.transporter_jan14.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.transporter_jan14.dto.VehicleDto;
import com.xworkz.transporter_jan14.util.DButil;

public class VehicleRepoImpl implements VehicleRepo {

	@Override
	public boolean save(VehicleDto dto) {
		
		
		String query="insert into vehicle values(?,?,?,?,?,?)";
		
		try(Connection connection=DButil.getConnection();
	     PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1,dto.getId());
			statement.setString(2,dto.getName());
			statement.setString(3,dto.getType());
			statement.setInt(4,dto.getNo_of_wheels());
			statement.setString(5,dto.getColor());
			statement.setString(6, dto.getFuel_varient());
			
			statement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<VehicleDto> read() {
		
		
String query="select * from vehicle";
		
		try(Connection connection=DButil.getConnection();
	     PreparedStatement statement = connection.prepareStatement(query);) {
			ResultSet set=statement.executeQuery();
			List<VehicleDto> list = new ArrayList<VehicleDto>();
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name=set.getString(2);
				String type=set.getString(3);
				int no_of_wheels=set.getInt(4);
				String color=set.getString(5);
				String fuel_varient=set.getString(6);
				
				VehicleDto dto = new VehicleDto(id, name, type, no_of_wheels, color, fuel_varient);
				
				list.add(dto);
			}
			
			
		return list;
	}catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return null;
	}

	@Override
	public List<VehicleDto> findByNameAndColor(String name, String color) {

String query="select * from vehicle where name =? and color=?";
		
		try(Connection connection=DButil.getConnection();
	     PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, name);
			statement.setString(2, color);
			
			ResultSet set=statement.executeQuery();
			List<VehicleDto> list = new ArrayList<VehicleDto>();
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name1=set.getString(2);
				String type=set.getString(3);
				int no_of_wheels=set.getInt(4);
				String color1=set.getString(5);
				String fuel_varient=set.getString(6);
				
				VehicleDto dto = new VehicleDto(id, name1, type, no_of_wheels, color1, fuel_varient);
				
				list.add(dto);
			}
			
			return list;
		
	}catch (SQLException e) {
		e.printStackTrace();
		
		return null;
	}
	}

	@Override
	public List<VehicleDto> findById(int id) {

String query="select * from vehicle where id=?";
		
		try(Connection connection=DButil.getConnection();
	     PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1, id);
			
			
			ResultSet set=statement.executeQuery();
			List<VehicleDto> list = new ArrayList<VehicleDto>();
			
			while(set.next())
			{
				int id1=set.getInt(1);
				String name=set.getString(2);
				String type=set.getString(3);
				int no_of_wheels=set.getInt(4);
				String color=set.getString(5);
				String fuel_varient=set.getString(6);
				
				VehicleDto dto = new VehicleDto(id1, name, type, no_of_wheels, color, fuel_varient);
				
				list.add(dto);
			}
			
			return list;
		
	}catch (SQLException e) {
		e.printStackTrace();
		
		
		
		return null;
	}
}

	@Override
	public boolean updateNameById(String name, int id) {
       
String query=" update vehicle set name=? where id=?";
		
		try(Connection connection=DButil.getConnection();
	     PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1, name);
			statement.setInt(2, id);
			
 
			statement.executeUpdate();
	 return true;
		
		}catch (SQLException e) {
			e.printStackTrace();
			
		
		return false;
	}
	
	
	}

	@Override
	public boolean deleteById(int id) {

String query=" delete from vehicle where id=?";
		
		try(Connection connection=DButil.getConnection();
	     PreparedStatement statement = connection.prepareStatement(query);) {
			
			
			statement.setInt(1, id);
			
 
			statement.executeUpdate();
	 return true;
		
		}catch (SQLException e) {
			e.printStackTrace();
			
		
		return false;
	}
	
}
}