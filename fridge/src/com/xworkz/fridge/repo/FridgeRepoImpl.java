package com.xworkz.fridge.repo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.fridge.dto.FridgeDto;
import com.xworkz.fridge.util.DButil;

public class FridgeRepoImpl implements FridgeRepo {

	@Override
	public boolean saveall(FridgeDto dto) {

		String query = "insert into fridge values(?,?,?,?,?,?)";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareCall(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColor());
			statement.setString(4, dto.getCapacity());
			statement.setInt(5, dto.getPrice());
			statement.setInt(6, dto.getNoOfCompartments());

			statement.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<FridgeDto> read() {


		String query = "select * from fridge ";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareCall(query);) {
		
			ResultSet set = statement.executeQuery();
			List<FridgeDto> list = new ArrayList<FridgeDto>();
			 while(set.next())
			 {
				 int id = set.getInt(1);
				 String name=set.getString(2);
				 String color =set.getString(3);
				 String capacity =set.getString(4);
				 int price =set.getInt(5);
				 int noOfCompartments=set.getInt(6);
				 
				 FridgeDto dto = new FridgeDto(id, name, color, capacity, price, noOfCompartments);
				 
				 list.add(dto);
				 
			 }
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		return null;
	}

}
