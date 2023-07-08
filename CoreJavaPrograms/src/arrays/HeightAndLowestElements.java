package arrays;

import java.util.Scanner;

public class HeightAndLowestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("enter " +size+" arrayElements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		int highest, lowest;
		highest = lowest =a[0];
		for (int i = 0; i < size; i++) {
			if (a[i] > highest) {
				highest = a[i];
			}else if (a[i] < lowest) {
				lowest = a[i];
			}

		}
		System.out.println("Highest element in array : " + highest);
		System.out.println("lowest element in array : " + lowest);

	}

}
