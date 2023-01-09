package com.xworkz.dogs.dto;

public class DogsDTO {

	private int Slno;
	private String name;
	private String color;
	private int height;
	private int weight;
	private String type;
	
	public DogsDTO() {
	
	}

	public DogsDTO(int slno, String name, String color, int height, int weight, String type) {
	
		this.Slno = slno;
		this.name = name;
		this.color = color;
		this.height = height;
		this.weight = weight;
		this.type = type;
	}

	
	
	public int getSlno() {
		return Slno;
	}

	public void setSlno(int slno) {
		Slno = slno;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "DogsDTO [Slno=" + Slno + ", name=" + name + ", color=" + color + ", height=" + height + ", weight="
				+ weight + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
