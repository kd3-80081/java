package assn12Q1Tester;

import com.sunbeam.Emp.Emp;
import com.sunbeam.Manager.Clerk;
import com.sunbeam.Manager.Labor;
import com.sunbeam.Manager.Manager;

public class Tester {

	public static void main(String[] args) {
		Emp[] arr = new Emp[3];
		
		arr[0]=new Manager(7000, 1500);
		arr[1]=new Labor(400,100);
		arr[2]=new Clerk(12000);
		
		double total = Emp.calcTotalIncome(arr);
		System.out.println(total);
	}

}
