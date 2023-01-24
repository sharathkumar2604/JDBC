package com.xworkz.pencil.Dto;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity //entity will tell this is dto class
@Table(name="pencils")//this will create table by the name pencils
public class PencilDto {

	@Id   //javax.persistence.Id       
	private int id;
	private String name;
	private String color;
	private String type;
	private int price;

}
