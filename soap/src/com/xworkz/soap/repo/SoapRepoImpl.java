package com.xworkz.soap.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.soap.constants.SqlCredentials;
import com.xworkz.soap.dto.SoapDto;

public class SoapRepoImpl implements SoapRepo {

	@Override
	public boolean save(SoapDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "insert into soap values(?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getPrice());
			statement.setString(4, dto.getColor());
			statement.setString(5, dto.getFragrance());
			statement.setString(6, dto.getWeight());
			statement.setString(7, dto.getWeight());

			statement.executeUpdate();
			statement.close();
			connection.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<SoapDto> read() {

		List<SoapDto> list = new ArrayList<SoapDto>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "select * from soap ";

			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int id = set.getInt("slno");
				String name = set.getString("name");
				String price = set.getString("price");
				String color = set.getString("color");
				String fragrance = set.getString("fragrance");
				String weight = set.getString("weight");
				String typeFor = set.getString("typeFor");

				SoapDto dto = new SoapDto(id, name, price, color, fragrance, weight, typeFor);

				list.add(dto);

			}
			return list;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public SoapDto findByNameAndPrice(String name, String price) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "select * from soap where name=? and price=? ";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setString(2, price);
			ResultSet set = statement.executeQuery();

			set.next();
			int id = set.getInt("slno");
			String name1 = set.getString("name");
			String price1 = set.getString("price");
			String color = set.getString("color");
			String fragrance = set.getString("fragrance");
			String weight = set.getString("weight");
			String typeFor = set.getString("typeFor");

			SoapDto dto = new SoapDto(id, name1, price1, color, fragrance, weight, typeFor);

			statement.close();
			connection.close();
			return dto;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean updateNameByPrice(String name, String price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "update  soap set name=? where price=? ";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setString(2, price);
			System.out.println("updated");
			statement.executeUpdate();
			statement.close();
			connection.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateColorAndFrangranceByName(String color, String fragrance, String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "update  soap set color=?,fragrance=? where name=? ";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, color);
			statement.setString(2, fragrance);
			statement.setString(3, name);

			System.out.println("updated");
			statement.executeUpdate();
			statement.close();
			connection.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateTypeBySlno(String type, int slno) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(SqlCredentials.URL.getValue(),
					SqlCredentials.USERNAME.getValue(), SqlCredentials.PASSWORD.getValue());

			String query = "update  soap set typeFor=? where slno=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, type);
			statement.setInt(2, slno);
			System.out.println("updated");
			statement.executeUpdate();
			statement.close();
			connection.close();

			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}
}
