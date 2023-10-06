//2. Accept 2 double values from User (using Scanner). Check data type. If arguments are not
//doubles, supply suitable error message & terminate.
//If numbers are double values, print its average.

package assn1Q2;

import java.util.Scanner;

public class Q2Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Double numbers");
		if(sc.hasNextDouble()) {
			double n1=  sc.nextDouble();
			double n2=  sc.nextDouble();
			double avg=(n1+n2)/2;
			System.out.println("Average :" + avg);
			}
		else {
			System.out.println("Numbers aren't of double type, Enter the Double numbers");
		}

		

		}

	}

