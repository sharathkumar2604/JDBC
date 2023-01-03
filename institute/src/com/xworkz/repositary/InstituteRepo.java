package com.xworkz.repositary;

import java.util.List;

import com.xworkz.institute.InstituteDTO;

public interface InstituteRepo {
	

		public boolean save(InstituteDTO dto);

		public List<InstituteDTO> read();

	}


