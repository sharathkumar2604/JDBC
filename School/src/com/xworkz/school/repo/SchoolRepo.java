package com.xworkz.school.repo;

import java.util.List;

import com.xworkz.school.dto.SchoolDto;

public interface SchoolRepo {

	
	public boolean save(SchoolDto dto);
	
	
	public List<SchoolDto> read();
	
	public SchoolDto findByName(String name);
}
