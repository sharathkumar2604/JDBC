package com.xworkz.school.dto;

public class SchoolDto {
	
	
	private int slno;
	private String name;
	private int noOfStudents;
	private int noOfStaff;
	private String location;
	
	
	public SchoolDto() {

	}


	public SchoolDto(int slno, String name, int noOfStudents, int noOfStaff, String location) {
		this.slno = slno;
		this.name = name;
		this.noOfStudents = noOfStudents;
		this.noOfStaff = noOfStaff;
		this.location = location;
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


	public int getNoOfStudents() {
		return noOfStudents;
	}


	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}


	public int getNoOfStaff() {
		return noOfStaff;
	}


	public void setNoOfStaff(int noOfStaff) {
		this.noOfStaff = noOfStaff;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "SchoolDto [slno=" + slno + ", name=" + name + ", noOfStudents=" + noOfStudents + ", noOfStaff="
				+ noOfStaff + ", location=" + location + "]";
	}
	
	
	
	
	

}
