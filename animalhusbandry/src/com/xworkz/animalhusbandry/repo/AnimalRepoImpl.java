package com.xworkz.animalhusbandry.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.exceptions.ConnectionIsClosedException;
import com.xworkz.animalhusbandry.dto.AnimalDto;
import com.xworkz.animalhusbandry.util.DButil;

public class AnimalRepoImpl implements AnimalRepo {

	@Override
	public boolean save(AnimalDto dto) {

		String query = "insert into animals values(?,?,?,?,?,?)";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColor());
			statement.setString(4, dto.getType());
			statement.setString(5, dto.getRegion());
			statement.setInt(6, dto.getSpan());

			statement.executeUpdate();

			return true;

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<AnimalDto> read() {

		String query = "select * from animals";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			ResultSet set = statement.executeQuery();
			List<AnimalDto> list = new ArrayList<AnimalDto>();

			while (set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				String color = set.getString(3);
				String type = set.getString(4);
				String region = set.getString(5);
				int span = set.getInt(6);

				AnimalDto dto = new AnimalDto(id, name, color, type, region, span);
				list.add(dto);
			}
			return list;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<AnimalDto> findByName(String name) {

		String query = "select * from animals where name =?";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, name);
			ResultSet set = statement.executeQuery();
			List<AnimalDto> list = new ArrayList<AnimalDto>();

			while (set.next()) {
				int id = set.getInt(1);
				String name1 = set.getString(2);
				String color = set.getString(3);
				String type = set.getString(4);
				String region = set.getString(5);
				int span = set.getInt(6);

				AnimalDto dto = new AnimalDto(id, name1, color, type, region, span);
				list.add(dto);
			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public List<AnimalDto> findByNameAndId(String name, int id) {

		String query = "select * from animals where name =? and id=?";
		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			statement.setString(1, name);
			statement.setInt(2, id);

			ResultSet set = statement.executeQuery();
			List<AnimalDto> list = new ArrayList<AnimalDto>();

			while (set.next()) {
				int id1 = set.getInt(1);
				String name1 = set.getString(2);
				String color = set.getString(3);
				String type = set.getString(4);
				String region = set.getString(5);
				int span = set.getInt(6);

				AnimalDto dto = new AnimalDto(id1, name1, color, type, region, span);

				list.add(dto);
			}
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public void updateNameById(String name, int id) {

		String query ="delete from animals "
		
	}

	

}
