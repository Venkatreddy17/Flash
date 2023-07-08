package Condition;

import java.util.Scanner;

public class evenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your number");
		number = sc.nextInt();
		
		if(number % 2 ==0) {
			System.out.println("Given Number is Even");
		}
		else {
			System.out.println("Given Number is odd");
		}

	}

}
