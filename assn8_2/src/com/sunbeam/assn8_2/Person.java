package com.sunbeam.assn8_2;

import java.util.*;
import com.sunbeam.assn8_2.Date;

public class Person implements Displayable {
	private String name;
	

	private Date dob = new Date();

	public Person() {
		this.name = " ";
		this.dob.setDay(0);
		this.dob.setMonth(0);
		this.dob.setYear(0);
	}

	public Person(String name, Date dob) {

		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Person");
		this.name = sc.next();
		System.out.println("Enter the Date of Birth of the Person");
		this.dob.accept();
	}

	@Override
	public void displayable() {

		System.out.println("Name :" + this.name);
		System.out
				.println("Date of Birth : " + this.dob.getDay() + "/" + this.dob.getMonth() + "/" + this.dob.getYear());

	}

	@Override
	public String toString() {
		
		return "Name : " + this.name + "    Date of Birth : " + this.dob.getDay() + "/" + this.dob.getMonth() + "/" + this.dob.getYear();
	}

	
	

}
