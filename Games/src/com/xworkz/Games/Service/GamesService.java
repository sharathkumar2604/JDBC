package com.xworkz.Games.Service;

import java.util.List;

import com.xworkz.Games.GamesDto;
//
public interface GamesService {
public boolean save(GamesDto dto);
	
	public List<GamesDto> read();
	
	public GamesDto findByName(String name);
	
	public boolean updateNameByIndex(String name, int num);
	
	public boolean deleteByIndex(int num);
	
	public boolean updateGameTimeByGameName(String name, String time);
	
	public boolean deletebyGameName(String name);
	
}

