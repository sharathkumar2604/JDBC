package com.xworkz.dogs.repositary;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.dogs.dto.DogsDTO;

public class DogsRepoImpl implements DogsRepo {

	List<DogsDTO> list = new ArrayList<DogsDTO>();

	@Override
	public boolean save(DogsDTO dto) {
		list.add(dto);
		System.out.println("saved to database");
		return true;
	}

	@Override
	public List<DogsDTO> read() {
		return list;
	}

	@Override
	public DogsDTO FindByName(String name) {
//for(int i=0;i<list.size();i++)
//{
//	
//}
		for (DogsDTO dto : list) {
			if (dto.getName().equalsIgnoreCase(name)) {
				
				return dto;
			}
		}

		return null;
	}

	@Override
	public DogsDTO FindByColor(String color) {
for(int i=0;i<list.size();i++)
{
	DogsDTO dto=list.get(i);
	if(dto.getColor().equalsIgnoreCase(color))
		return dto;
	}
return null;

}
}
