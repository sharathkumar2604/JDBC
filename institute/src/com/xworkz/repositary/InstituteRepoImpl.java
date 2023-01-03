package com.xworkz.repositary;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.institute.InstituteDTO;

public class InstituteRepoImpl implements InstituteRepo {

		List<InstituteDTO> database = new ArrayList<InstituteDTO>();
			
			@Override
			public boolean save(InstituteDTO dto) {
				database.add(dto);
				return true;
			}

			@Override
			public List<InstituteDTO> read() {
				return database;
			}

		}




