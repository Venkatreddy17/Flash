package Condition;
import java.util.Scanner;
public class overLoadMethod {
	
	public double add(double num1,double num2) {
		return num1+num2;
	}
	public int add(int number1,int number2, int number3) {
		return number1+number2+number3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overLoadMethod method=new overLoadMethod();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers");
		 double num1=sc.nextInt();
		 double num2=sc.nextInt();
		 double add=method.add(num1, num2);
		 System.out.println("sum of two numbers is : "+add);
		 
		 
		 System.out.println("Enter the three numbers ");
		 int number1=sc.nextInt();
		 int number2=sc.nextInt();
		 int number3=sc.nextInt();
		 int res=method.add(number1, number2, number3);
		 System.out.println("sum of three numbers is : "+res);
		 
		 
		 
		

	}

}
