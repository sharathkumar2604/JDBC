package com.xworkz.institute;

public class InstituteDTO {

	private String name;
	private String location;
	private String course;
	private int rating;
	private int noOfStudents;
	
	public InstituteDTO() {
	}

	public InstituteDTO(String name, String location, String course, int rating, int noOfStudents) {
		super();
		this.name = name;
		this.location = location;
		this.course = course;
		this.rating = rating;
		this.noOfStudents = noOfStudents;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}

	@Override
	public String toString() {
		return "InstituteDTO [name=" + name + ", location=" + location + ", course=" + course + ", rating=" + rating
				+ ", noOfStudents=" + noOfStudents + "]";
	}
	
	
	
	
	
	
	
}
