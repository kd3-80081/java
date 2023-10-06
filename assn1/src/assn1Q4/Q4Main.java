package assn1Q4;

public class Q4Main {

	public static void pattern(int row, int col) {

		  int n = 4; // Number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print spaces for each row
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print("  "); // Two spaces for each space
	            }

	            // Print asterisks for each row
	            for (int k = 1; k <= 2 * i - 1; k++) {
	                System.out.print("* ");
	            }

	            System.out.println(); // Move to the next line
	        }
	}

	public static void main(String[] args) {

		pattern(4, 8);

	}

}
