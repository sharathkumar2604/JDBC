package com.xworkz.Instituterepositary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.institute.InstituteDTO;

public class InstituteRepoImpl implements InstituteRepo{

	
	List<InstituteDTO> list = new ArrayList<InstituteDTO>();
	@Override
	public boolean save(InstituteDTO dto) {

		list.add(dto);
		return true;
	}
	@Override
	public List<InstituteDTO> read() {

		return list;
		
	}
	@Override
	public InstituteDTO FindByName(String name) {
	
		for(InstituteDTO find:list) {
			if(find.getName().equals(name))
			{
				return find;
				
			}
			
		}
		System.out.println("no data");
		
		return null;
	}
	@Override
	public List<InstituteDTO> updateNameByIndex(String name, int index) {
   
		InstituteDTO dao= list.get(index);
		
dao.setName(name);
		list.set(index, dao);
		
		
		return list;
	}
	@Override
	public boolean updateNameByLoc(String name, String loc) {
for(int i=0;i<list.size();i++)
{
	InstituteDTO dao= list.get(i);
	if(dao.getLocation().equals(loc))
	{
	dao.setName(name);
			list.set(i, dao);

	}		

}
System.out.println("updated done");
return true;
		
	}
	@Override
	public boolean deleteByIndex(int i) {
list.remove(i);
		System.out.println("delated done");
		
		return true;
	}
	@Override
	public boolean deleteByRating(int r) {
Iterator<InstituteDTO> itr = list.iterator();
while(itr.hasNext())
{
	InstituteDTO ref = itr.next();
	if(ref.getRating()==r)
	{
		itr.remove();
	}
		
}
		System.out.println("deleted done");
		return true;
	}

	
	
}
