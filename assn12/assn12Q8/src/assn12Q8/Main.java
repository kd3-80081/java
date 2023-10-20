package assn12Q8;
import java.util.*;
import java.util.stream.IntStream;
public class Main {

	public static void main(String[] args) {
		
		IntStream s1 = IntStream.range(1, 10);
		
		System.out.println("Sum : " + s1.sum());
		
		IntStream s2 = IntStream.range(1, 10);
		
		System.out.println("Summary : " +s2.summaryStatistics());
		
		

	}

}
