package com.sunbeam;

import java.util.*;
//4. Store book details in a library in a list -- ArrayList.
//Book details: isbn(string), price(double), authorName(string), quantity(int)
//Write a menu driven (do-while + switch-case) program to
//1. Add new book in list.
//2. Display all books in forward order.
//3. Delete at book given index -- list.remove(index);
//4. Check if book with given isbn is in list or not
//5. Delete all books in list
//6. Display number of books in list
//7. Sort all books by price in desc order -- list.sort();

public class Main {

	public static int menu() {
		int choice;
		System.out.println("***************************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD BOOK");
		System.out.println("2. DISPLAY ALL BOOKS");
		System.out.println("3. CHECK IF GIVEN BOOK IS IN THE LIST ");
		System.out.println("4. DELETE SPECIFIC BOOK");
		System.out.println("5. DELETE ALL BOOKS");
		System.out.println("6. DISPLAY NUMBER OF BOOKS IN THE LIST");
		System.out.println("7. SORT ALL BOOKS BY PRICE IN DESC ORDER");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		System.out.println("***************************");
		return choice;
	}

	public static void main(String[] args) {
		
		List<Book> list=new ArrayList<>();
		int choice;
		while((choice=menu())!=0) {
			switch (choice) {
			case 1:
			{	
				Book book= new Book();
				book.acceptBook();
				list.add(book);
				
			}break;
			case 2:
			{
				for(Book b1:list) {
					System.out.println(b1);
				}
				System.out.println();
				
			}break;
			case 3 :
				{	System.out.println("Enter the ISBN to Find");
				Scanner sc= new Scanner(System.in);
				String isbn = sc.next();
				
				Book b1=new Book(isbn);
				if(list.contains(b1))// internally obj==null?return null: obj.equals();
				{
					System.out.println("In the list");
				}
				else System.out.println(b1+"Not in the list");
			}break;
			
			case 4:
			{	System.out.println("Enter the ISBN to delete ");
				Scanner sc= new Scanner(System.in);
				String isbn = sc.next();
				
				Book b1=new Book(isbn);
				System.out.println("Deleted Book : " + b1);
				list.remove(b1);
				
			}break;
			
			case 5 :
				
			{	System.out.println("All Books DELETED");
				list.clear();
				
			}break;
			
			case 6 :
			{
				System.out.println("Library Size :" + list.size());
			}break;
			
			case 7 :
			{	class bookComparator implements Comparator<Book>{

				@Override
				public int compare(Book b1, Book b2){
					int diff= Double.compare(b1.getPrice(), b2.getPrice());
				
					
					return diff;
				}
				
				
			}
			bookComparator cmp=new bookComparator();
			
			list.sort(cmp);
			for(Book b1:list) {
				System.out.println(b1);
			}
			System.out.println();
				
			}break;
			}
		}
		
		
	}

}
