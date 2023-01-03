package com.xworkz.service;

import java.util.List;

import com.xworkz.institute.InstituteDTO;

public interface InstituteService {
	
		public boolean save(InstituteDTO dto);
		
		public List<InstituteDTO> read();
		
		public boolean updateLocationByIndex(String location, int index);
		
		public boolean updateCourseByName(String course, String name);
		
		public boolean deleteByRating(int rating);
		
		public InstituteDTO findByNameAndCourse(String name, String course);
		
		public InstituteDTO findByLoacationandRating(String location, int rating);
	}
	
	

