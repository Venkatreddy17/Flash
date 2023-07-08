package Lopps;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int reverseNumber = 0;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		num = sc.nextInt();

		while (num > 0) {
			int number = num % 10;
			reverseNumber = reverseNumber * 10 + number;// num%10 ;
			num = num / 10;

		}
		System.out.println("The reverse number is : "+reverseNumber);

	}

}
