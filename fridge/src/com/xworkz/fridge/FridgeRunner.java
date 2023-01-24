package com.xworkz.fridge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.xworkz.fridge.dto.FridgeDto;
import com.xworkz.fridge.service.FridgeService;
import com.xworkz.fridge.service.FridgeServiceImpl;

public class FridgeRunner {
	
	public static void main(String[] args) {
		
		FridgeService service = new FridgeServiceImpl();
		 
		FridgeDto dto1 = new FridgeDto(2,"LG","brown","220ltr",14000, 2);
		FridgeDto dto2 = new FridgeDto(3,"Onida","black","80ltr",4000, 2);
		FridgeDto dto3 = new FridgeDto(4,"Whirlpool","purple","120ltr",9000, 1);
		FridgeDto dto4 = new FridgeDto(5,"Samsung","brown","200ltr",11000, 1);
		FridgeDto dto5 = new FridgeDto(6,"Godrej","redBlack","250ltr",18000, 2);
		FridgeDto dto6 = new FridgeDto(7,"IFB","brownWhite","300ltr",20000, 2);
		FridgeDto dto7 = new FridgeDto(8,"Haier","maroon","180ltr",17000, 3);
		FridgeDto dto8 = new FridgeDto(9,"Croma","silver","190ltr",18000, 1);
		FridgeDto dto9 = new FridgeDto(10,"Panasonic","multicolor","400ltr",32000, 3);
		
		
//		List<FridgeDto> list = Arrays.asList(dto1,dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9);
//		
//		
//		service.saveall(list);
//		
		for(FridgeDto dto : service.read())
		{
		System.out.println(dto);
		}
		
	}
	
	
	

}
