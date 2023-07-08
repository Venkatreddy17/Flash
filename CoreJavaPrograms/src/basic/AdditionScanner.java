package basic;
import java.util.Scanner;
public class AdditionScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;/*decaring variable*/
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		a =sc.nextInt();
		b =sc.nextInt();
		
		c=a+b; //performing operation
		
		System.out.println("Addition of "+a+" and "+b+" is:"+c);
		
	}

}
