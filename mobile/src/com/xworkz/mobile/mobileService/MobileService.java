package com.xworkz.mobile.mobileService;

import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;

public interface MobileService  {

	
	public boolean save(MobileDTO dto);

	public List<MobileDTO> read();

	public MobileDTO findByBrand(String brand);

	public boolean updateBrandByIndex(String brand, int index);

	public boolean deleteByIndex(int index);

	
}
