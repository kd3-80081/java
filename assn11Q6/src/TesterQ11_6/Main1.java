package TesterQ11_6;
import java.util.*;
import java.util.Comparator;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. 
//If any book with duplicate RollNum is added, what will happen? Books are stored in which order? Solve duplicate RollNum problem.

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;


import com.sunbeam.Student;

public class Main1 {
	
	public static void accept(Student s) {
		s.acceptStudent();
		}

	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Find Student");
		System.out.println("3. Print all Student");
		System.out.println("++ ENTER THE CHOICE ++ ");
		System.out.println("++++++++++++++++++++++++++++++++++");
		Scanner sc= new Scanner(System.in);
		choice = sc.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		

//		class RollNumComparator implements Comparator<Book>{
//
//			@Override
//			public int compare(Book b1, Book b2) {
//				
//				return -(b1.getRollNum().compareTo(b2.getRollNum()));
//				//return Double.compare(b1.getPrice(), b2.getPrice());
//			}
//			
//		}
//		
//		RollNumComparator cmp = new RollNumComparator();
//
		
		int choice;
		
		Student book;
		
		LinkedHashMap<Integer,Student> map = new LinkedHashMap<>();
		
		while((choice = menu())!=0) {
			switch (choice) {
			case 1 :
			{
				book=new Student();
				accept(book);
				Student b1=map.put(book.getRollNum(), book);
				if(b1==null) {
					System.out.println("Student Added successfully");
				}
				else {
					System.out.println("Student Already Exists and the Values are overwritten");	
				}
				
				
			}break;
			
			case 2 :
				
			{	System.out.println("Enter the RollNum to find");
				Scanner sc= new Scanner(System.in);
				int RollNum = sc.nextInt();
				System.out.println(map.get(RollNum));
			}break;
			
			case 3:
			{
				//Set<Entry<String, Student>> entries=map.entrySet();
		        Set<Entry<Integer , Student>> entries = map.entrySet();
				for(Entry<Integer,Student> entry : entries) {
					System.out.println(entry);
				}
			}break;
			
			default :
				System.out.println("Wrong Choice entered");
			}
		}
			
		
		
		
		
//
//		Iterator<Book> itr1 = set.iterator();
//		while (itr1.hasNext()) {
//			System.out.println(itr1.next());
//		}
//
//		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
//		
//		Iterator<Book> itr2 = set.descendingIterator();
//		while (itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}


	}

}
