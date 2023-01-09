package com.xworkz.dogs.repositary;

import java.util.List;

import com.xworkz.dogs.dto.DogsDTO;

public interface DogsRepo {

	public boolean save(DogsDTO dto);

	public List<DogsDTO> read();

	public DogsDTO FindByName(String name);

	public DogsDTO FindByColor(String color);

	
}
