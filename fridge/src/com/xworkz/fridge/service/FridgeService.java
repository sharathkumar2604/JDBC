package com.xworkz.fridge.service;

import java.util.List;

import com.xworkz.fridge.dto.FridgeDto;

public interface FridgeService {
	

public boolean saveall(List<FridgeDto> dto);

public  List<FridgeDto> read();




}
