package basic;
import java.util.Scanner;
public class ArithameticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Two numbers");
		a = sc.nextInt();
		b =sc.nextInt();
		c=a+b;
		System.out.println("addition of "+a + " and "+b+ " is:" +c);
		c=a-b;
		System.out.println("subtraction of "+a+ " and "+b+ " is:" +c);
		c=a*b;
		System.out.println("multiplication of "+a+ " and "+b+ " is:" +c);
		c=a/b;
		System.out.println("division of "+a+ " and "+b+ " is:" +c);
		c=a%b;
		System.out.println("modules of "+a+ "  and "+b+ " is:" +c);
		sc.close();
		

	}

}
