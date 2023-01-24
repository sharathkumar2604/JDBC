package com.xworkz.fridge.service;

import java.util.List;

import com.xworkz.fridge.dto.FridgeDto;
import com.xworkz.fridge.repo.FridgeRepo;
import com.xworkz.fridge.repo.FridgeRepoImpl;

public class FridgeServiceImpl implements FridgeService {

	FridgeRepo repo = new FridgeRepoImpl();

	@Override
	public boolean saveall(List<FridgeDto> dto) {

		if (dto != null) {
			System.out.println("valid dto");
			for (FridgeDto fridgeDto : dto) {
				if (fridgeDto.getId() > 0) {
					System.out.println("valid id");
					if (fridgeDto.getName() != null) {
						System.out.println("valid name not null");
						if (fridgeDto.getColor() != null) {
							System.out.println("valid color not null");
							if (fridgeDto.getCapacity() != null) {
								System.out.println("valid capacity not null");
								if (fridgeDto.getPrice() >= 999) {
									System.out.println("valid price");
									if (fridgeDto.getNoOfCompartments() >= 0) {
										System.out.println("valid compartments");

										repo.saveall(fridgeDto);

									} else {
										System.out.println("invalid compartments");
									}
								} else {
									System.out.println("invalid price");
								}
							} else {
								System.out.println("invalid capacity");
							}
						} else {
							System.out.println("invalid color");
						}
					} else {
						System.out.println("invalid name");
					}
				} else {
					System.out.println("invalid id");

				}
			}

		} else {
			System.out.println("null");
		}

		return false;
	}

	@Override
	public List<FridgeDto> read() {

		return repo.read();
	}

}
