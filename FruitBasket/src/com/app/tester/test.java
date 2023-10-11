package com.app.tester;

import java.util.*;

import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

//0. Exit
//1. Add Mango
//case 1 : boundary checking
//basket[counter++]=new Mango(nm,weight,color);
//break;
//2. Add Orange
//3. Add Apple
//NOTE : You will be adding a fresh fruit in the basket , in all of above options.
//4. Display names of all fruits in the basket.
//eg : for-each --- null checking --getName()
//5. Display name,color,weight , taste of all fresh fruits , in the basket.
//eg : for-each , null checking --toString , taste, isFresh : getter
//6. Display tastes of all stale(not fresh) fruits in the basket.
//7. Mark a fruit as stale
//i/p : index
//eg : setter : isFresh : false
//o/p : error message (in case of invalid index) or mark it stale
//8. Mark all sour fruits stale (optional)
//eg : for-each , taste --equals(String)

public class test {

	public static int Menu() {

		System.out.println("*****************************");
		System.out.println("0. EXIT");
		System.out.println("1. ADD MANGO");
		System.out.println("2. ADD ORANGE");
		System.out.println("3. ADD APPLE");
		System.out.println("4. DISPLAY NAME OF ALL FRUITS IN THE BASKET");
		System.out.println("5. DISPLAY NAME, COLOR, WEIGHT, TASTE OF ALL FRESH FRUITS IN THE BASKET");
		System.out.println("6. DISPLAY TASTES IF ALL STALE(NOT FRESH) FRUITS IN THE BASKET");
		System.out.println("7. MARK A FRUIT AS STALE");
		System.out.println("8. MARK ALL SOUR FRUITS  AS STALE");

		int choice = new Scanner(System.in).nextInt();

		return choice;
	}

	public static void main(String[] args) {

		System.out.println("Enter the size of Basket");
		int size = new Scanner(System.in).nextInt();

		Fruit basket[] = new Fruit[size];
		int choice, index = 0;
		while ((choice = Menu()) != 0) {
			switch (choice) {
			case 1:
				if (index < size) {
					basket[index] = new Mango();
					basket[index].accept();
					System.out.println("1 Mango added to basket");
					index++;
				} else
					System.out.println("Basket limit has exceeded, Can not add the more fruits..");

				break;

			case 2:
				if (index < size) {
					basket[index] = new Orange();
					basket[index].accept();
					System.out.println("1 Orange added to basket");
					index++;
				} else
					System.out.println("Basket limit has exceeded, Can not add the more fruits..");

				break;

			case 3:
				if (index < size) {
					basket[index] = new Apple();
					basket[index].accept();
					System.out.println("1 Apple added to basket");
					index++;
				} else
					System.out.println("Basket limit has exceeded, Can not add the more fruits..");

				break;

			case 4: {
				
				for (int i = 0; i < index; i++) {
					System.out.println(basket[i].toString());
				}
			}
				break;

			case 5: {
				System.out.println("All fresh Fruits are");
				for (int i = 0; i < index; i++) {
					if (basket[i].isFresh()) {

						System.out.println(basket[i].toString());
					}
				}
			}
				break;

			case 6: {
				System.out.println("All Stale Fruits are");
				for (int i = 0; i < index; i++) {
					if (!basket[i].isFresh()) {

						System.out.print(basket[i].toString());
						System.out.println(basket[i].taste());
					}
				}
			}
				break;

			case 7: {

				System.out.println("Enter the fruit number to mark as stale");
				int i = new Scanner(System.in).nextInt();
				i = i - 1;
				if (i <= index) {
					basket[i].setFresh(false);
				} else {
					System.out.println("Enter a valid Fruit number");
				}

			}
				break;
				
			case 8: {
				for (int i = 0; i < index; i++) {
					if (basket[i].taste() == "Sour") {
						basket[i].setFresh(false);
					}
				}
			}
				break;

			default:
				System.out.println("Enter a valid choice...");

			}
		}

	}

}
