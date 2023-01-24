package com.xworkz.transporter_jan14.service;

import java.util.List;

import com.xworkz.transporter_jan14.dto.VehicleDto;

public interface VehicleService {
	
	public boolean save(VehicleDto dto);
	
	public List<VehicleDto> read();
	
	public List<VehicleDto> findByNameAndColor(String name,String color);
 
	public List<VehicleDto> findById(int id);	
	
	public boolean updateNameById(String name,int id);
	
	public boolean deleteById(int id);

}
