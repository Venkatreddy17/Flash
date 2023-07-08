package basic;
import java.util.Scanner;
public class simpleInterest {
	//using parameterized Method
	public double simpleinterest(double principalAmount,double rate,double time)
	{
		return principalAmount*rate*time;
	}
	public double taxOnSalary(double salary)
	{
		System.out.println((salary*12)/100);
		return salary ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		simpleInterest cal=new simpleInterest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount");
		 double principalAmount=sc.nextDouble();
		 System.out.println("Enter the rate of interest");
		 double rate=sc.nextDouble();
		 System.out.println("Enter the time period");
		 double time = sc.nextDouble();
		 double interest=cal.simpleinterest(principalAmount, rate, time);
		 System.out.println("The Simple interest is : "+interest);
		
		 
		 System.out.println("Enter the salary");
		 double salary=sc.nextDouble();
		  cal.taxOnSalary(salary);
		  
		  
		 
		
		
		
		
		
		
		

}
}
