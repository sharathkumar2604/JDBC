package com.xworkz.tree.repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TreeRepoImpl implements TreeRepo {

	@Override
	public boolean save() {

		String username = "root";
		String password = "Sathish@123@";
		String host = "jdbc:mysql://localhost:3306/tree";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(host, username, password);

			String query = "insert into plants values(?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, 1);
			statement.setString(2, "banana");
			statement.setString(3, "green");
			statement.setString(4, "fruit");
			statement.setInt(5, 1);
			statement.setDouble(6, 5.5);

			statement.setInt(1, 2);
			statement.setString(2, "mango");
			statement.setString(3, "red");
			statement.setString(4, "fruit");
			statement.setInt(5, 100);
			statement.setDouble(6, 10);

			statement.setInt(1, 3);
			statement.setString(2, "apple");
			statement.setString(3, "redish");
			statement.setString(4, "fruit");
			statement.setInt(5, 20);
			statement.setDouble(6, 10);

			statement.setInt(1, 4);
			statement.setString(2, "guava");
			statement.setString(3, "green");
			statement.setString(4, "fruit");
			statement.setInt(5, 10);
			statement.setDouble(6, 9);

			statement.setInt(1, 5);
			statement.setString(2, "Silver");
			statement.setString(3, "Silver");
			statement.setString(4, "NonFruit");
			statement.setInt(5, 35);
			statement.setDouble(6, 19);

			statement.setInt(1, 6);
			statement.setString(2, "BramaTeak");
			statement.setString(3, "DarkBrown");
			statement.setString(4, "NonFruit");
			statement.setInt(5, 26);
			statement.setDouble(6, 44);

			statement.setInt(1, 7);
			statement.setString(2, "mapple");
			statement.setString(3, "Orange");
			statement.setString(4, "NonFruit");
			statement.setInt(5, 47);
			statement.setDouble(6, 33);

			statement.setInt(1, 8);
			statement.setString(2, "Teak");
			statement.setString(3, "Lightbrown");
			statement.setString(4, "Non fruit");
			statement.setInt(5, 30);
			statement.setDouble(6, 22);

			statement.setInt(1, 9);
			statement.setString(2, "Red sandal");
			statement.setString(3, "Reddish");
			statement.setString(4, "Nonfruit");
			statement.setInt(5, 23);
			statement.setDouble(6, 9);

			statement.setInt(1, 10);
			statement.setString(2, "Sandalwood");
			statement.setString(3, "Brown");
			statement.setString(4, "Nonfruit");
			statement.setInt(5, 20);
			statement.setDouble(6, 40);

			statement.executeUpdate();
			statement.close();

			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

}
