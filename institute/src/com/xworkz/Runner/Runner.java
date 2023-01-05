package com.xworkz.Runner;

import com.xworkz.InstituteService.InstituteService;
import com.xworkz.InstituteService.InstituteServiceImpl;
import com.xworkz.institute.InstituteDTO;

public class Runner {

	public static void main(String[] args) {
		InstituteService service = new InstituteServiceImpl();
		
		
		InstituteDTO dto1= new InstituteDTO("Xworkz","BTM","java", 5, 13);
		InstituteDTO dto2= new InstituteDTO("Axisskill","Banshankari","python", 3, 18);
		InstituteDTO dto3= new InstituteDTO("accent","jpnagar","mysql", 4, 23);
		InstituteDTO dto4= new InstituteDTO("expert","krmarket","c++", 2, 10);
		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		for(InstituteDTO r:service.read())
		{
			
			System.out.println(r);
		}
		System.out.println();
		System.out.println(service.FindByName("accent"));
		
		
		System.out.println();
	service.updateNameByIndex("kodenest", 0);
		for(InstituteDTO r:service.read())
		{
			
			System.out.println(r);
		}
		
		service.updateNameByLoc("qspider", "BTM");
		
		service.deleteByIndex(0);
		for(InstituteDTO r:service.read())
		{
			
			System.out.println(r);
		}
		
		service.deleteByRating(3);
		for(InstituteDTO r:service.read())
		{
			
			System.out.println(r);
		}
		
		
	}
}
