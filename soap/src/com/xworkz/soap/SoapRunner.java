package com.xworkz.soap;

import java.util.List;

import com.xworkz.soap.dto.SoapDto;
import com.xworkz.soap.repo.SoapRepo;
import com.xworkz.soap.repo.SoapRepoImpl;

public class SoapRunner {

	
	public static void main(String[] args) {
		
		SoapRepo repo = new SoapRepoImpl();
		
		
	SoapDto dto1= new SoapDto(2,"mysureSandal","20Rs", "brown","sandal","75grams","human");
	SoapDto dto2= new SoapDto(3,"ketokem","60Rs", "white","mild","75grams","pets");
	SoapDto dto3= new SoapDto(4,"lux","27Rs", "pink","jasmin","80grams","human");
	SoapDto dto4= new SoapDto(5,"dove","30Rs", "white","rose","150grams","human");
	SoapDto dto5= new SoapDto(6,"himalaya","100Rs", "green","neem","125grams","human");
	SoapDto dto6= new SoapDto(7,"vim","10Rs", "green","lemon","110grams","washing");
	SoapDto dto7= new SoapDto(8,"wheel","20Rs", "white","lemonAndJasmin","135grams","washing");
	SoapDto dto8= new SoapDto(9,"pathanjalli","15Rs", "cream","neem","125grams","human");
	SoapDto dto9= new SoapDto(10,"modicare","30Rs", "maroon","sandal","75grams","human");
	SoapDto dto10= new SoapDto(11,"procott","30Rs", "white","normal neem ","135grams","pets");
	
	
//	repo.save(dto1);
//	repo.save(dto2);
//	repo.save(dto3);
//	repo.save(dto4);
//	repo.save(dto5);
//	repo.save(dto6);
//	repo.save(dto7);
//	repo.save(dto8);
//	repo.save(dto9);
//	repo.save(dto10);
//	
	List<SoapDto> list= repo.read();
	for (SoapDto soapDto : list) {
		System.out.println(soapDto);
	}
	
	System.out.println();
	System.out.println(repo.findByNameAndPrice("lux", "27Rs"));
	System.out.println(repo.updateNameByPrice("rin","10Rs"));
	System.out.println(repo.updateColorAndFrangranceByName("pink","jasmin","himalaya"));

	
	
	
	System.out.println(repo.updateTypeBySlno("cat",11));
	
	}
}
