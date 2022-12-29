package com.xworkz.Games.Repo;

import java.util.List;

import com.xworkz.Games.GamesDto;

public interface GamesRepositary {

	public boolean save(GamesDto dto);

	public List<GamesDto> read();

	public List<GamesDto> findByName(String name);

	public boolean updateNameByIndex(String name, int num);

	public boolean deleteByIndex(int num);

	public boolean updateGameTimeByGameName(String name, String time);

	public boolean deletebyGameName(String name);
	
	

}
	
	

