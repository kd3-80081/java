package com.sunbeam.assn8_2;

import java.util.*;
import com.sunbeam.assn8_2.Date;

public class Person implements Displayable {
	private String name;
	

	private int id;

	public Person() {
		this.name = " ";
		this.id =0;
	}

	public Person(String name, int id) {

		this.name = name;
		this.id =id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name of the Person");
		this.name = sc.next();
		System.out.println("Enter the Id of the Person");
		this.id= sc.nextInt();
	}

	@Override
	public void displayable() {

		System.out.println("Name :" + this.name);
		System.out.println("Persoon id : " + this.id);

	}

	@Override
	public String toString() {
		
		return "Name : " + this.name + "    Perosn Id : " + this.id;
	}

	
	

}
