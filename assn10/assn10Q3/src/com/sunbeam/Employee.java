package com.sunbeam;
import java.util.*;
public class Employee {
	
	private int empId;
	private String name;
	private double salary;
	
	public Employee() {
		this.empId = 0;
		this.name = "";
		this.salary = 0;		
	}

	public Employee(int empId, String name, double salary) {
		
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee   (int empId) {
		this.empId=empId;
	}
	

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void accept() {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Employee Id :");
		this.empId=sc.nextInt();
		System.out.print("Enter the Employee Name :");
		this.name=sc.next();
		System.out.print("Enter the Employee Salary :");
		this.salary=sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Employee)
		{
			Employee emp = (Employee) obj;
			if(this.empId==emp.empId) {
				return true;
			}
			else return false;
		}
		return false;
	}


	
	
	
	
	
	
	
	
}
