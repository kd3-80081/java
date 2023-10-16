package com.app.company;

import java.util.Scanner;

public class HourlyEmployee extends Employee {

	private int hourWorked;
	private int hourlyWage;

	@Override
	public void accept() {
		System.out.println("Details of Hourly based Employee :");
		super.accept();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Hour worked by Employee : ");
		this.hourWorked = sc.nextInt();

		

		System.out.print("Enter the Hourly Wage of Employee : ");
		this.hourlyWage = sc.nextInt();
	}

	@Override
	public void earning() {
	 
		if(this.hourWorked<=40)
			System.out.println("Wage for "+this.hourWorked+" Hours"+ ":" + this.hourlyWage*this.hourWorked);
		else if(this.hourWorked>40)
		{
			System.out.println("Wage for "+this.hourWorked+" Hours + Overtime "+ ":" + (40.0 * this.hourlyWage) + (this.hourWorked-40) * this.hourlyWage*1.5);
		}
			
	}

	@Override
	public String toString() {
		return "Hourly Employee [ HourWorked = " + hourWorked + ", Hourly Wage = " + hourlyWage + ","
				+ super.toString() + "]";
	}

}
