package com.sunbeam.Manager;



import com.sunbeam.Emp.Emp;

public class Manager implements Emp {

	
	private double basicSalary;
	private double dearanceAllowance;

	public Manager() {

		
		this.basicSalary = 0;
		this.dearanceAllowance = 0;
	}

	public Manager(double basicSalary, double dearanceAllowance) {

		
		this.basicSalary = basicSalary;
		this.dearanceAllowance = dearanceAllowance;
	}

	@Override
	public double getSal() {

		return this.basicSalary + this.dearanceAllowance;
	}

	@Override
	public double calcIncentives() {

		return this.basicSalary * 0.2;
	}

	
	

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearanceAllowance() {
		return dearanceAllowance;
	}

	public void setDearanceAllowance(double dearanceAllowance) {
		this.dearanceAllowance = dearanceAllowance;
	}

}
