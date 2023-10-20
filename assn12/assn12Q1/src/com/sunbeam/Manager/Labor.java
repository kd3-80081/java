package com.sunbeam.Manager;
import java.util.*;

import com.sunbeam.Emp.Emp;
public class Labor implements Emp{
	private int hour;
	private double rate;
	
	
	public Labor() {
	
		this.hour = 0;
		this.rate = 0;
			
		
	}


	public Labor(int hour, double rate) {
		
		this.hour = hour;
		this.rate = rate;
	}


	@Override
	public double getSal() {
		
		return this.hour*this.rate;
	}


	@Override
	public double calcIncentives() {
		
		return this.hour>300?(this.hour*this.rate)*0.05:0;
	}
	
	
	
	
}
