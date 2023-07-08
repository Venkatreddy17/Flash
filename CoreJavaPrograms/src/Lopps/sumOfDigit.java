package Lopps;
import java.util.Scanner;
public class sumOfDigit {
	public static void main(String[] args) {
		int sum=0;
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		while(num>0) {
			int remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println("The sum of digits of a given number is : "+sum);
	}

}
