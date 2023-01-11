package com.xworkz.soap.repo;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;

public interface SoapRepo {

	public boolean save(SoapDto dto);

	public List<SoapDto> read();

	public SoapDto findByNameAndPrice(String name, String price);

	public boolean updateNameByPrice(String name, String price);
	public boolean updateColorAndFrangranceByName(String color,String fragrance,String name);
	
	public boolean updateTypeBySlno(String type,int slno);
	

}
