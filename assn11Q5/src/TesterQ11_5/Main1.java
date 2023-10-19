package TesterQ11_5;
import java.util.*;
import java.util.Comparator;

//Store few books (hardcoded values with the Book class in previous assignment) in a HashSet and display them using iterator. 
//If any book with duplicate isbn is added, what will happen? Books are stored in which order? Solve duplicate ISBN problem.

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import com.sunbeam.Book;

public class Main1 {

	public static int menu() {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add Book");
		System.out.println("2. Find Book");
		System.out.println("++ ENTER THE CHOICE ++ ");
		System.out.println("++++++++++++++++++++++++++++++++++");
		Scanner sc= new Scanner(System.in);
		choice = sc.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		

//		class ISBNComparator implements Comparator<Book>{
//
//			@Override
//			public int compare(Book b1, Book b2) {
//				
//				return -(b1.getIsbn().compareTo(b2.getIsbn()));
//				//return Double.compare(b1.getPrice(), b2.getPrice());
//			}
//			
//		}
//		
//		ISBNComparator cmp = new ISBNComparator();
//
		
		int choice;
		
		Book book;
		
		Map<String,Book> map = new HashMap<>();
		
		while((choice = menu())!=0) {
			switch (choice) {
			case 1 :
			{
				book=new Book();
				book.acceptBook();
				Book b1=map.put(book.getIsbn(), book);
				if(b1==null) {
					System.out.println("Book Added successfully");
				}
				else {
					System.out.println("Book Already Exists and the Values are overwritten");	
				}
				
				
			}break;
			
			case 2 :
				
			{	System.out.println("Enter the ISBN to find");
				Scanner sc= new Scanner(System.in);
				String isbn = sc.next();
				System.out.println(map.get(isbn));
			}break;
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
