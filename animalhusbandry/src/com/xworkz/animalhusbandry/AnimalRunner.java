package com.xworkz.animalhusbandry;

import com.xworkz.animalhusbandry.dto.AnimalDto;
import com.xworkz.animalhusbandry.service.AnimalService;
import com.xworkz.animalhusbandry.service.AnimalServiceImpl;

public class AnimalRunner {
	
	public static void main(String[] args) {
		
		
AnimalService service = new AnimalServiceImpl();

AnimalDto dto2 = new AnimalDto(2,"dog","black","nonvegetarian","indian",15);
AnimalDto dto3 = new AnimalDto(3,"buffalo","black&white","vegetarian","african",25);
AnimalDto dto4 = new AnimalDto(4,"donkey","black&white","vegetarian","london",30);
AnimalDto dto5 = new AnimalDto(5,"monekey","brown","vegetarian","american",25);
AnimalDto dto6 = new AnimalDto(6,"lion","goldenBrown","nonvegetarian","indian", 10);
AnimalDto dto7 = new AnimalDto(7,"indianTiger","brownWhite","nonvegetarian","indian",20);
AnimalDto dto8 = new AnimalDto(8,"dog","grayish","vegetarian","malaysian",15);
AnimalDto dto9 = new AnimalDto(9,"cat","white","vegetarian","russian",15);
AnimalDto dto10 = new AnimalDto(10,"peacock","blue","vegetarian","indian",23);

AnimalDto[] list= {dto2,dto3,dto4,dto5,dto6,dto7,dto8,dto9,dto10};

// for (int i=0;i<list.length;i++)
// {
//	 service.save(list[i]);
// }
 
 
// for(AnimalDto dto:service.read())
// {
//	 System.out.println(dto);
// }
 
// System.out.println(service.findByName("monekey"));


System.out.println(service.findByNameAndId("dog", 8));
}
}