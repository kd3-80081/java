package Tester;
import assn12Q4Compare.Check;
public class Main {
	
	public static <T> int countIf(T[] arr, T key, Check<T> c ) {
		int count =0 ;
		for (T t : arr) {
			if(c.compare(t, key))
				count++;
			} 
		return count;
		}
		
		
	

	public static void main(String[] args) {
		
		Integer [] arr = {44, 77, 12,12,14,14,13,99, 22, 55, 66};
		Integer key = 50;
		
		int cnt = countIf(arr, key, (x,y)-> x < y);
		System.out.println("Count = " + cnt); 
		// 4 (because 4 elements in array are greater than given key i.e. 50)
	}

}
