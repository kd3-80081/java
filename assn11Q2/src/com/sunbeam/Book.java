package com.sunbeam;

//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. 
//If any book with duplicate isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

import java.util.*;

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
	public int hashCode() {
		int hashcode = Objects.hash(this.isbn);
		return hashcode;
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
