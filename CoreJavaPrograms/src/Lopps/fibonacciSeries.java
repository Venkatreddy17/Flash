package Lopps;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		System.out.print(a + " " + b);
		for (int i = 2; i <= num; i++) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

}
