package com.sunbeam;
import java.util.*;

	class StringComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return Integer.compare(s1.length(), s2.length());
	}
	
}

public class Test {
	//Create a list of strings. Find the string with highest length using Collections.max().
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "abc", "aaaaaaaaaaaaa","ADADSSSSSSSSSSSSSSSSSSS","ghfffi", "jkl", "mno");
		
		StringComparator cmp = new StringComparator();
		
		
		System.out.println(Collections.max(list, cmp));
		
				
	}

}
