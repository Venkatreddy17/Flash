package Lopps;
import java.util.Scanner;
public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter Any Two Numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition :"+c);
		System.out.println("Do you want continue (y/N)");
		ch=sc.next().charAt(0);
		}while(ch=='y' ||ch=='Y');
		

	}

}
