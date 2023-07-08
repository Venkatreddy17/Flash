package Condition;
import java.util.Scanner; 
public class numberChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		System.out.println("1 for check whether number is even or odd");
		System.out.println("2 for check number is postive ,negative or zero");
		
		int choice=sc.nextInt();
		System.out.println("Ente the number you want to check");
		int num=sc.nextInt();
		
		switch(choice)
		{
		case 1 : if (num %2==0)
		{
			System.out.println("The givrn number is " +num+ " even");
		}else {
			System.out.println("The givrn number is " +num+ " odd");
		}
		break;
		case 2 : if(num>0) {
			System.out.println("the given number is " +num+ " postive");
		}else if(num<0) {
			System.out.println("the given number is " +num+ " negative");
		}else {
			System.out.println("the given number is " +num+ " zero");
		}
		
		
		
		}
		
		

	}

}
