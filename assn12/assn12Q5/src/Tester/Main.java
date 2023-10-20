package Tester;

import java.util.*;
import assn12Q5Compare.Check;

public class Main {

	public static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T t : arr) {
			if (c.compare(t, key))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		
		Integer [] arr = {44, 12,12,12,12,12,77,50, 12,12,14,14,13,99, 22, 55, 66};
		System.out.println("Enter the key to count");
		Scanner sc =new Scanner(System.in);
		Integer key =sc.nextInt();
		
		try{int cnt = countIf(arr, key, (x,y)-> x.equals(key));
		System.out.println("Count = " + cnt); 
		// 4 (because 4 elements in array are greater than given key i.e. 50)
	}
		finally {
	sc.close();		
		}
		}

}
