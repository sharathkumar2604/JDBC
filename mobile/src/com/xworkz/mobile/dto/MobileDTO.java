package com.xworkz.mobile.dto;

public class MobileDTO {

	
	
		private String brand;
		private int price;
		private String color;
		private int battery;
		private int memory;

		public MobileDTO() {
		System.out.println("Default Constructor of MobileDto");
		}
	
	public MobileDTO(String brand, int price, String color, int battery, int memory) {
			super();
			this.brand = brand;
		this.price = price;
			this.color = color;
			this.battery = battery;
		this.memory = memory;
		}
	
		public String getBrand() {
			return brand;
	}
	
		public void setBrand(String brand) {
			this.brand = brand;
	}
	
		public int getPrice() {
		return price;
		}
	
		public void setPrice(int price) {
		this.price = price;
		}
	
		public String getColor() {
			return color;
	}
	
	public void setColor(String color) {
			this.color = color;
	}
	
		public int getBattery() {
			return battery;
	}
	
		public void setBattery(int battery) {
			this.battery = battery;
	}
	
		public int getMemory() {
			return memory;
	}
	
public void setMemory(int memory) {
			this.memory = memory;
	}
	
		@Override
		public String toString() {
			return "MobileDTO [brand=" + brand + ", price=" + price + ", color=" + color + ", battery=" + battery
					+ ", memory=" + memory + "]";
	}
	
		
		
	}

