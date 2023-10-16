package com.app.company;

import java.util.Scanner;

public class CommissionEmployee extends Employee{
	
	private int grossSales;
	private double commissionRate;


	@Override
	public void accept() {
		
		System.out.println("Details of Commission based Employee :");
		super.accept();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Gross sales done by Employee : ");
		this.grossSales = sc.nextInt();


		
		System.out.print("Enter the Commission rate of Employee : ");
		this.commissionRate = sc.nextDouble();
		
		
	}

	@Override
	public void earning() {

		System.out.println("Commission on Gross Sales of "+ this.grossSales+" : " + this.commissionRate*this.grossSales);
		
	}

	@Override
	public String toString() {
		return "CommissionEmployee [Gross Sales = " + grossSales + ", Commission Rate = "+ commissionRate + ","
				+ super.toString() + "]";
	}

	
	

}
