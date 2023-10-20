package assn12Q3Tester;

import java.util.*;

import ArithmeticInterface.Arithmetic;

//Create a functional interface Arithmetic with single abstract method double calc(double,double). Write a static method calculate() in main
//class as follows. In main(), write a menu driven program that inputs two numbers from the user and calls calculate() method with appropriate lambda
//expression (in arg3) to perform addition, subtraction, multiplication and division operations.

public class assn12Q3Test {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("0. EXIT");
		System.out.println("1. Add Double");
		System.out.println("2. Substract Double");
		System.out.println("3. Multiply Double");
		System.out.println("4. Divide Double");
		System.out.println("++ ENTER THE CHOICE ++ ");
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try {
		
		
		int choice;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {
				
				System.out.println("Enter the 1st Numbers to add");
				double num1 = sc.nextDouble();
				System.out.println("Enter the 2nd Numbers to add");
				double num2 = sc.nextDouble();
				
				calculate(num1, num2, (d1,d2)-> d1+d2);
				
			}break;
			
			case 2: {
				
				System.out.println("Enter the 1st Numbers to add");
				double num1 = sc.nextDouble();
				System.out.println("Enter the 2nd Numbers to add");
				double num2 = sc.nextDouble();
			
				calculate(num1, num2, (d1,d2)-> d1-d2);
				
			}break;
			
			case 3: {
				
				System.out.println("Enter the 1st Numbers to add");
				double num1 = sc.nextDouble();
				System.out.println("Enter the 2nd Numbers to add");
				double num2 = sc.nextDouble();
			
				calculate(num1, num2, (d1,d2)-> d1*d2);
				
			}break;
			
			case 4: {
			
				System.out.println("Enter the 1st Numbers to add");
				double num1 = sc.nextDouble();
				System.out.println("Enter the 2nd Numbers to add");
				double num2 = sc.nextDouble();
			
				calculate(num1, num2, (d1,d2)-> d1/d2);
				
			}break;
			
			default :
				System.out.println("Wrong Choice Entered");
			}//switch
		}//while
		}//try
		finally {
			sc.close();
		}
	}

}
