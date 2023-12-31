package com.sunbeam.assn8_2;
import java.util.*;
public class Date implements Displayable{
	private int day;
	private int month;
	private int year;

	public Date() {
		this.day = 0;
		this.month = 0;
		this.year = 0;
	}

	public Date(int day, int month, int year) {

		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void accept() {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Day");
		this.day = sc.nextInt();
		System.out.println("Enter the Month");
		this.month= sc.nextInt();
		System.out.println("Enter the Year");
		this.year = sc.nextInt();
		
	
	}

	@Override
	public void displayable() {
		System.out.println("Date of Birth : " + this.day + "/" + this.month + "/" + this.year);
		
	}

	@Override
	public String toString() {
		
		return "Date  : " + + this.day + "/" + this.month + "/" + this.year;
	}
	
	
	
	

}
