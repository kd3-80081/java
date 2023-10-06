package assn1Q1;

import java.util.*;

//Q1. Accept a integer number and when the program is executed print the binary, octal and
//hexadecimal equivalent of the given number.
//Sample Output:
//java Test
//Enter Number : 20
//Given Number :20
//Binary equivalent :10100
//Octal equivalent :24
//Hexadecimal equivalent :14
//Hint : Use Wrapper Class (toBinaryString() , toOctalString(), toHexString())a
public class Q1Main {

	public static void main(String[] args) {

		int num;
		System.out.println("Enter the NUmber");

		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		System.out.println("Given Number : " + num);
		System.out.println("Given Number in Binary : " + Integer.toBinaryString(num));
		System.out.println("Given Number in Octal: " + Integer.toOctalString(num));
		System.out.println("Given Number in Hex: " + Integer.toHexString(num));

	}

}
