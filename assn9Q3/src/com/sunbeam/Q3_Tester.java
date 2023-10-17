package com.sunbeam;
import java.util.*;
import java.util.Arrays;

public class Q3_Tester {
	
	

//	3. Use Arrays.sort() to sort array of Students using Comparator. 
//	The 1st level sorting should be on city (desc), 2nd level sorting should be on marks (desc),
//	3rd level sorting should be on name (asc).
	
	public static void main(String[] args) {
		class Student {
			private int roll;
			private String name;
			private String city;
			private double marks;
			
			
			public Student(int roll, String name, String city, double marks) {
				super();
				this.roll = roll;
				this.name = name;
				this.city = city;
				this.marks = marks;
			}
			
			public int getRoll() {return roll;}
			public void setRoll(int roll) {this.roll = roll;}
			public String getName() {return name;}
			public void setName(String name) {this.name = name;}
			public String getCity() {return city;}
			public void setCity(String city) {this.city = city;}
			public double getMarks() {return marks;}
			public void setMarks(double marks) {this.marks = marks;}

			@Override
			public String toString() {
				return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
			}//toString

			}//class
		Student [] student = new Student[10];
		student[0]= new Student(1001,"Naveen", "Delhi", 99.9);
		student[1]= new Student(1002,"Adnan", "MP", 20.9);
		student[2]= new Student(1003,"Prashant", "UP", 40.9);
		student[3]= new Student(1004,"Himashu", "UP", 40.9);
		student[4]= new Student(1005,"Ujjwal", "Bihar", 50.9);
		student[5]= new Student(1006,"Shudhanshu", "Maharashtra", 60.9);
		student[6]= new Student(1007,"Mahesh", "Bhopal", 70.9);
		student[7]= new Student(1008,"Naveen", "Delhi", 98.9);
		student[8]= new Student(1009,"Akash", "Mumbai", 93.9);
		student[9]= new Student(1010,"Piyush", "Chitisgarh", 96.9);
		
		System.out.println("Before Sort: ");
		for (Student e : student)
			System.out.println(e);
		
		//sort by name
//		Arrays.sort(student);
//		
//		System.out.println("After Sort by Empno: ");
//		for (Student e : student)
//			System.out.println(e);
		
		//local class
		class StuNameComparator implements Comparator<Student>{

			@Override
			public int compare(Student s1, Student s2) {
				
				int diff=s2.getCity().compareTo(s1.getCity());
				//to compare String use "compareTo"
				if(diff==0) {
					diff=Double.compare(s2.getMarks(),s1.getMarks());
				} //to compare Double use "Double.compare"
				if(diff==0) {
					diff=s1.getName().compareTo(s2.getName());
				}
					return diff;
					
					
				}
				
			}
			
		//sort by name
		StuNameComparator nameComp= new StuNameComparator();
		Arrays.sort(student, nameComp);
		System.out.println("After Sort by Empno: ");
		for (Student e : student)
			System.out.println(e);
	}
		
	}


