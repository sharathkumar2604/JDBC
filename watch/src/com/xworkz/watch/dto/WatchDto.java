package com.xworkz.watch.dto;

public class WatchDto {
	private int id;
	private String name;
	private String type;
	private String color;
	private int price;

	public WatchDto() {
	
	}

	public WatchDto(int id, String name, String type, String color, int price) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WatchDto[id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + "]";
	}
	
	
	


}
