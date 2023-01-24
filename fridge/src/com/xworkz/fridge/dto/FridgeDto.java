package com.xworkz.fridge.dto;

public class FridgeDto {

	private int id;
	private String name;
	private String color;
	private String capacity;
	private int price;
	private int noOfCompartments;
	
	public FridgeDto() {
	}

	public FridgeDto(int id, String name, String color, String capacity, int price, int noOfCompartments) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.capacity = capacity;
		this.price = price;
		this.noOfCompartments = noOfCompartments;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNoOfCompartments() {
		return noOfCompartments;
	}

	public void setNoOfCompartments(int noOfCompartments) {
		this.noOfCompartments = noOfCompartments;
	}

	@Override
	public String toString() {
		return "FridgeDto [id=" + id + ", name=" + name + ", color=" + color + ", capacity=" + capacity + ", price="
				+ price + ", noOfCompartments=" + noOfCompartments + "]";
	}

	
	
	
	
	
	

}
