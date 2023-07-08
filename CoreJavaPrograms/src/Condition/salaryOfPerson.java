package Condition;
import java.util.Scanner;
public class salaryOfPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary,tax;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter The Person Salary");
		salary=sc.nextInt();
		
		if(salary<50000) {
			tax=salary*0.10;
			System.out.println("Tax on The person is : "+tax);
		}
		else {
			tax=salary*0.15;
			System.out.println("Tax on The person is : "+tax);
		}

	}

}
