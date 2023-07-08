package Condition;
import java.util.Scanner;
public class postiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number ");
		number= sc.nextInt();
		
		if(number>0) {
			System.out.println("Given Number is postive");
		}
		else if(number <0) {
			System.out.println("Given Number is negative");
		}
		else {
			System.out.println("Given Number is Zero");
		}

	}

}
