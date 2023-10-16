package com.sunbeam.Tester;


import com.sunbeam.assn8_2.*;
import com.sunbeam.box.Box;
public class Test {
	
	public static void printDisplayableBox(Box<?extends Displayable> b)
	{
		b.getObj().displayable();
	}
	
	public static void printBox(Box<?> b) {
		System.out.println(b.getObj().toString());
	}

	public static void main(String[] args) {
		Box<Person> b1= new Box<>();
		Person p1 = new Person();
		b1.setObj(p1);
		b1.getObj().accept();
		printDisplayableBox(b1);// internally calls person.displayable
		
		Box<Date> d1= new Box<>();
		d1.setObj(new Date(23,10,1998));
		printDisplayableBox(d1);// internally calls date.Displayable
		
//		
//		Box<String>b3 = new Box<>();
//		b3.setObj("Boom");
//		printDisplayableBox(b3);
		
		printBox(b1);
		
		printBox(d1);
		
		
		
		
		
	}

}
