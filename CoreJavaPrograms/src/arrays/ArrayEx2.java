package arrays;

import java.util.Scanner;

public class ArrayEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a size of Array");
		int size =sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+ size +" array elements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			
			System.out.println(a[i]);
		}

	}

}
