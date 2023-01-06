package com.xworkz.telivison.dto;

public class TelivisionDTO {

	private String brandName;
	private String model;
	private double price;
	private String color;
	private String type;
	private int size;

	public TelivisionDTO() {

	}

	public TelivisionDTO(String brandName, String model, double price, String color, String type, int size) {
		super();
		this.brandName = brandName;
		this.model = model;
		this.price = price;
		this.color = color;
		this.type = type;
		this.size = size;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "TelivisionDTO [brandName=" + brandName + ", model=" + model + ", price=" + price + ", color=" + color
				+ ", type=" + type + ", size=" + size + "]";
	}

	
	
	
}
