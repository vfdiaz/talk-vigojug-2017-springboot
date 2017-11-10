package com.vigojug.springbootdemo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private String dni;
	private String name;
	private String phone;
	
	
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Person(String dni, String name, String phone) {
		super();
		this.dni = dni;
		this.name = name;
		this.phone = phone;
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
