package com.app.company;

import java.util.Scanner;

public class SalariedEmployee extends Employee{

		private double weeklySalary;
		
	@Override
	public void accept() {
		System.out.println("Details of Salaried Employee :");
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Weekly Salary of Employee : ");
		this.weeklySalary = sc.nextDouble();
		
	}

	@Override
	public void earning() {

		System.out.println("Monthly Salary : " + this.weeklySalary*4);
		
	}

	@Override
	public String toString() {
		return "Salaried Employee [Weekly Salary = " + weeklySalary + "," + super.toString() + "]";
	}

	
	
	
	

}
