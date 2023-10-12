package Tester;

import com.app.company.BasePlusCommissionEmployee;
import com.app.company.CommissionEmployee;
import com.app.company.Employee;
import com.app.company.HourlyEmployee;
import com.app.company.SalariedEmployee;

public class Test {

	public static void main(String[] args) {
		
		Employee salariedEmployee = new SalariedEmployee();
		Employee hourlyEmployee = new HourlyEmployee();
		Employee commissionEmployee = new CommissionEmployee();
		Employee basePlusCommissionEmployee = new BasePlusCommissionEmployee();
		
		salariedEmployee.accept();
		System.out.println(salariedEmployee.toString());
		salariedEmployee.earning();
		
		
		hourlyEmployee.accept();
		
		System.out.println();
		
		System.out.println(hourlyEmployee.toString());
		
		System.out.println();
		
		hourlyEmployee.earning();
		
		System.out.println();
		
		commissionEmployee.accept();
		
		System.out.println();
		
		System.out.println(commissionEmployee.toString());
		
		System.out.println();
		
		commissionEmployee.earning();
		
		System.out.println();
		
		basePlusCommissionEmployee.accept();
		
		System.out.println();
		
		System.out.println(basePlusCommissionEmployee.toString());
		
		System.out.println();
		
		basePlusCommissionEmployee.earning();
	}
	

}
