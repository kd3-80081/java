package TesterQ4;

import com.app.geometry.*;
import java.util.*;
import com.app.geometry.*;
//Q2. Copy the Point2D class , along with the package from previous assignment.
//a) Create a class "TestPointArray1.java" in "tester" package for the following
//b) Accept , how many no of points to plot from user.
//c) Create suitable data structure
//Hint : Point2D[] points=new Point2D[sc.nextInt()];
//d) Prompt user for x & y co ordinates n store the data suitably
//Hint : for loop
//e) Supply Menu to user with various Options like following
//1. Display details of a specific point
//User i/p : index
//O/p : x & y co-ordinates should be displayed. or error message(eg : Invalid index , pls retry!!!!)
//2) Display x, y co-ordinates of all points
//Hint : for-each
//3) User i/p : 2 indices for the points , validate the indices
//Display distance between specified points (if they are not located at the same position)
//eg : sop("Enter index of strt point n end point");
//validation : boundary condition (0<=index<length-1)
//isEqual -- false --compute distance --display it.
//4. Exit

public class TestPointArray1 {

	 public static int Menu() {
		int choice;
		System.out.println("****************************************");
		System.out.println("0. EXIT.");
		System.out.println("1. DISPLAY SPECIFIC POINT.");
		System.out.println("2. DISPLAY X and Y CO-ORDINATES OF ALL POINTS.");
		System.out.println("3. CALCULATE THE DISTANCE.");
		System.out.println("_________________________________________");
		System.out.println("ENTER THE CHOICE.");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of points");
		// int indices = ;
		Point2D[] point = new Point2D[sc.nextInt()];

		for (int i = 0; i < point.length; i++) {
			point[i] = new Point2D();
		}

		for (int i = 0; i < point.length; i++) {
			int x, y;

			System.out.print("Enter the value of X : ");
			x = sc.nextInt();
			point[i].setX(x);

			System.out.print("Enter the value of Y : ");
			y = sc.nextInt();
			point[i].setY(y);
		} // forloop
		int choice;

		while ((choice = Menu()) != 0) {
			switch (choice) {
			case 1:
				int index = 0;

				System.out.println("ENTER THE SPECIFIC POINT NUMBER TO DISPLAY");
				index = sc.nextInt();

				if (index <= point.length && 0 < index) {

					System.out.println("Specific Point : " + point[index - 1].getX() + "," + point[index - 1].getY());
				} // if
				else {
					System.out.println("INVALID INDEX...... Please Retry");
				}

				// case 1
				break;

			case 2:
				int i = 1;
				for (Point2D ref : point) {
					System.out.println("Points no." + i + ":" + ref.getX() + "," + ref.getY());
					i++;
				} // for

				// case 2
				break;

			case 3:
				int p1, p2;

				System.out.print("ENTER FIRST POINT :");
				p1 = sc.nextInt();
				System.out.print("ENTER SECOND POINT :");
				p2 = sc.nextInt();

				if ((p1>=0 && p1 <= point.length ) && (p2>=0 && p2 <= point.length)) {
					if (point[p1-1].isEqual(point[p2-1])) {
						System.out.println("Two Points are Same");
					} else {
						System.out.println("Distance :" + point[p1-1].calculateDistance(point[p2-1]));
					} // else
				} else {
					System.out.println("INVALID POINT...... Please Retry");
				}

					break;

			default:
				System.out.println("WRONG CHOICE ENTERED...");

				break;
			}// switch
		} // while

	}// main

}// class
