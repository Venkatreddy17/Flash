package Lopps;

import java.util.Scanner;

public class NumberSquares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		for (int i = 1; i<num; i++) {
			int number =  i * i;
			System.out.println(number);
		}

	}

}
