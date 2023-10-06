package assn1Q3;

import java.util.*;
//3. Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa
//2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
//When user enters 'Generate Bill' option , display total bill & exit.

public class Q3Main {

	static int menu() {
		int choice;
		System.out.println("**************************");
		System.out.println("0. EXIT");
		System.out.println("1. Add Dosa");
		System.out.println("2. Add Samosa");
		System.out.println("3. Add Idli");
		System.out.println("4. Generate Bill");
		System.out.println("Enter the choice");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {

		int dPrice = 0;
		int iPrice = 0;
		int sPrice = 0;
		int choice;
		int dQty = 0;
		int iQty = 0;
		int sQty = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				dPrice=200; 
				iQty = iQty + 1;
				dPrice = dPrice * iQty;
				System.out.println("One Dosa added");
			}
				break;

			case 2: {
				iPrice=100;
				dQty = dQty + 1;
				iPrice = iPrice * dQty;
				System.out.println("One Idli added");
			}
				break;

			case 3: {
				sPrice=50;
				sQty = sQty + 1;
				sPrice = sPrice * sQty;
				System.out.println("One Dosa added");
			}
				break;

			case 4: {
				System.out.println("Number of Samosa : " + dQty + ", Total amt of Dosa : " + dPrice);
				System.out.println("Number of Samosa : " + iQty + ", Total amt of Idli : " + iPrice);
				System.out.println("Number of Samosa : " + sQty + ", 4Total amt of Samosa : " + sPrice);
				System.out.println("Total bill :" + (dPrice + iPrice + sPrice ));
			}
				break;
			
			default :
				System.out.println("Wrong choice entered...");
			}
		}

	}

}
