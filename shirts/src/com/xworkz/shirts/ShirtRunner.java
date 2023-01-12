package com.xworkz.shirts;

import java.util.List;

import com.xworkz.shirts.dto.ShirtsDto;
import com.xworkz.shirts.repo.ShirtsRepo;
import com.xworkz.shirts.repo.ShirtsRepoImpl;

public class ShirtRunner {
	
	public static void main(String[] args) {
		
		ShirtsRepo repo = new ShirtsRepoImpl();
		
		
		ShirtsDto dto2= new ShirtsDto(2, "puma", "white",44, false);
		ShirtsDto dto3= new ShirtsDto(3, "addidas", "white",40, true);
		ShirtsDto dto4= new ShirtsDto(4, "allen solly", "blue",42, true);
		ShirtsDto dto5= new ShirtsDto(5, "rikwil", "pink",32, false);
		ShirtsDto dto6= new ShirtsDto(6, "peter england", "maroon",48, true);
	
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
		

//	List<ShirtsDto> list =	repo.read();
		for(ShirtsDto list:repo.read()) {
			
		
			System.out.println(list);
		}
	System.out.println();
	System.out.println(repo.findNameAndId("addidas", 3));
	
	
	System.out.println(repo.updateSizeByName(49,"rikwil"));
	
	
	System.out.println(repo.deleteByColor("marron"));

	
	System.out.println(repo.deleteBySizeAndName(49, "rikwil"));
	
	}

}
