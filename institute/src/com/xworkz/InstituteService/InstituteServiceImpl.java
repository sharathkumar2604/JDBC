package com.xworkz.InstituteService;

import java.util.List;

import com.xworkz.Instituterepositary.InstituteRepo;
import com.xworkz.Instituterepositary.InstituteRepoImpl;
import com.xworkz.institute.InstituteDTO;

public class InstituteServiceImpl implements InstituteService {

	InstituteRepo repo = new InstituteRepoImpl();

	@Override
	public boolean save(InstituteDTO dto) {

		if(dto!=null && dto.getName().length()>=2 && dto.getLocation().length()>=2 && dto.getCourse().length()>=2 && dto.getRating()>=0 && dto.getRating()<=5)
		{
			repo.save(dto);
			System.out.println("saved");
			return true;
			
		}
		System.out.println("boli magne sariyagi hakku");
		return false;
	}

	@Override
	public List<InstituteDTO> read() {
		
		
		return repo.read(); 
	}

	@Override
	public InstituteDTO FindByName(String name) {

		if(name !=null && name.length()>=2)
		{
			
			 return repo.FindByName(name);
			 
		}
		
		
		return null;
	}

	@Override
	public List<InstituteDTO> updateNameByIndex(String name, int index) {
if(name!=null && name.length()>=2 && index>=0)
{
	return repo.updateNameByIndex(name ,index);
	
  	
}
		
		
		
		return null;
	}

	@Override
	public boolean updateNameByLoc(String name, String loc) {
		if(name!=null && name.length()>=2 && loc.length()>=2)
		{
			repo.updateNameByLoc(name ,loc);
			return true;
			
			
		  	
		}

		
		return false;
	}

	@Override
	public boolean deleteByIndex(int i) {
	if(i>=0)
	{
		repo.deleteByIndex(i);
		}
		
		return false;
	}

	@Override
	public boolean deleteByRating(int r) {
if(r>=0&&r<=5) {
	repo.deleteByRating(r);

return true;
}

		
		return false;
	}
	
}

