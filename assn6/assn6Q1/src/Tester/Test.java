package Tester;

import java.util.*;

import com.app.Exception.ExceptionLineTooLong;

public class Test {

	public static void acceptString() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any String...");
		String string = sc.next();
		if (string.length() > 80) {
			throw new ExceptionLineTooLong();
		}
		else System.out.println(string);

	}

	public static void main(String[] args) {

		try {
			acceptString();

		}

		catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}
		System.out.println("Program Executed Successfully");
	}

}
