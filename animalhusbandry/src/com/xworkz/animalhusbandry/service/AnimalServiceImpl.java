package com.xworkz.animalhusbandry.service;

import java.util.List;

import com.xworkz.animalhusbandry.dto.AnimalDto;
import com.xworkz.animalhusbandry.repo.AnimalRepo;
import com.xworkz.animalhusbandry.repo.AnimalRepoImpl;

public class AnimalServiceImpl implements AnimalService {

	
	AnimalRepo repo= new  AnimalRepoImpl();
	@Override
	public boolean save(AnimalDto dto) {

		if(dto!=null)
		{
			System.out.println("valid dto");
			if(dto.getId()>0) {
				System.out.println("valid id");
			
		 if(dto.getName()!=null)
		 {
			 System.out.println("valid name not null");
			 
			 if(dto.getColor()!=null)
			 {
				 System.out.println("valid color not null");
				 if(dto.getType()!=null)
				 {
					 System.out.println("valid type not null");
					 if(dto.getRegion()!=null)
					 {
						 System.out.println("valid region not null");
						 if(dto.getSpan()>=2)
						 {
							 System.out.println("valid span not null");
							 repo.save(dto);
							 return true;
							 
						 }
						 else
						 {
							 System.out.println("invalid span");
						 }
					 }
					 else
					 {
					 System.out.println("invalid region");
					 }
					 }
				 else
				 {
					 System.out.println("invalid type");
				 }
			 }
			 else {
				 System.out.println("invalid color");
			 }
			 }
		 else
		 {
			 System.out.println("invalid name");
		 }
		}
		else {
			System.out.println("invalid id");
		}
		}
	else {
		System.out.println("null");
	}
		
		
		
		return false;
	}
	@Override
	public List<AnimalDto> read() {

		
		return repo.read();
		}
	@Override
	public List<AnimalDto> findByName(String name) {
if(name.length()>2)
{
	 return repo.findByName(name);
}
		
		return null;
	}
	@Override
	public List<AnimalDto> findByNameAndId(String name, int id) {
if(name.length()>2&&id>0)
{
	return repo.findByNameAndId(name,id);
}
		
		
		return null;
	}
	
	@Override
	public boolean updateNameById(String name ,int id) {
		if(name.length()>2&&id>0)
		{
			repo.updateNameById(name,id);
			return true;
		}

		return false;
	}
	

}