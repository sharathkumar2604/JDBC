package com.xworkz.watch.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.util.DButil;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public boolean saveAll(WatchDto dto) {

		String query="insert into watch values(?,?,?,?,?)";
		
		try(Connection connection=DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);){
		
		statement.setInt(1, dto.getId());
		statement.setString(2,dto.getName());
		statement.setString(3,dto.getColor());
		statement.setString(4,dto.getType());
		statement.setInt(5,dto.getPrice());
		
		
		statement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<WatchDto> read() {

String query="select * from watch";
		
		try(Connection connection=DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);){
		ResultSet set = statement.executeQuery();
		List<WatchDto> list = new ArrayList<WatchDto>();
		
		while(set.next())
		{
			int id =set.getInt(1);
			String name =set.getString(2);
			String color=set.getString(3);
			String type=set.getString(4);
			int price=set.getInt(5);
			
			WatchDto dto = new WatchDto(id, name, type, color, price);
		
		 list.add(dto);
		}
		
		return list;
	}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<WatchDto> findByNameAndColor(String name, String color) {
String query="select * from watch where name =? and color=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1,name);
			statement.setString(2, color);
			
			ResultSet set =statement.executeQuery();
		
			List<WatchDto> list = new ArrayList<WatchDto>();
			
			while(set.next())
			{
            int id1 =set.getInt(1);
            String name1 =set.getString(2);
            String color1=set.getString(3);
            String type=set.getString(4);
            int price=set.getInt(5);
          
            
            WatchDto dto = new WatchDto(id1, name1, type, color1, price);
            
            
            
           list.add(dto);
			}
			return list;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<WatchDto> findByIdAndType(int id, String type) {
String query="select * from watch where id =? and type=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(1,id);
			statement.setString(2, type);
			
			ResultSet set =statement.executeQuery();
		
			List<WatchDto> list = new ArrayList<WatchDto>();
			
			while(set.next())
			{
            int id1 =set.getInt(1);
            String name =set.getString(2);
            String color=set.getString(3);
            String type1=set.getString(4);
            int price=set.getInt(5);
          
            
            WatchDto dto = new WatchDto(id1, name, type1, color, price);
            
            
            
           list.add(dto);
			}
			return list;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {

String query="update watch set name =? where id=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setInt(2,id);
			statement.setString(1,name);
			
			statement.executeUpdate();
			System.out.println("updated");
			return true;
		}catch (Exception e) {
				e.printStackTrace();
			}

			return false;
		}

	@Override
	public boolean deleteByColorAndType(String color, String type) {
String query="delete from watch where color=? and type=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(2,type);
			statement.setString(1,color);
			
			statement.executeUpdate();
			System.out.println("deleted");
			return true;
		}catch (Exception e) {
				e.printStackTrace();
			}

		return false;
	}
		
	
}
