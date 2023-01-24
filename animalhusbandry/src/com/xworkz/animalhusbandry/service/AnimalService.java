package com.xworkz.animalhusbandry.service;


import java.util.List;

import com.xworkz.animalhusbandry.dto.AnimalDto;

public interface AnimalService {
	
	
	public boolean save(AnimalDto dto);
	
	public List<AnimalDto> read();
	
	public List<AnimalDto> findByName(String name);
	
	public List<AnimalDto> findByNameAndId(String name,int id);
	

	public boolean updateNameById(String name, int id);
	
	
	
    }
