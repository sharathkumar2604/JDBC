package com.xworkz.mobile.mobileRepositary;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;

public class MobileRepoImpl  implements MobileRepo{
	
	List<MobileDTO> list = new ArrayList<MobileDTO>();

	@Override
	public boolean save(MobileDTO dto) {
		System.out.println("Data is Validated and Saving to Database");
		list.add(dto);
		return true;
	}

	@Override
	public List<MobileDTO> read() {
		System.out.println("Data Saving to Database");
		return list;
	}

	@Override
	public MobileDTO findByBrand(String brand) {
		System.out.println("Data is being Saved to Database");
		return null;
	}

	@Override
	public boolean updateBrandByIndex(String brand, int index) {
		MobileDTO dto = list.get(index);
		dto.setBrand(brand);
		list.set(index, dto);
		return false;

	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Saving to Database..");
		list.remove(index);
		return false;
	}
	
	
	
	

}
