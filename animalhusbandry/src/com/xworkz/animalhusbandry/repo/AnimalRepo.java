package com.xworkz.animalhusbandry.repo;

import java.util.List;

import com.xworkz.animalhusbandry.dto.AnimalDto;

public interface AnimalRepo {

	public boolean save(AnimalDto dto);

	public List<AnimalDto> read();

	public List<AnimalDto> findByName(String name);

	public List<AnimalDto> findByNameAndId(String name, int id);

    public void updateNameById(String name, int id);


}
