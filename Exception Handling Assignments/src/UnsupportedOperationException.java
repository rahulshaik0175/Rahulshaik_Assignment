import java.util.Scanner;

public class UnsupportedOperationException {
	private static Scanner scanner;

	public static void main(String[] args) throws UnsupportedOperationExcepion {
		scanner = new Scanner(System.in);
		System.out.println("Enter the Numerator");
		int num = scanner.nextInt();
		System.out.println("Enter the denominator");
		int den = scanner.nextInt();
		if(den==0) {
			throw new UnsupportedOperationExcepion(); 
		}
		int c=num/den;
		System.out.println(c);

	}

}

