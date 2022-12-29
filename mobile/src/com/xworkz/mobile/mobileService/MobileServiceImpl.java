package com.xworkz.mobile.mobileService;

import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.mobileRepositary.MobileRepo;
import com.xworkz.mobile.mobileRepositary.MobileRepoImpl;


public class MobileServiceImpl implements MobileService {


	MobileRepo repo = new MobileRepoImpl();

	@Override
	public boolean save(MobileDTO dto) {
		System.out.println("Data is being Validated and sending to Repo");
		if (dto != null && dto.getBrand().length() >= 3) {
			System.out.println("Brand is Valid");
			if (dto.getPrice() >= 15000) {
				System.out.println("Price is Valid");
				if (dto != null && dto.getColor().length() >= 2) {
					System.out.println("Color is Valid");
					if (dto.getBattery() >= 0) {
						System.out.println("Battery is Valid");
						if (dto.getMemory() >= 128) {
							System.out.println("Memory is Valid");
							System.out.println(dto);
							repo.save(dto);

						} else {
							System.out.println("Invalid Data");
						}

					} else {
						System.out.println("Data Invalid");
					}

				} else {
					System.out.println("Data is Invalid");
				}

			} else {
				System.out.println("Invalid Data");
			}
		} else {
			System.out.println("Data Invalid");
		}
		return true;
	}

	@Override
	public List<MobileDTO> read() {
		System.out.println("Data Validating and Sending to Repo");
		return repo.read();
	}

	@Override
	public MobileDTO findByBrand(String brand) {
		System.out.println("Data Validatings");
		List<MobileDTO> read = repo.read();
		for (MobileDTO dto : read)
			if (dto != null && dto.getBrand().length() >= 2 && dto.getBrand().equals(brand)) {
				return dto;
			} else {
				System.out.println("Data Invalid");
			}
		return null;
	}

	@Override
	public boolean updateBrandByIndex(String brand, int index) {
		System.out.println("Data is Validating...");
		if (brand != null && index >= 0) {
			System.out.println("Data Validated and Sending to Repo...");
			repo.updateBrandByIndex(brand, index);
		}
		return true;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("Data Validating..");
		if (index >= 0) {
			System.out.println("Data Sending to Repo");
			repo.deleteByIndex(index);
		}
		return false;
	}
}
	