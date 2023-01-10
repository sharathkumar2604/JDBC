package com.xworkz.Jeans;

import com.xworkz.Jeans.dto.JeansDTO;
import com.xworkz.Jeans.repo.JeansRepo;
import com.xworkz.Jeans.repo.JeansRepoImpl;

public class JeansRunner {
	public static void main(String[] args) {
		
		JeansRepo repo = new JeansRepoImpl();
		
		JeansDTO dto1 = new JeansDTO(2,"Hilander","Black","Female","TonJeans",999);  
		JeansDTO dto2 = new JeansDTO(3,"FlyingMachine","white","male","ShadedJeans",1999);
		JeansDTO dto3 = new JeansDTO(4,"HereNow","Brown","male","CrapJeans",899);
		JeansDTO dto4 = new JeansDTO(5,"AllenSolly","DarkGreen","Female","TonJeans",699);
		JeansDTO dto5 = new JeansDTO(6,"Jack&jons","LightBlue","male","ElasticJeans",1299);
		JeansDTO dto6 = new JeansDTO(7,"Killer","Pink","Female","Jeans",969);
		JeansDTO dto7 = new JeansDTO(8,"Lee","Blackish","male","CottonJeans",1999);
		JeansDTO dto8 = new JeansDTO(9,"Levis","Purple","Kids","CottonShadeJeans",666);
		JeansDTO dto9 = new JeansDTO(10,"Louis philipee","Gray","Baby","TonJeans",799);
		
	//	repo.save(dto1);
//		repo.save(dto2);
//		repo.save(dto3);
//		repo.save(dto4);
//		repo.save(dto5);
//		repo.save(dto6);
//		repo.save(dto7);
//		repo.save(dto8);
//		repo.save(dto9);
		
	
	//repo.read();
		
		System.out.println(repo.findByName("Killer"));
		
		System.out.println(repo.findByNameAndSlno("Lee", 8));
	}

}
