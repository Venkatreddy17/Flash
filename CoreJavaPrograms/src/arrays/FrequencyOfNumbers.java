package arrays;

import java.util.Scanner;

public class FrequencyOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int postive, negative, zero;
		postive = negative = zero = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("enter " + size +" arrayElements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < size; i++) {
			if (a[i] > 0) {
				postive++;
			} else if (a[i] < 0) {
				negative++;
			} else {
				zero++;
			}
		}
		System.out.println("The Frequency of postive numbers : " + postive);
		System.out.println("The Frequency of negative numbers : " + negative);
		System.out.println("The Frequency of zero numbers : " + zero);

	}

}
