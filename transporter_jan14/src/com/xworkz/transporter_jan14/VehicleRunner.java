package com.xworkz.transporter_jan14;

import com.xworkz.transporter_jan14.dto.VehicleDto;
import com.xworkz.transporter_jan14.repo.VehicleRepo;
import com.xworkz.transporter_jan14.service.VehicleService;
import com.xworkz.transporter_jan14.service.VehicleServiceImpl;

public class VehicleRunner {

	public static void main(String[] args) {

		VehicleService service = new VehicleServiceImpl();

		VehicleDto dto2 = new VehicleDto(2, "hero", "two wheeler", 2, "black&red", "petrol");
		VehicleDto dto3 = new VehicleDto(3, "suzuki", "four wheeler", 4, "red", "diesel");
		VehicleDto dto4 = new VehicleDto(4, "kia", "four wheeler", 4, "black&red", "petrol");
		VehicleDto dto5 = new VehicleDto(5, "honda", "two wheeler", 2, "black", "petrol");
		VehicleDto dto6 = new VehicleDto(6, "hyundai", "four wheeler", 4, "white", "diesel");
		VehicleDto dto7 = new VehicleDto(7, "tvs", "four wheeler", 4, "orange", "petrol");
		VehicleDto dto8 = new VehicleDto(8, "bajaj", "two wheeler", 2, "maroon", "petrol");
		VehicleDto dto9 = new VehicleDto(9, "kawasaki", "two wheeler", 2, "black&green", "petrol");
		VehicleDto dto10 = new VehicleDto(10, "bajaj", "three wheeler", 3, "green&yellow", "cng");

		VehicleDto[] list = { dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10 };

//		for (int i = 0; i < list.length; i++) {
		
//			service.save(list[i]);
//		}
//
//		for(VehicleDto dto:service.read())
//		{
//			System.out.println(dto);
//		}
		
		
	//	System.out.println(service.findByNameAndColor("kawasaki","black&green"));
		
		
		//System.out.println(service.findById(3));
		
		//System.out.println(service.updateNameById("ducati", 5));
	
		System.out.println(service.deleteById(10));
	}
}
