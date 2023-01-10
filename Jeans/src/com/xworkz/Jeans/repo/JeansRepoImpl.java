package com.xworkz.Jeans.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.Jeans.MysqlCredentialls;
import com.xworkz.Jeans.dto.JeansDTO;

public class JeansRepoImpl implements JeansRepo {

	@Override
	public boolean save(JeansDTO dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MysqlCredentialls.URL.getValues(),
					MysqlCredentialls.USERNAME.getValues(), MysqlCredentialls.PASSWORD.getValues());

			String query = "insert into jeans values(?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getSlno());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColor());
			statement.setString(4, dto.getToWhom());
			statement.setString(5, dto.getType());
			statement.setInt(6, dto.getCost());

			statement.executeUpdate();
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
	public JeansDTO read() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MysqlCredentialls.URL.getValues(),
					MysqlCredentialls.USERNAME.getValues(), MysqlCredentialls.PASSWORD.getValues());

			String query = "select * from jeans where slno=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 1);

			ResultSet set = statement.executeQuery();

			set.next();

			int slno = set.getInt(1);
			String name = set.getString(2);
			String color = set.getString(3);
			String toWhom = set.getString(4);
			String type = set.getString(5);
			int price = set.getInt(6);

			System.out.print("slno:" + slno + " " + "\n name:" + name + " " + "\n color:" + color + " " + "\n toWhom:"
					+ toWhom + " " + "\n type:" + type + " " + "\n price" + price);
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

		return null;
	}

	@Override
	public JeansDTO findByName(String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MysqlCredentialls.URL.getValues(),
					MysqlCredentialls.USERNAME.getValues(), MysqlCredentialls.PASSWORD.getValues());

			String query = "select * from jeans where name=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);

			ResultSet set = statement.executeQuery();

			while (set.next()) {

				int slno = set.getInt(1);
				String name1 = set.getString(2);
				String color = set.getString(3);
				String toWhom = set.getString(4);
				String type = set.getString(5);
				int price = set.getInt(6);

				JeansDTO dto = new JeansDTO(slno, name1, color, toWhom, type, price);
				return dto;
			}
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

		return null;
	}

	@Override
	public JeansDTO findByNameAndSlno(String name, int slno) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection connection = DriverManager.getConnection(MysqlCredentialls.URL.getValues(),MysqlCredentialls.USERNAME.getValues(), MysqlCredentialls.PASSWORD.getValues());

			String query = "select * from jeans where name =? and slno=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, name);
			statement.setInt(2, slno);

			ResultSet set = statement.executeQuery();

			while (set.next()) {
				int slno1 = set.getInt(1);
				String name1 = set.getString(2);
				String color = set.getString(3);
				String toWhom = set.getString(4);
				String type = set.getString(5);
				int price = set.getInt(6);

				JeansDTO dto = new JeansDTO(slno1, name1, color, toWhom, type, price);

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
