package assn13Q4Tester;

import java.io.BufferedReader;
import java.io.BufferedWriter;


import java.io.EOFException;
import java.io.FileReader;
import java.io.FileWriter;

import java.util.*;




public class MainRead {
	
	public static void readString() {
		try(FileReader fin = new FileReader("/home/sunbeam/NotePadWrite.txt")){
			try(BufferedReader brd = new BufferedReader(fin)){
				String line;
				while((line=brd.readLine())!=null) {//readLine returns null at the end of the file
					
					
					System.out.println(line);
					}
				}
			}
		
		catch(EOFException e) {
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		readString();	
		}

}
