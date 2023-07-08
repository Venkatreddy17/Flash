package Condition;
import java.util.Scanner;
public class maximumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The First Numbers");
		a=sc.nextInt();
		System.out.println("Enter The Second Numbers");
		b=sc.nextInt();
		System.out.println("Enter The Third Numbers");
		c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("The Maximum number is"+a);
		}
		if(b>a && b>c) {
			System.out.println("The Maximum number is"+b);
		}
		else {
			System.out.println("The Maximum number is : "+c);
		}

	}

}
