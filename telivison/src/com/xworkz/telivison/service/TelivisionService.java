package com.xworkz.telivison.service;

import java.util.List;

import com.xworkz.telivison.dto.TelivisionDTO;

public interface TelivisionService {

	
	public boolean save(TelivisionDTO dto);
	
	
	public List<TelivisionDTO> read();
	
	
	public TelivisionDTO FindNameBySize(int size);
	
	public boolean UpdateSizeByType(int size,String type);

	public boolean deleteNameByColor(String color);

}
