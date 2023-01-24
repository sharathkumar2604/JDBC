package com.xworkz.fridge.repo;


import java.util.List;

import com.xworkz.fridge.dto.FridgeDto;

public interface FridgeRepo {

 public boolean saveall(FridgeDto dto);

public List<FridgeDto> read();


}
