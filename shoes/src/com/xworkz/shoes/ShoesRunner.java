package com.xworkz.shoes;

import com.xworkz.shoes.DTO.ShoesDTO;
import com.xworkz.shoes.repo.ShoesRepo;
import com.xworkz.shoes.repo.ShoesRepoImpl;

public class ShoesRunner {

	public static void main(String[] args) {
		
		ShoesRepo repo=new ShoesRepoImpl();
		
		ShoesDTO dto1 = new ShoesDTO(2,"Addidas","Black","Sports",1299);
		ShoesDTO dto2 = new ShoesDTO(3,"Puma","Blue","Casual",1299);
		ShoesDTO dto3 = new ShoesDTO(4,"Sparks","Brown","Sports",1299);
		ShoesDTO dto4 = new ShoesDTO(5,"Woodland","Purple","SportsAndCasual",1299);
		ShoesDTO dto5 = new ShoesDTO(6,"Reebok","Black","Sports",1299);
		ShoesDTO dto6 = new ShoesDTO(7,"Liberty","Green","Casual",1299);
		ShoesDTO dto7 = new ShoesDTO(8,"Bucati","Pink","Sports",1299);
		ShoesDTO dto8 = new ShoesDTO(9,"Lunars","Yellow","Daily",1299);
		ShoesDTO dto9 = new ShoesDTO(10,"Campus","Cream","Sports",1299);
		
		
//		repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
//		
	//	repo.read();
		
		
		//System.out.println(repo.findByName("Woodland"));
		
		System.out.println(repo.findByNameAndSlno("Woodland", 5));
		
		
		
	}
}
