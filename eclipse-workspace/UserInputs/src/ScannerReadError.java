import java.util.Scanner;

public class ScannerReadError {
	public static void main(String args[]) {
		Scanner scanner = new
				Scanner(System.in);
		System.out.println("Enter some number:");
		boolean integer = scanner.hasNextInt();
		if(integer) {
		int number = scanner.nextInt();
		System.out.println("you have entered->"+number);
		}else {
			System.out.println("you are expected to enter an integer value");
		}
		
	}

}
