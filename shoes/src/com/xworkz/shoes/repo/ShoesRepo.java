package com.xworkz.shoes.repo;

import com.xworkz.shoes.DTO.ShoesDTO;

public interface ShoesRepo {

	public boolean save(ShoesDTO dto);
	
	public ShoesDTO read();

	public ShoesDTO findByName(String name);
	
	public ShoesDTO findByNameAndSlno(String name,int slno);

	
}
