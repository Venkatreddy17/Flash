package basic;
import java.util.Scanner;
public class EmpoyeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The salary amount of Empoye :");
		double salary = sc.nextDouble();
		double tax = (12*salary)/100;
		System.out.println("Taxamount is :"+tax);
		sc.close();
		
		

	}

}
