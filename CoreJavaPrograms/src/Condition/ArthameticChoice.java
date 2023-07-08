package Condition;

import java.util.Scanner;

public class ArthameticChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("+ for addition ");
		System.out.println("- for subtraction ");
		System.out.println("* for multiplication");
		System.out.println("/ for division");
		System.out.println("% for remainder");
		
		char choice=sc.next().charAt(0);
		
		System.out.println("Enter any Two numbers");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double result=0;
		
		switch (choice)
		{
		case '+' :result = a+b;
		System.out.println("Addition of two numbres is : "+result);
		break;
		
		case '-' :result = a-b;
		System.out.println("subtraction of two numbres is : "+result);
		break;
		
		case '*' :result = a*b;
		System.out.println("multiplication of two numbres is : "+result);
		break;
		
		case '/' :result = a/b;
		System.out.println("divison of two numbres is : "+result);
		break;
		
		case '%' :result = a%b;
		System.out.println("remainder of two numbres is : "+result);
		break;
		
		default :System.out.println("Invalid input");
		
		}

	}

}
