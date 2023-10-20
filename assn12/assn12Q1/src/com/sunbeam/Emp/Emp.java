package com.sunbeam.Emp;

public interface Emp {
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
	
	static double calcTotalIncome(Emp arr[]) {
		double totalSal = 0.0;
		for(Emp e : arr) {
			double total= e.calcIncentives()+e.getSal();
			totalSal = totalSal + total;
		}
		return totalSal;
	}
}
