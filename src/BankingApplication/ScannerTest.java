package BankingApplication;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String args[]) {
		Scanner  scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = scanner.nextInt();
		System.out.println("Enter charater");
		char  c = scanner.next().charAt(0);
		System.out.println("Value is "+ c);

		
	}

}
