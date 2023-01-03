package com.xworkz.institute;

import com.xworkz.service.InstituteService;
import com.xworkz.service.InstituteServiceImpl;

public class Institute {
	
	public static void main(String[] are) {

		InstituteDTO dto1 = new InstituteDTO("XWorkz", "BTM", 7, 150, "Java", 5);

		InstituteDTO dto2 = new InstituteDTO("accent", "jpnagara", 8, 480, "mysql", 4);

		InstituteDTO dto3 = new InstituteDTO("Rgsss", "banshankri", 10, 300, "Testing", 3);

		InstituteDTO dto4 = new InstituteDTO("excellent", "rajajiNagara", 8, 250, ".net", 2);

		InstituteDTO dto5 = new InstituteDTO("expert", "kr market", 11, 500, "python", 4);

		InstituteDTO dto6 = new InstituteDTO("valaxy", "kormangla", 9, 200, "devops", 1);

		InstituteService service = new InstituteServiceImpl();

		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		service.save(dto6);

		System.out.println("---------Find by Location and Rating ----------");
		System.out.println(service.findByLoacationandRating("BTM", 5));

		System.out.println("---------Find by Name and Course-----------");
		System.out.println(service.findByNameAndCourse("Kod Nest", "c++"));

		System.out.println("---------Update by Location by index-----------");
		service.updateLocationByIndex("KR Market", 4);
		for (InstituteDTO data : service.read()) {
			System.out.println(data);
		}

		System.out.println("----------Update Course by Name----------");
		service.updateCourseByName("Python", "carrer");
		for (InstituteDTO data : service.read()) {
			System.out.println(data);
		}

		System.out.println("--------Deleteby Rating ----------");
		service.deleteByRating(4);

		for (InstituteDTO data : service.read()) {
			System.out.println(data);
		}

	}
}


