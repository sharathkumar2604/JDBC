package com.xworkz.telivison.repositary;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.telivison.dto.TelivisionDTO;

public class TelivisionRepoImpl implements TelivisionRepo {

	List<TelivisionDTO> list = new ArrayList<TelivisionDTO>();

	@Override
	public boolean save(TelivisionDTO dto) {

		list.add(dto);
		System.out.println("succesfully saved from dto class");
		return true;

	}

	@Override
	public List<TelivisionDTO> read() {

		return list;
	}

	@Override
	public TelivisionDTO FindNameBySize(int size) {
		for(TelivisionDTO find:list) {
			if(find.getSize()==size)
			{
				return find;
				
			}
		}
		System.out.println("no data");
		
		return null;
	}

	@Override
	public boolean UpdateSizeByType(int size, String type) {
		for(int i=0;i<list.size();i++)
		{
			TelivisionDTO t= list.get(i);
			if(t.getType().equals(type))
			{
			t.setSize(size);
					list.set(i, t);

			}		

		}

		
		
		
		return false;
	}

	@Override
	public boolean deleteNameByColor(String color) {

		list.remove(color);
		System.out.println("deleated done");
		
		return true;
		
	
	}

}
