package com.xworkz.Airconditioner;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.xworkz.Airconditioner.Dto.AirconditionerDto;
import com.xworkz.Airconditioner.config.AirconditionerConfig;

public class AirconditionerRunner {
	public static void main(String[] args) {

		AirconditionerDto dto1 = new AirconditionerDto(1, "voltas", "white", "FullyAutomatic", 17400);
		AirconditionerDto dto2 = new AirconditionerDto(2, "Loyal", "green", "Automatic", 16400);
		AirconditionerDto dto3 = new AirconditionerDto(3, "Whirlpool", "orange", "SemiAutomatic", 14400);
		AirconditionerDto dto4 = new AirconditionerDto(4, "Samsung", "purple", "Automatic", 16800);
		AirconditionerDto dto5 = new AirconditionerDto(5, "Godrej", "black", "Nonautomatic", 9400);
		AirconditionerDto dto6 = new AirconditionerDto(6, "Onida", "marron", "FullyAutomatic", 18400);
		AirconditionerDto dto7 = new AirconditionerDto(7, "Tata", "white", "Automatic", 18400);
		AirconditionerDto dto8 = new AirconditionerDto(8, "BlueStar", "yellow", "Manual", 19400);

		Session session = AirconditionerConfig.getSessionFactory().openSession();

		org.hibernate.Transaction transaction = session.beginTransaction();

//		session.save(dto1);
//		session.save(dto2);
//		session.save(dto3);
//		session.save(dto4);
//		session.save(dto5);
//		session.save(dto6);
//		session.save(dto7);
//		session.save(dto8);
		
//		System.out.println(session.get(AirconditionerDto.class, 2));
//		
		Criteria criteria = session.createCriteria(AirconditionerDto.class);
		
		List<AirconditionerDto> list = new ArrayList<AirconditionerDto>();
		list=criteria.list();
		
		for (AirconditionerDto dto:list)
		{
			System.out.println(dto);
		}
		
		transaction.commit();
		session.close();

	}

}
