package com.xworkz.dogs.service;

import java.util.List;

import com.xworkz.dogs.dto.DogsDTO;
import com.xworkz.dogs.repositary.DogsRepo;
import com.xworkz.dogs.repositary.DogsRepoImpl;

public class DogsServiceImpl implements DogsService {
	DogsRepo repo = new DogsRepoImpl();

	@Override
	public boolean save(DogsDTO dto) {

		repo.save(dto);
		System.out.println("sent to database");
		return true;
	}

	@Override
	public List<DogsDTO> read() {
		return repo.read();
	}

	@Override
	public DogsDTO FindByName(String name) {
		if (name != null && name.length() >= 3) {
			return repo.FindByName(name);

		}
		return null;
	}

	@Override
	public DogsDTO FindByColor(String color) {
if(color!=null&&color.length()>=2)
{
	return repo.FindByColor(color);
}
return null;
	}

}
