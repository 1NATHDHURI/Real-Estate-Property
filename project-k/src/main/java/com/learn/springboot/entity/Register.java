package com.learn.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String lname;
	String email;
	long number;
	String choice;
	int area;
	String property;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(int id, String name, String lname, String email, long number, String choice, int area,
			String property) {
		super();
		this.id = id;
		this.name = name;
		this.lname = lname;
		this.email = email;
		this.number = number;
		this.choice = choice;
		this.area = area;
		this.property = property;
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
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getChoice() {
		return choice;
	}
	public void setChoice(String choice) {
		this.choice = choice;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	@Override
	public String toString() {
		return "Register [id=" + id + ", name=" + name + ", lname=" + lname + ", email=" + email + ", number=" + number
				+ ", choice=" + choice + ", area=" + area + ", property=" + property + "]";
	}
	

}
