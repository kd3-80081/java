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
public class Book {
	
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;
	
	public Book() {
		this.isbn = "";
		this.price = 0.0;
		this.authorName = "";
		this.quantity = 0;
	}
	
	public Book(String isbn) {
		this.isbn=isbn;
	}

	public Book(String isbn, double price, String authorName, int quantity) {
		
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void acceptBook() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Book ISBN :");
		this.isbn=sc.next();
		System.out.print("Enter the Book Price :");
		this.price=sc.nextDouble();
		System.out.print("Enter the Book Author Name :");
		this.authorName=sc.next();
		System.out.print("Enter the Book Quantity :");
		this.quantity=sc.nextInt();
		
	}
	
	@Override
	public String toString() {
		return "Book [ISBN=" + isbn + ", Price=" + price + ", AuthorName=" + authorName + ", Quantity=" + quantity
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Book)
		{	Book b1= (Book)obj;
			if(this.isbn.equals(b1.isbn)) {
				return true;
			}
			else {return false;}
		}
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	

}
