package com.app.company;

import java.util.*;

public class BasePlusCommissionEmployee extends Employee {

	private int grossSales;
	private double commissionRate;
	private double baseSalary;

	@Override
	public void accept() {
		
		System.out.println("Details of Salaried + Sales based Commissioned Employee :");
		
		super.accept();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Gross sales done by Employee : ");
		this.grossSales = sc.nextInt();

		System.out.print("Enter the Commission rate of Employee : ");
		this.commissionRate = sc.nextDouble();

		System.out.print("Enter the Base Salary of Employee : ");
		this.baseSalary = sc.nextDouble();
	}

	@Override
	public void earning() {

		System.out.println("Base Salary + Commission on Gross Sales of " + this.grossSales + " : "
				+ ((this.commissionRate * this.grossSales) + this.baseSalary));

	}

	@Override
	public String toString() {
		return "BasePlusCommissionEmployee [ Gross Sales of = " + grossSales + ", Commission Rate = " + commissionRate
				+ ", Base Salary = " + baseSalary + "," + super.toString() + "]";
	}

}
