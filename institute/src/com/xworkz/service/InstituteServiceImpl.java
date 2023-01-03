package com.xworkz.service;

import java.util.Iterator;
import java.util.List;

import com.xworkz.institute.InstituteDTO;
import com.xworkz.repositary.InstituteRepo;
import com.xworkz.repositary.InstituteRepoImpl;

public class InstituteServiceImpl implements InstituteService {

		InstituteRepo repo = new InstituteRepoImpl();

		@Override
		public boolean save(InstituteDTO dto) {
			if (dto != null && dto.getName().length() > 4) {
				repo.save(dto);
				return true;
			}
			return false;
		}

		@Override
		public List<InstituteDTO> read() {
			return repo.read();
		}

		@Override
		public boolean updateLocationByIndex(String location, int index) {
			if (location != null && location.length() > 3) {
				List<InstituteDTO> database = repo.read();
				if (index >= 0 && index <= database.size()) {
					InstituteDTO dto = database.get(index);
					dto.setLocation(location);
					database.set(index, dto);
					System.out.println("Update Location by Index is Done");
				} else
					System.out.println("Not found");
				return true;
			}
			return false;
		}

		@Override
		public boolean updateCourseByName(String course, String name) {
			if (course != null && course.length() > 2) {
				if (name != null && name.length() > 3) {
					List<InstituteDTO> database = repo.read();
					for (int i = 0; i < database.size(); i++) {
						InstituteDTO dto = database.get(i);
						if (dto.getName().equalsIgnoreCase(name)) {
							dto.setCourse(course);
							database.set(i, dto);
						}
					}
					System.out.println("Update Course by Name is Done");
					return true;
				}
			}
			return false;
		}

		@Override
		public boolean deleteByRating(int rating) {
			if (rating > 0 && rating <= 5) {
				Iterator<InstituteDTO> delete = repo.read().iterator();
				while (delete.hasNext()) {
					InstituteDTO dto = delete.next();
					if (dto.getRating() == rating) {
						delete.remove();
					}
				}
				System.out.println("Delete by Rating is Done");
				return true;
			}
			System.out.println("Enter Valid Input to Delete Records");
			return false;
		}

		@Override
		public InstituteDTO findByNameAndCourse(String name, String course) {
			if (name != null && name.length() >= 2) {
				if (course != null && course.length() > 2) {
					List<InstituteDTO> data = repo.read();
					for (InstituteDTO dto : data) {
						if (dto.getName().equalsIgnoreCase(name) && dto.getCourse().equalsIgnoreCase(course)) {
							return dto;
						}
					}

				}
			} else
				System.out.println("Dto not Found Based on your inputs");
			return null;
		}

		@Override
		public InstituteDTO findByLoacationandRating(String location, int rating) {
			if (location != null && location.length() >= 3) {
				if (rating >= 0 && rating <= 5) {
					List<InstituteDTO> data = repo.read();
					for (InstituteDTO dto : data) {
						if (dto.getLocation().equalsIgnoreCase(location) && dto.getRating() == rating) {
							return dto;
						}
					}
				}
			}

			System.out.println("Dto not Found Based on your inputs");
			return null;
		}

	}

