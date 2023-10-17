package com.sunbeam;
import java.util.*;

public class Tester {
	
	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for(int i=0; i<arr.length-1; i++) {
		for(int j=i+1; j<arr.length; j++) {
		if(c.compare(arr[i], arr[j]) > 0) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		}
		}
		}
		
		for(T ele : arr) {
		System.out.print(ele+" , ");
		}
	
}	
	
	public static void main(String[] args) {
		
		class EleComparator implements Comparator<Number> {
			

			@Override
			public int  compare(Number e1, Number e2) {
				int diff = Integer.compare(e1.intValue(), e2.intValue());	
				return diff;
			}
		}
		
//		2. A generic sort method for implementing selection sort algorithm is given below. 
//		In main(), create array of Double and sort it by calling selectionSort().
		EleComparator c = new EleComparator();
		
//		Double[] arr1 = {4.44,333.2,22.2, 66.6,77.88};
//		selectionSort(arr1, c);
		Integer[] arr2 = {22,11,66,22,66,33,88,55};
		selectionSort(arr2, c);
		
	}

}
