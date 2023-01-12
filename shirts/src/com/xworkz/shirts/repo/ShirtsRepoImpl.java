package com.xworkz.shirts.repo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.shirts.dto.ShirtsDto;
import com.xworkz.shirts.util.DButil;

public class ShirtsRepoImpl implements ShirtsRepo {

	private String brandName;
	private String name;

	@Override
	public boolean save(ShirtsDto dto) {

		String query = "insert into shirts values(?,?,?,?,?)";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getColor());
			statement.setInt(4, dto.getSize());
			statement.setBoolean(5, dto.isHasPacket());

			int status = statement.executeUpdate();
			System.out.println(status);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<ShirtsDto> read() {

		String query = "select * from shirts ";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			ResultSet set = statement.executeQuery();

			List<ShirtsDto> list = new ArrayList<ShirtsDto>();
			while (set.next()) {
				int id = set.getInt(1);
				String brandName = set.getString(2);
				String color = set.getString(3);
				int size = set.getInt(4);
				boolean hasPacket = set.getBoolean(5);

				ShirtsDto dto = new ShirtsDto(id, brandName, color, size, hasPacket);

				list.add(dto);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ShirtsDto findNameAndId(String name, int id) {
		
String query="select * from shirts where name =? and id=?";
		
		try(Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {
			
			statement.setString(1,name);
			statement.setInt(2, id);
			
			ResultSet set =statement.executeQuery();
		
			set.next();
            int id1 =set.getInt(1);
            String name1 =set.getString(2);
            String color=set.getString(3);
            int size=set.getInt(4);
            boolean hasPacket=set.getBoolean(5);
          
            
            ShirtsDto dto = new ShirtsDto(id1, name1, color, size, hasPacket);
            
            return dto;
		
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public boolean updateSizeByName(int size, String name) {
		String query = "update shirts set size=? where name=?";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, size);
			statement.setString(2, name);

			statement.executeUpdate();
			System.out.println("updated");

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByColor(String color) {

		String query = "delete from shirts where color=?";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setString(1, color);
	

			statement.executeUpdate();
			System.out.println("deleted");

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}

	@Override
	public boolean deleteBySizeAndName(int size, String name) {
		String query = "delete from shirts where size=? and name=?";

		try (Connection connection = DButil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);) {

			statement.setInt(1, size);
			statement.setString(2, name);
			
	

			statement.executeUpdate();
			System.out.println("deleted size and name");

			return true;
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
	}
}
