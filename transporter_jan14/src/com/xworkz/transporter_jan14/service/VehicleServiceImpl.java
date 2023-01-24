package com.xworkz.transporter_jan14.service;

import java.util.List;

import com.xworkz.transporter_jan14.dto.VehicleDto;
import com.xworkz.transporter_jan14.repo.VehicleRepo;
import com.xworkz.transporter_jan14.repo.VehicleRepoImpl;

public class VehicleServiceImpl implements VehicleService {

	VehicleRepo repo = new VehicleRepoImpl(); 
	@Override
	public boolean save(VehicleDto dto) {
		if (dto != null) {
			System.out.println("valid dto");

			if (dto.getId() > 0) {
				System.out.println("valid id");
				if(dto.getName()!=null) {
					System.out.println("valid dto name");
				if(dto.getType()!=null)
				{
					System.out.println("valid dto type");
					if(dto.getNo_of_wheels()>0)
				   {
               System.out.println("valid dto no of wheels");
               
               if(dto.getColor()!=null)
               {
            	   System.out.println("valid dto color");
            	   if(dto.getFuel_varient()!=null)
            	   {
            		   System.out.println("valid fuel_varient");
            		   repo.save(dto);
            		   
            	   }
            	   else {
            		   System.out.println("invalid fuel varient");
            	   }
               }
               else {
            	   System.out.println("invalid color");
               }
					}
					else {
						System.out.println("invalid no of wheels ");
					}
				}
				else {
					System.out.println("invalid type");
				}
			}
				else {
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
	public List<VehicleDto> read() {
		
		return repo.read();
	}
	@Override
	public List<VehicleDto> findByNameAndColor(String name, String color) {

		if(name.length()>2&&color.length()>2)
		{
			return repo.findByNameAndColor(name,color);
		}
		return null;
	}
	@Override
	public List<VehicleDto> findById(int id) {
if(id>0)
{
return repo.findById(id);	
}
		return null;
	}
	@Override
	public boolean updateNameById(String name, int id) {

		if(name.length()>2&&id>0)
		{
			repo.updateNameById(name,id);
			return true;
			
		}
		
		
		return false;
	}
	@Override
	public boolean deleteById(int id) {
if(id>0)
{
	repo.deleteById(id);
	return true;
}
		
		
		return false;
	}

}
