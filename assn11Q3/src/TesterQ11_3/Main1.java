package TesterQ11_3;
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

	public static void main(String[] args) {
		Book book = new Book();

//		class ISBNComparator implements Comparator<Book>{
//
//			@Override
//			public int compare(Book b1, Book b2) {
//				
//				return b1.getIsbn().compareTo(b2.getIsbn());
//				//return Double.compare(b1.getPrice(), b2.getPrice());
//			}
//			
//		}
//		
//		ISBNComparator cmp = new ISBNComparator();

		// In above assignment use LinkedHashSet instead of HashSet.
		// If any book with duplicate isbn is added, what will happen? Books are stored
		// in which order?
		
		TreeSet<Book> set = new TreeSet<>();
		set.add(new Book("1001", 1000, "kk", 17));
		set.add(new Book("1006", 7000, "rr", 16));
		set.add(new Book("1005", 4000, "ee", 15));
		set.add(new Book("1001", 3000, "ww", 14));
		set.add(new Book("1003", 1200, "qq", 13));
		set.add(new Book("1001", 1000, "kp", 12));
		// set will not overwrite the duplicate element
		// stored in sorted order
		//order has to be given by comparable or by natural ordering

		Iterator<Book> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
