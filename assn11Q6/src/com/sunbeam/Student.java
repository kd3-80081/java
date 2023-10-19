package com.sunbeam;

//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. 
//If any book with duplicate isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

import java.util.*;

public class Student /*implements Comparable<Student>*/{
	
	
	private String name;
	private int rollNum;
	
	public Student() {
		this.name = "";
		this.rollNum = 0;
	}
	
	public Student(int rollNum) {
		this.rollNum=rollNum;
	}

	public Student(String name, int rollNum) {
		
		this.name = name;
		this.rollNum = rollNum;
	}

	

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Student Name :");
		this.name=sc.next();
		System.out.print("Enter the  RollNum :");
		this.rollNum=sc.nextInt();
		
	}
	
	@Override
	public String toString() {
		return "Student[ Name=" + name + ", RollNum=" + rollNum + "]";
	}
	
	
	
	
	
//	@Override
//	public int compareTo(Student other) {
//		 
//		return Integer.compare(this.rollNum, other.rollNum);
//	}

//	@Override
//	public int hashCode() {
//		int hashcode = Objects.hash(this.rollNum);
//		return hashcode;
//	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Student)
		{	Student b1= (Student)obj;
			if(this.rollNum== b1.rollNum) {
				return true;
			}
			else {return false;}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	

}
