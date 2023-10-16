package com.sunbeam.Generic;

import com.app.company.Employee;

public class Box<T extends Employee> {
	private T obj;

	public void setObj(T obj) {
		this.obj = obj;
	}

	public T getObj() {
		return this.obj;
	}
	
	public void totalSal() {
		obj.earning();
	}
	
	
	
}
