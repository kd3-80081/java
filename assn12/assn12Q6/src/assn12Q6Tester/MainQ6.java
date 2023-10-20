package assn12Q6Tester;
import java.util.*;
import java.util.stream.Stream;

public class MainQ6 {

	public static void main(String[] args) {
		Random r = new Random();
		Stream<Integer> strm1 = Stream.generate(() -> r.nextInt(10)).limit(10);
		
		Integer sum = strm1.reduce(0, (a,e)-> a+e);
		System.out.println(sum);
	}		}
