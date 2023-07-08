package arrays;

import java.util.Scanner;

public class sumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size od array");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter " + size + "arrayElements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
		}
		System.out.println("The sum of all element in the array is " + sum);

	}

}
