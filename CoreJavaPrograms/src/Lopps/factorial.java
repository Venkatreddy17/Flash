package Lopps;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factorial = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}
		System.out.println("The factorial of given number is : " + factorial);
	}

}
