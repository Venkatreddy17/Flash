package arrays;
import java.util.Scanner;
public class EvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size =sc.nextInt();
		
		int a[]=new int [size];
		System.out.println("enter "+size+ " arrayElements");
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Even Elements are");
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]);
			}
		}
		

	}

}
