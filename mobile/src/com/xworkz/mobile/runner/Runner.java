package com.xworkz.mobile.runner;

import java.util.List;

import com.xworkz.mobile.dto.MobileDTO;
import com.xworkz.mobile.mobileService.MobileService;
import com.xworkz.mobile.mobileService.MobileServiceImpl;

public class Runner {
	public static void main(String[] args) {

		MobileDTO dto = new MobileDTO("Realme", 18999, "Black", 5000, 128);
		MobileDTO dto1 = new MobileDTO("Oneplus", 25999, "Blue", 5500, 256);
		MobileDTO dto2 = new MobileDTO("Samsung", 20999, "Silver", 4300, 256);
		MobileDTO dto3 = new MobileDTO("Vivo", 15999, "Green", 4000, 128);
		MobileDTO dto4 = new MobileDTO("Apple", 69999, "Red", 3800, 128);

		MobileService service = new MobileServiceImpl();

		service.save(dto);
		service.save(dto1);
		service.save(dto2);
		service.save(dto3);
		service.save(dto4);

		List<MobileDTO> read = service.read();
		for (MobileDTO data : read)
			System.out.println(data);

		MobileDTO findByBrand = service.findByBrand("Samsung");
		System.out.println(findByBrand);

		boolean update = service.updateBrandByIndex("Huawei", 4);
		System.out.println(update);

		List<MobileDTO> read2 = service.read();
		for (MobileDTO mob : read2)
			System.out.println(mob);

		boolean delete = service.deleteByIndex(0);
		System.out.println(delete);

		List<MobileDTO> read3 = service.read();
		for (MobileDTO mob : read3)
			System.out.println(mob);

	}

}