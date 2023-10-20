package assn12Q7Tester;
import java.util.*;
import java.util.stream.Stream;

public class MainQ6 {

	public static void main(String[] args) {
		

		
		Integer sum = Stream.iterate(1, x -> x + 1).limit(6)
				.reduce(1, (a,e)-> a*e);
		System.out.println(sum);
	}		}
