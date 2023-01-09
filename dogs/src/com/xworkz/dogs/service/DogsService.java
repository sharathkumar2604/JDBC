package com.xworkz.dogs.service;

import java.util.List;

import com.xworkz.dogs.dto.DogsDTO;

public interface DogsService {

	public boolean save(DogsDTO dto);

	public List<DogsDTO> read();
	
	public DogsDTO FindByName(String name);
	
	public DogsDTO FindByColor(String color);
	
}

