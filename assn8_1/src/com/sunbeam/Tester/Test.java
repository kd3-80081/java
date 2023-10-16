package com.sunbeam.Tester;

import com.app.company.CommissionEmployee;
import com.app.company.Employee;
import com.app.company.HourlyEmployee;
import com.app.company.SalariedEmployee;
import com.sunbeam.Generic.Box;

public class Test {

	public static void main(String[] args) {

		Box<Employee> b1 = new Box<Employee>();

		Employee hourlyBasedEmp = new HourlyEmployee();

		b1.setObj(hourlyBasedEmp);
		b1.getObj().accept();
		System.out.println(b1.getObj().toString());
		b1.totalSal();

		Box<Employee> b2 = new Box<Employee>();

		Employee commissionEmp = new CommissionEmployee();

		b2.setObj(commissionEmp);
		b2.getObj().accept();
		System.out.println(b2.getObj().toString());
		b2.totalSal();

		Box<Employee> b3 = new Box<Employee>();

		Employee salariedEmp = new SalariedEmployee();

		b3.setObj(salariedEmp);
		b3.getObj().accept();
		System.out.println(b3.getObj().toString());
		b3.totalSal();
	}

}
