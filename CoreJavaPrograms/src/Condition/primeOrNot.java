package Condition;
import java.util.Scanner;
public class primeOrNot {
	int number,prime;
	
	public void prime() 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		 number = sc.nextInt();
		if(number % 2==0)
		{
			System.out.println("Given Number "+number+" is Prime");
		}
		else {
			System.out.println("given number "+number+" is not a prime ");
		}
		
	}
	
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeOrNot num=new primeOrNot();
		num.prime();
			
				

	}

}
