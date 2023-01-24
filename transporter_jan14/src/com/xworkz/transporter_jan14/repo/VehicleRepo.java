package com.xworkz.transporter_jan14.repo;

import java.util.List;

import com.xworkz.transporter_jan14.dto.VehicleDto;

public interface VehicleRepo{
	
	
	public boolean save(VehicleDto dto);
	
	public List<VehicleDto> read();

	public List<VehicleDto> findByNameAndColor(String name, String color);

	public List<VehicleDto> findById(int id);

	public boolean updateNameById(String name, int id);

	public boolean deleteById(int id);


}
