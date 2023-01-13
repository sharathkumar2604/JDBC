package com.xworkz.watch.service;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repo.WatchRepo;
import com.xworkz.watch.repo.WatchRepoImpl;

public class WatchServiceImpl implements WatchService {

	WatchRepo repo = new WatchRepoImpl();
	@Override
	public boolean saveAll(WatchDto dto) {

		if (dto != null) {
			System.out.println("not null");
			if (dto.getId() > 0) {
				System.out.println("valid id ");
				if (dto.getName() != null) {
					System.out.println("valid name not null");
					if (dto.getColor() != null) {
						System.out.println("valid color not null");

						if (dto.getType() != null) {
							System.out.println("valid type not null");
							if (dto.getPrice() >= 999) {

								System.out.println("valid price");
								
								repo.saveAll(dto);
							} else {
								System.out.println("not valid price");
							}
						} else {
							System.out.println("color null invalid ");
						}
					} else {
						System.out.println("type null invalid ");
					}
				} else {
					System.out.println("name null invalid");
				}
			} else {
				System.out.println("invalid id");
			}}
		
			else
			{
				System.out.println("dto is null");
			}
			
	

		return false;
	}
	@Override
	public List<WatchDto> read() {

		
		
		return repo.read();
	}
	@Override
	public List<WatchDto> findByNameAndColor(String name, String color) {
if(name.length()>2&& color.length()>2) {
return	repo.findByNameAndColor(name,color);
}
		
		return null;
	}
	@Override
	public List<WatchDto> findByIdAndType(int id, String type) {

		if(id>0&& type.length()>2) {
			return	repo.findByIdAndType(id,type);
			}	
		
		return null;
	}
	
	@Override
	public boolean updateNameById(String name, int id) {
if(name.length()>2 && id>0)
{
	repo.updateNameById(name ,id);
	return true;
}
		
		return false;
	}
	@Override
	public boolean deleteByColorAndType(String color, String type) {
if(color.length()>2&&type.length()>2)
{
	repo.deleteByColorAndType(color ,type);
	}
		return false;
	}

}
