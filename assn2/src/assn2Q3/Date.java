package assn2Q3;

import java.util.*;
//Q3. Create a class called Date that includes three fields—a month (type int), a day (type int) and a
//year (type int). Provide a constructor that initializes the three instance variables and assumes that
//the values provided are correct. Provide a set and a get method for each instance
//variable. Provide a method displayDate that displays the month, day and year separated by forward
//slashes (/). Write a test application named DateTest that demonstrates class Date’s capabilities.

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		this(0, 0, 0);
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

	Scanner sc = new Scanner(System.in);

	public void acceptDate() {
		System.out.println("Enter the Date");
		System.out.print("Enter the Day :");
		this.day = sc.nextInt();
		System.out.println();
		System.out.print("Enter the Month:");
		this.month = sc.nextInt();
		System.out.println();
		System.out.print("Enter the Year :");
		this.year = sc.nextInt();

	}

	public void displayDate() {
		System.out.println("Date : " + this.day + "/" + this.month + "/" + this.year);
	}
}
