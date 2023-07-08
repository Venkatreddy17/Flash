package Lopps;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		int choice; char ch;

		do {
			System.out.println("Enter a number");
			number = sc.nextInt();
			System.out.println("Enter 1 for check prime number");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				int isPrime = isPrimeNumber(number);
				if (isPrime == 0) {
					System.out.println(number + " is a not a prime");
					break;
				} else {
					System.out.println(number + " is a prime");
					break;
				}
			}
			System.out.println("Do you want to Continue (y/n)");
			ch = sc.next().charAt(0);

		} while (ch == 'y' || ch == 'Y');

	}

	public static int isPrimeNumber(int number) {
		if (number <= 1) {
			return 0;

		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return 0;
			}
		}
		return 1;

	}

}
