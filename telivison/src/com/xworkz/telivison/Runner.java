package com.xworkz.telivison;

import com.xworkz.telivison.dto.TelivisionDTO;
import com.xworkz.telivison.service.TelivisionService;
import com.xworkz.telivison.service.TelivisionServiceImpl;

public class Runner {

	public static void main(String[] args) {
		
		TelivisionService service = new  TelivisionServiceImpl();
		
		TelivisionDTO dto1= new TelivisionDTO("lenovo","lkmvaaa123",14000.00,"LED","redish", 133);
		TelivisionDTO dto2= new TelivisionDTO("relame","kmvazza132",13340.00,"QLED","black", 155);
		TelivisionDTO dto3= new TelivisionDTO("xiomi","zmerwsa131",15332.00,"PLED","orange", 144);
		TelivisionDTO dto4= new TelivisionDTO("samsung","lsdjeas111",13999.00,"LLED","maroon", 147);
		TelivisionDTO dto5= new TelivisionDTO("onida","pqlnsaww321",19000.00,"LCD","pink" ,138);
		
		System.out.println("sent to service");
		
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);
		service.save(dto5);
		
		
		for(TelivisionDTO r:service.read())
		{
			System.out.println(r);
		}
		
		
		
		
		System.out.println("\ni am find the name"+service.FindNameBySize(138));
		
		
		
		System.out.println(service.UpdateSizeByType(138, "RLCD"));
	
		for(TelivisionDTO r:service.read())
		{
			
			System.out.println(r);
		}

		
		System.out.println();
		
		service.deleteNameByColor("");
		for(TelivisionDTO r:service.read())
		{
			
			System.out.println(r);
		}
	
	
		
		
		
		
	}
}
