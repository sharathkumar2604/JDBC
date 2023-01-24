package com.xworkz.animalhusbandry.dto;

public class AnimalDto {
	
	private int id;
	private String name;
	private String color;
	private String type;
	private String region;
	private int span;
	
	
	public AnimalDto() {
	}


	public AnimalDto(int id, String name, String color, String type, String region, int span) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.type = type;
		this.region = region;
		this.span = span;
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


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public int getSpan() {
		return span;
	}


	public void setSpan(int span) {
		this.span = span;
	}


	@Override
	public String toString() {
		return "AnimalDto [id=" + id + ", name=" + name + ", color=" + color + ", type=" + type + ", region=" + region
				+ ", span=" + span + "]";
	}
	
	
	
	
	
	

}