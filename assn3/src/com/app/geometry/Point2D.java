package com.app.geometry;
import java.lang.Math;
import java.util.Scanner;
//Q4. Create a class Point2D , in package - "com.app.geometry" : for representing a point in x-y co-
//ordinate system. Create a parameterized constructor to init x & y co-ords. Add a method to return
//string form of point's x & y co-ords
//Hint : public String getDetails())
//Add isEqual method to Point2D class :a boolean returning method : must return true if n only if
//both points are having same x,y co-ords or false otherwise.
//Add calculateDistance method to calculate distance between current point and specified point &
//return the distance to the caller.
//Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
//Write TestPoint class , in package "tester" , with a main method, Accept co ordinates of 2 points
//from user (Scanner) --to create 2 points (p1 & p2)
//Use getDetails method to display point details.(p1's details & p2's details)
//Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same
//position)
//If they are not located at the same position , display distance between p1 & p2
//underRoot((x1-x2)^2+(y2-y1)^2)
public class Point2D {
	private int x;
	private int y;

	public Point2D() {
		this(0, 0);
	}

	public Point2D(int x, int y) {

		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	Scanner sc=new Scanner(System.in);
	
	public void acceptPoint() {
		
		System.out.print("Enter x point: ");
		this.x=sc.nextInt();
		System.out.print("Enter y point: ");
		this.y=sc.nextInt();
	}

	public String getDetials() {
//		String x1= Integer.toString(this.x,this.y);
		String s1 = this.x + "," + this.y;

		return s1;
	}

	public boolean isEqual(Point2D p1) {
		if (this.x == p1.x && this.y == p1.y) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	public double calculateDistance(Point2D p2)
	{
		return Math.sqrt(Math.pow((this.x-p2.x),2)+ Math.pow((this.y-p2.y),2));
		
	}

}
