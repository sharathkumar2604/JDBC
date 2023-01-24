package com.xworkz.pencil;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import com.xworkz.pencil.Dto.PencilDto;
import com.xworkz.pencil.config.PencilConfig;

public class PencilRunner {

	public static void main(String[] args) {

		PencilDto dto = new PencilDto(2,"camel","black","drawing pencil",20);
		PencilDto dto2 = new PencilDto(3,"camelin","blackwhite","drawing pencil",15);
		
		Session session = PencilConfig.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		session.save(dto);
//		session.save(dto2);
		
System.out.println(session.get(PencilDto.class, 2));
//
//
Criteria criteria = session.createCriteria(PencilDto.class);//read all
List<PencilDto> list = new ArrayList<PencilDto>();//list create to read()

list=criteria.list();

for(PencilDto dto1:list)      //foreach for line by execution
{
	System.out.println(dto1);
}

transaction.commit();




	}

}
