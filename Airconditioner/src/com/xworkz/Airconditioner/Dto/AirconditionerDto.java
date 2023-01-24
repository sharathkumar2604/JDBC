package com.xworkz.Airconditioner.Dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "coolers")
public class AirconditionerDto {
	
	@Id
	private int id;
	private String brandName;
	private String color;
	private String type;
	private int price;  	
	}


