package com.xworkz.shoes.DTO;

public class ShoesDTO {
	
	private int slno;
	private String name;
	private String color;
	private String type;
	private int price;

	
	public ShoesDTO() {
	
	}
	
	
	public ShoesDTO(int slno, String name, String color, String type, int price) {
		this.slno = slno;
		this.name = name;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	
	
	public int getSlno() {
		return slno;
	}
	public void setSlno(int slno) {
		this.slno = slno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ShoesDTO [slno=" + slno + ", name=" + name + ", color=" + color + ", type=" + type + ", price=" + price
				+ "]";
	}
	
	

}
