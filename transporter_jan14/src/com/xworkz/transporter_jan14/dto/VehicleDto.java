package com.xworkz.transporter_jan14.dto;

public class VehicleDto {


	private int id;
	private String name;
	private String type;
	private int no_of_wheels;
	private String color;
	private String fuel_varient;

	public VehicleDto() {
		
	}

	public VehicleDto(int id, String name, String type, int no_of_wheels, String color, String fuel_varient) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.no_of_wheels = no_of_wheels;
		this.color = color;
		this.fuel_varient = fuel_varient;
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

	public int getNo_of_wheels() {
		return no_of_wheels;
	}

	public void setNo_of_wheels(int no_of_wheels) {
		this.no_of_wheels = no_of_wheels;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFuel_varient() {
		return fuel_varient;
	}

	public void setFuel_varient(String fuel_varient) {
		this.fuel_varient = fuel_varient;
	}

	@Override
	public String toString() {
		return "VehicleDto [id=" + id + ", name=" + name + ", type=" + type + ", no_of_wheels=" + no_of_wheels
				+ ", color=" + color + ", fuel_varient=" + fuel_varient + "]";
	}

}
