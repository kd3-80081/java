package assn2Q2;

import java.util.*;
//Q2. Create a class called Employee that includes three fields—a first name (type String), a last
//name (type String) and a monthly salary (double). Provide a constructor that initializes the three
//instance variables. Provide a set and a get method for each instance variable. If the monthly salary
//is not positive, do not set its value. Write a test application named EmployeeTest that demonstrates
//class Employee’s capabilities. Create two Employee objects and display each object’s yearly salary.
//Then give each Employee a 10% raise and display each Employee’s yearly salary again.

public class Employee {
	private String fName;
	private String lName;
	private double salary;

	public Employee() {
		this(" ", " ", 0.0);
	}

	public Employee(String fName, String lName, double salary) {

		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	Scanner sc = new Scanner(System.in);

	public void accept() {
		System.out.println("Enter the Employee Details...");

		System.out.println("Enter the First Name");
		this.fName = sc.nextLine();

		System.out.println("Enter the Last Name");
		this.fName = sc.nextLine();

		System.out.println("Enter the Salary");
		this.salary = sc.nextInt();
	}

	public void display() {

		System.out.println("*************Employee Details*************");
		System.out.println();
		System.out.println("Employee Name : " + this.fName + " " + this.lName);
		System.out.println();

		if (this.salary < 0) {
			System.out.println("Salary : 0");
		} else {
			System.out.println("Monthly Salary : " + this.salary);
			System.out.println("Annual Salary after 10% increment : " + (this.salary * 12 + this.salary * 12 * 0.1));
		}
	}
}
