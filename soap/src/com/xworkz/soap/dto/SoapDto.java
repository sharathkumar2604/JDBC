package com.xworkz.soap.dto;

public class SoapDto {
	
	
	
private int id;
private String name;
private String price;
private String color;
private String fragrance;
private String weight;
private String typeFor;


public SoapDto() {
}


public SoapDto(int id, String name, String price, String color, String fragrance, String weight, String typeFor) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
	this.color = color;
	this.fragrance = fragrance;
	this.weight = weight;
	this.typeFor = typeFor;
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


public String getPrice() {
	return price;
}


public void setPrice(String price) {
	this.price = price;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public String getFragrance() {
	return fragrance;
}


public void setFragrance(String fragrance) {
	this.fragrance = fragrance;
}


public String getWeight() {
	return weight;
}


public void setWeight(String weight) {
	this.weight = weight;
}


public String getTypeFor() {
	return typeFor;
}


public void setTypeFor(String typeFor) {
	this.typeFor = typeFor;
}


@Override
public String toString() {
	return "SoapDto [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", fragrance=" + fragrance
			+ ", weight=" + weight + ", typeFor=" + typeFor + "]";
}




}
