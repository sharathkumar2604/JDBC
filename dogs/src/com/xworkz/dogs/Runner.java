package com.xworkz.dogs;

import com.xworkz.dogs.dto.DogsDTO;
import com.xworkz.dogs.service.DogsService;
import com.xworkz.dogs.service.DogsServiceImpl;

public class Runner {

	public static void main(String[] args) {

		DogsService service = new DogsServiceImpl();
		DogsDTO dto1 = new DogsDTO(1, "GermanSheperd", "BlackBrown", 2, 35, "outdoor");
		DogsDTO dto2 = new DogsDTO(2, "Boxer", "Brindal", 2, 23, "outdoor");
		DogsDTO dto3 = new DogsDTO(3, "Labordog", "White", 1, 30, "indoor");
		DogsDTO dto4 = new DogsDTO(4, "shitzu", "WhiteBrown", 1, 10, "indoor");

		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		for (DogsDTO dto : service.read()) {
			System.out.println(dto);
		}
		System.out.println(service.FindByName("germansheperd"));

		System.out.println(service.FindByColor("white"));

	}
}