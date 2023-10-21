package Main;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.sunbeam.Book;

//In menu-driven program of Books (with ArrayList - Day12 Q1) add two more menus. Save books in ﬁle and load books from ﬁle. 
//Use DataOutputStream and DataInputStream.
public class TestQ1 {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("***************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Book");
		System.out.println("2. Display all books in forward order using random acces");
		System.out.println("3. Search a book with given isbn ");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list using itr.previous");
		System.out.println("7. Sort All Books By Price In Desc Order");
		System.out.println("8. Reverse the list using Collection.reverse()");
		System.out.println("9. Save Books in file");
		System.out.println("10. Load Books from file");

		choice = sc.nextInt();
		System.out.println("***************************");
		return choice;
	}

	public static void writeBooks(List<Book> list) {

		try (FileOutputStream fout = new FileOutputStream("/home/sunbeam/Books.txt")) {
			try (DataOutputStream dout = new DataOutputStream(fout)) {
				for (Book book : list) {
					dout.writeUTF(book.getIsbn());
					dout.writeDouble(book.getPrice());
					dout.writeUTF(book.getAuthorName());
					dout.writeInt(book.getQuantity());
				}
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Books saved.");

	}

	public static void readBooks(List<Book> list) {
		try(FileInputStream fin = new FileInputStream ("/home/sunbeam/Books.txt")){
			try(DataInputStream din = new DataInputStream (fin) ){
				while(true) {
					Book b= new Book();
					b.setIsbn(din.readUTF());
					b.setPrice(din.readDouble());
					b.setAuthorName(din.readUTF());
					b.setQuantity(din.readInt());
					System.out.println(b.toString());
				}
			}
		}
		catch(EOFException e) {
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Book book;
		List<Book> list = new ArrayList<>();

//		list.add(book = new Book("1001", 290.0, "Naveen", 12));
//		list.add(book = new Book("1002", 93.0, "veen", 2));
//		list.add(book = new Book("1003", 550.0, "ren", 10));
//		list.add(book = new Book("1004", 6660.0, "peen", 18));
//		list.add(book = new Book("1005", 433.0, "kaen", 32));
//		list.add(book = new Book("1006", 320, "mav", 42));
//		list.add(book = new Book("1006", 330.0, "tas", 92));

		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {
				book = new Book();
				book.acceptBook();

				if (list.contains(book))// internally obj==null?return null: obj.equals();
				{
					System.out.println("Already exists in the list");
					Book key = new Book(book.getIsbn());
					int index = list.indexOf(key);
					list.get(index).setQuantity(list.get(index).getQuantity() + book.getQuantity());
					// search that same ISBN book, added the new Same ISBN qty in the last one
					System.out.println("Updated Book Quantity of ISBN " + list.get(index).getIsbn() + " : "
							+ list.get(index).getQuantity());
				} else
					list.add(book);

			}
				break;
			case 2: {

				for (int i = 0; i < list.size(); i++) {
					Book b = list.get(i);
					System.out.println(b);
				}

//				Iterator<Book> bItr = list.iterator();
//
//				while (bItr.hasNext()) {
//					Book b = bItr.next();
//					System.out.println(b);
//				}
//				System.out.println();

			}
				break;
			case 3: {
				System.out.println("Enter the ISBN to Find");

				String isbn = sc.next();

				Book b1 = new Book(isbn);

				int index = list.indexOf(b1);
				if (index == -1) {
					System.out.println("Book not found");
				} else {
					System.out.println(list.get(index));
				}
//				if(list.contains(b1))// internally obj==null?return null: obj.equals();
//				{
//					System.out.println("In the list");
//				}
//				else System.out.println(b1+"Not in the list");
			}
				break;

			case 4: {
				System.out.println("Enter the Specific Index to delete ");

				int index = sc.nextInt();

				System.out.println("Deleted Book : " + list.get(index - 1));
				list.remove(index - 1);

			}
				break;

			case 5: {
				System.out.println("Enter the ISBN to delete ");

				String isbn = sc.next();

				Book b1 = new Book(isbn);
				System.out.println("Deleted Book : " + b1);
				list.remove(b1);
			}
				break;

			case 6: {
				ListIterator<Book> itr = list.listIterator(list.size());
				while (itr.hasPrevious()) {
					Book e = itr.previous();
					System.out.println(e);
				}

			}
				break;

			case 7: {
//				class bookComparator implements Comparator<Book> {
//
//					@Override
//					public int compare(Book b1, Book b2) {
//						int diff = Double.compare(b1.getPrice(), b2.getPrice());
//
//						return diff;
//					}
//
//				}
//				bookComparator cmp = new bookComparator();
//
//				list.sort(cmp);
//				for (Book b1 : list) {
//					System.out.println(b1);
//				}
//				System.out.println();

			}
				break;
			case 8: {
				Collections.reverse(list);
				System.out.println(list);
				System.out.println();
			}
				break;

			case 9: {
				writeBooks(list);
			}
				break;

			case 10: {
				readBooks(list);
			}
				break;
			}
		}
		System.out.println("Thanks for using app");

	}

}
