package Lopps;
import java.util.Scanner;
public class checkNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your choice");
		System.out.println("1 is for check whether number is even or odd");
		System.out.println("2 is for check whether number is postive,negative or zero");
		
		int choice=sc.nextInt();
		System.out.println("Enter the numbers you want to check");
		int num=sc.nextInt();
		
		switch(choice) {
		case 1 :if(num%2==0) {

			System.out.println("The given " +num+ " is Even");
		}
		else {
			System.out.println("The given " +num+ " is odd");
		}break;
		case 2 :if(num>0) {
			System.out.println("The given " +num+ " is postive");
		}
		else if(num<0){
			System.out.println("The given " +num+ "is negative");
		}
		else {
			System.out.println("The given " +num+ "is Zero");
		}
		break;
        default : System.out.println("invalid input");
		break;
		
		}
		System.out.println("Do you want to continue (y/n)");
		ch=sc.next().charAt(0);
	}while(ch=='y'||ch=='Y');
	}
}
		
		
		
		
		
		
		
		

	 

  

