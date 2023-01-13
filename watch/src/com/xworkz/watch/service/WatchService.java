package com.xworkz.watch.service;

import com.xworkz.watch.dto.WatchDto;
import java.util.List;
public interface WatchService {

	
	public boolean saveAll( WatchDto dto);
	
	public List<WatchDto> read();
	
	public List<WatchDto> findByNameAndColor(String name,String color);
	
	public List<WatchDto> findByIdAndType(int id,String type);
	
	public boolean updateNameById(String name ,int id);
	
	public boolean deleteByColorAndType(String color,String type);
}
