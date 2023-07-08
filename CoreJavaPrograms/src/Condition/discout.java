package Condition;
import java.util.Scanner;
public class discout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double purchase,discount;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the your purchase  amount" );
		purchase=sc.nextDouble();
		
		if(purchase >= 10000) {
			discount = purchase*0.10;
			System.out.println("The discount amount is :"+discount);
		}
		else {
			discount = purchase*0.2;
			System.out.println("The discount amount is :"+discount);
		}

	}

}
