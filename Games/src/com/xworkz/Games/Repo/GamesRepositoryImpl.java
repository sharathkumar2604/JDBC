package com.xworkz.Games.Repo;

import java.util.ArrayList;
import java.util.List;
//
import com.xworkz.Games.GamesDto;

public class GamesRepositoryImpl  implements GamesRepositary{
	List<GamesDto> database = new ArrayList<GamesDto>();
	GamesDto dto = new GamesDto();
	
	
	public boolean save(GamesDto dto) {
		System.out.println("Dto is Added to Repository");
		database.add(dto);
		return true;
	}

	public List<GamesDto> read() {
		return database;
	}

	public List<GamesDto> findByName(String name) {
		return database;
	}

	public boolean updateNameByIndex(String name, int num) {
		GamesDto dto = database.get(num);
		dto.setGameName(name);
		database.set(num, dto);
		System.out.println("Updated name by index is Sucessfull");
		return true;
	}

	public boolean deleteByIndex(int num) {
		database.remove(num);
		System.out.println("Deleted data with respect to the give index");
		return false;
	}

	public boolean updateGameTimeByGameName(String name, String time) {
		System.out.println("Inside Repository");
		for (int i = 0; i < database.size(); i++) {
			GamesDto dto = database.get(i);
			//System.out.println("Getting into if loop");
			if(dto.getGameName().equalsIgnoreCase(name)) {
				
				System.out.println("Updated Time by name Sucessfull");
				dto.setGameTime(time);
				
				database.set(i, dto);
				return true;
			}
		}
		return false;
	}

	public boolean deletebyGameName(String name) {
		for (int i = 0; i < database.size(); i++) {
			if(dto.getGameName().equalsIgnoreCase(name)) {
				database.remove(i);
				System.out.println("Delete Gam by name is completed");
				return true;		
			}
		}	
		return false;
	}

}

