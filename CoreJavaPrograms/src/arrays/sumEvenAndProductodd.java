package arrays;

import java.util.Scanner;

public class sumEvenAndProductodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven = 0;
		int productOdd = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		int a[] = new int[size];

		System.out.println("Enter " + size +" arrayElements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				sumEven = sumEven + a[i];
			}
		}
		for (int i = 0; i < size; i++) {
			if (a[i] % 2 != 0) {
				productOdd = productOdd + a[i];
			}
		}
		System.out.println("The sum of Elements : " + sumEven);
		System.out.println("The product of Elements : " + productOdd);

	}

}
