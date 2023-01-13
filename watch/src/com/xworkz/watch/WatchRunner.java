package com.xworkz.watch;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class WatchRunner {
	public static void main(String[] args) {

		WatchService service = new WatchServiceImpl();

		WatchDto dto2 = new WatchDto(2, "titan", "purple", "analog", 2000);
		WatchDto dto3 = new WatchDto(3, "titan", "yello", "wall clock", 9900);
		WatchDto dto4 = new WatchDto(4, "Gshock", "marron", "wall clock", 9000);
		WatchDto dto5 = new WatchDto(5, "track", "gold", "analog", 3990);
		WatchDto dto6 = new WatchDto(6, "sonta", "green", "digital", 2320);
		WatchDto dto7 = new WatchDto(7, "hmt", "cream", "analog", 2211);
		WatchDto dto8 = new WatchDto(8, "rolax", "pink", "analog", 2012);
		WatchDto dto9 = new WatchDto(9, "fossil", "orange", "smartwatch", 2012);
		WatchDto dto10 = new WatchDto(10, "boat", "blue", "smartwatch", 2011);
		WatchDto dto11 = new WatchDto(11, "boat", "blue", "wristwatch", 2012);
        
		WatchDto[] list = { dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10,dto11 };
//		for (int i = 0; i < list.length; i++) {
//			service.saveAll(list[i]);
//		}

		for (WatchDto dto : service.read()) {

			System.out.println(dto);

		}

System.out.println();
for (WatchDto dto : service.findByNameAndColor("boat","blue")) {

	System.out.println(dto);
		
	}

System.out.println();
for (WatchDto dto : service.findByIdAndType(6,"digital")) {

	System.out.println(dto);
		
	}

   service.updateNameById("noise", 5);
   
   
   service.deleteByColorAndType("blue","wristwatch");

	}}
