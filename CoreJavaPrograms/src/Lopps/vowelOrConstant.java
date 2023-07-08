package Lopps;
import java.util.Scanner;
public class vowelOrConstant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char choice,ch;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter a character");
			choice=sc.next().charAt(0);
			switch(choice) {
			case 'a' :
			case 'e' :
			case 'i' :
			case 'o' :
			case 'u' :
			case 'A' :
			case 'E' :
			case 'I' :
			case 'O' :
			case 'U' :System.out.println("The character " +choice+ " is a vowel");
			break;
			default : System.out.println("The character " +choice+ " is a constant");
			break;
				
			}
			System.out.println("Do you want to continue (y/n)");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
	
		

	}

}
