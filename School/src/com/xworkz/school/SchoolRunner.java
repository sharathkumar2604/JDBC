package com.xworkz.school;

import java.util.List;

import com.xworkz.school.dto.SchoolDto;
import com.xworkz.school.repo.SchoolRepo;
import com.xworkz.school.repo.SchoolRepoImpl;

public class SchoolRunner {

	public static void main(String[] args) {
		
		SchoolRepo repo = new SchoolRepoImpl();
		
		SchoolDto dto1 = new SchoolDto(2,"D-A-V", 2000, 30,"mandya");
		SchoolDto dto2 = new SchoolDto(3,"R-A-V", 2000, 30,"manglore");
		SchoolDto dto3 = new SchoolDto(4,"M-A-V", 2000, 30,"mysore");
		SchoolDto dto4 = new SchoolDto(5,"St-thamos", 2000, 30,"udupi");
		SchoolDto dto5 = new SchoolDto(6,"Cambridge", 2000, 30,"belgam");
		SchoolDto dto6 = new SchoolDto(7,"Oxford", 2000, 30,"kolar");
		SchoolDto dto7 = new SchoolDto(8,"Orchid", 2000, 30,"malavalli");
		SchoolDto dto8 = new SchoolDto(9,"Santhanikethan", 2000, 30,"hebbal");
		SchoolDto dto9 = new SchoolDto(10,"krishna", 2000, 30,"kadapa");
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
	
	
		//List<SchoolDto> list= repo.read();
		
		for(SchoolDto scdto:repo.read())
		{
    System.out.println(scdto);
	
	  }

	System.out.println(repo.findByName("D-A-V"));
	
	}
}