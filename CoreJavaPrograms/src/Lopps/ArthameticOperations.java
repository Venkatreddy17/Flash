package Lopps;
import java.util.Scanner;
public class ArthameticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Your Choice");
		System.out.println("+ for Subtraction");
		System.out.println("- for Subtraction");
		System.out.println("* for Multiplication");
		System.out.println("/ for Division");
		System.out.println("% for remander");
		
		 char choice=sc.next().charAt(0);
		do {
		System.out.println("Enter any Two Numbers");
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		
		double result=0;
		
		switch(choice) {
		case '+' :result =num1+num2;
		System.out.println("Addition of Two Numbers is : "+result);
		break;
		
		case '-' :result =num1-num2;
		System.out.println("Subtraction of Two Numbers is : "+result);
		break;
		
		case '*' :result =num1+num2;
		System.out.println("Multiplication of Two Numbers is : "+result);
		break;
		
		case '/' :result =num1/num2;
		System.out.println("Division of Two Numbers is : "+result);
		break;
		
		case '%' :result =num1%num2;
		System.out.println("remainder of Two Numbers is : "+result);
		break;
		
		
	    default :System.out.println("Invalid input");		
		
		
		}
		
		
	    System.out.println("Do you want continue Enter (y/n) ");
	    ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	}

	
		
		
		

	}





