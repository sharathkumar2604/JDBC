package com.xworkz.InstituteService;

import java.util.List;

import com.xworkz.institute.InstituteDTO;

public interface InstituteService {

	public boolean save(InstituteDTO dto);
	
	public List<InstituteDTO> read();
	
	public InstituteDTO FindByName(String name);
	
	public List<InstituteDTO> updateNameByIndex(String name,int index);
	
	public boolean updateNameByLoc(String name,String loc);
	
	public boolean deleteByIndex(int i);
	
	public boolean deleteByRating(int r);
	
	
	
}
