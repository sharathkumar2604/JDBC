package com.xworkz.telivison.service;

import java.util.List;

import com.xworkz.telivison.dto.TelivisionDTO;
import com.xworkz.telivison.repositary.TelivisionRepo;
import com.xworkz.telivison.repositary.TelivisionRepoImpl;

public class TelivisionServiceImpl implements TelivisionService {

	TelivisionRepo repo = new TelivisionRepoImpl();

	@Override
	public boolean save(TelivisionDTO dto) {
		if (dto != null && dto.getBrandName().length() >= 3 && dto.getPrice() >= 10000.00 && dto.getSize() >= 120) {
			repo.save(dto);
			System.out.println("data sending back to repo after validation");
			return true;
		}
		return false;
	}

	@Override
	public List<TelivisionDTO> read() {

		return repo.read();
	}

	@Override
	public TelivisionDTO FindNameBySize(int size) {

		if (size != 0 && size >= 100) {

			return repo.FindNameBySize(size);

		}

		System.out.println("incorect");
		return null;
	}

	@Override
	public boolean UpdateSizeByType(int size, String type) {
		if (size >= 2 && type.length() >= 2) {
			return repo.UpdateSizeByType(size, type);

		}

		return false;
	}

	@Override
	public boolean deleteNameByColor(String color) {

		if(color.length()>=3)
		{
			repo.deleteNameByColor(color);
			}
			
			return false;
		}	

	}


