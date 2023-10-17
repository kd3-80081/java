package com.sunbeam;
import java.util.*;
public class Tester {
	
	static <T extends Number> T findMin(T[] arr) {
		
		T min=arr[0];
		
		for(T i1:arr) {
		
			if(min.doubleValue()>i1.doubleValue()) {
			min=i1;
			}
		}
		return min; 
		}
	
	public static void main(String[] args) {
		
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		
		Integer min1 = findMin(arr1);
		
		System.out.println(min1);
		
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		
		Double min2 = findMin(arr2);
		
		System.out.println(min2);
		
		Long[] arr3 = {1000l,1111l,1112l,222222222222l,223333333l,34444444444444l,35555555555l,33555555555555l,36666666666666l};
		
		Long min3 = findMin(arr3);
		
		System.out.println(min3);
		}
	
	
	
	

}
