package assn13Q3Tester;

import java.io.BufferedReader;
import java.io.BufferedWriter;


import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.*;



//Write a program that inputs 4 lines and stored them in a text ﬁle. Use BuﬀeredWriter class.
//for(int i=1; i<=4; i++) {
//String line = sc.nextLine();
//bwr.write(line);
//}
public class MainWrite {

	public static void writeString(Scanner sc) {
		try (FileWriter fout = new FileWriter("/home/sunbeam/NotePadWrite.txt")) {
			try (BufferedWriter bwr = new BufferedWriter(fout)) {
			
				for(int i=1; i<=4; i++) {
					System.out.println("Enter the String number " + i);
					String line = sc.nextLine();
					bwr.write(line);
					bwr.newLine();
					}
					
				}
			}
		 catch (Exception e) {

		}
		System.out.println("Strings Added");

	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		writeString(sc);


}
}
