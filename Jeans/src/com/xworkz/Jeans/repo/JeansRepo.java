package com.xworkz.Jeans.repo;

import com.xworkz.Jeans.dto.JeansDTO;

public interface JeansRepo {

	public boolean save(JeansDTO dto);
	
	public JeansDTO read();
	
	public JeansDTO findByName(String name);
	 
	public JeansDTO findByNameAndSlno(String name,int slno);
}
