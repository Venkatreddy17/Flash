package Condition;
import java.util.Scanner;
public class eligibleLicense {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age :");
		age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Your Eligible for License");
		}
		else {
			System.out.println("Your Not Eligible for License");
		}

	}

}
