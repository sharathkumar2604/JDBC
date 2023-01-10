package com.xworkz.Jeans.dto;

public class JeansDTO {

	private int slno;
	private String name;
	private String color;
	private String toWhom;
	private String type;
	private int cost;

	public JeansDTO() {

	}

	public JeansDTO(int slno, String name, String color, String toWhom, String type, int cost) {
 
		this.slno = slno;
		this.name = name;
		this.color = color;
		this.toWhom = toWhom;
		this.type = type;
		this.cost = cost;
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

	public String getToWhom() {
		return toWhom;
	}

	public void setToWhom(String toWhom) {
		this.toWhom = toWhom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "JeansDTO [slno=" + slno + ", name=" + name + ", color=" + color + ", toWhom=" + toWhom + ", type="
				+ type + ", cost=" + cost + "]";
	}

}
