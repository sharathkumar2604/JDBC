package com.xworkz.shirts.repo;

import java.util.List;

import com.xworkz.shirts.dto.ShirtsDto;

public interface ShirtsRepo {

	
	public boolean save(ShirtsDto dto);

public List<ShirtsDto> read();

public ShirtsDto findNameAndId(String name ,int id);


public boolean updateSizeByName(int size,String name);

public boolean deleteByColor(String color);


public boolean deleteBySizeAndName(int size,String name);



}
