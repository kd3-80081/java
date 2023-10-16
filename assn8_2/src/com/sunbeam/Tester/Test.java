package com.sunbeam.Tester;


import com.sunbeam.assn8_2.*;
import com.sunbeam.box.Box;
public class Test {

	public static void main(String[] args) {
		Box<Person> b1= new Box<>();
		Person p1 = new Person();
		b1.setObj(p1);
		b1.getObj().accept();
		b1.getObj().displayable();
		System.out.println(b1.getObj().toString());		
	}

}
