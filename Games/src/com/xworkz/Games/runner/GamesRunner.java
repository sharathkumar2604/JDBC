package com.xworkz.Games.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.Games.GamesDto;
import com.xworkz.Games.Service.GamesService;
import com.xworkz.Games.Service.GamesServiceImpl;

public class GamesRunner {

public static void main(String[] args) {
		
		GamesDto dto = new GamesDto();
		
		GamesDto caroom = new GamesDto("caroom", 4, "40 min", true, "sharathkumar");
		
		GamesDto Cricket = new GamesDto("Cricket", 11, "6hrs", false, "sachin tendulkar");

		GamesDto running = new GamesDto("running", 9, "3min", false, "richard");
		
		GamesDto chess = new GamesDto("chess", 2, "2hrs", true, "vishwanath");
		
		GamesDto shettlecock = new GamesDto("Shettle Cock", 2, "2hrs", true, "sania mirza");
		
		
		
		GamesService service = new GamesServiceImpl();
		
		service.save(caroom);
		service.save(Cricket);
		service.save(running);
		service.save(chess);
		service.save(shettlecock);
		
		List<GamesDto> database = new ArrayList<GamesDto>();
		System.out.println("------------Read method ---------");
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("---------Find by name method -----------");
		
		System.out.println(service.findByName("Cricket"));
		
		System.out.println("--------Update by Index method----------");
		
		service.updateNameByIndex("shettlecock", 4);
		
		System.out.println("----------Find by name----------");
		
		System.out.println(service.findByName("shettlecock"));
		
		
		System.out.println("--------------Update by name----------");
 		System.out.println(service.updateGameTimeByGameName("shettlecock","4hrs" ));
 		
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
		
		System.out.println("--------------Delete by index----------");
		
		service.deleteByIndex(3);
		for(GamesDto data  : service.read()) {
			System.out.println(data);
		}
		
		
	}
}

