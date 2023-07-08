package arrays;

import java.util.Scanner;

public class AvgOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumEven, sumOdd, even, odd;
		sumEven = sumOdd = even = odd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter " + size + " array elements");

		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				even++;
				sumEven = sumEven + a[i];

			} else {
				odd++;
				sumOdd = sumOdd + a[i];
			}
		}
		System.out.println("Average of even Numbers : " + sumEven / even);
		System.out.println("Average of odd Numbers : " + sumOdd / odd);

	}

}
