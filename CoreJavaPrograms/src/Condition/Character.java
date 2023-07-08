package Condition;
import java.util.Scanner;
public class Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char character;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a character");
		character = sc.next().charAt(0);
		
		switch(character) {
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		case 'A' :
		case 'E' :
		case 'I' :
		case 'O' :
		case 'U' :
			System.out.println("The given "+character+ " character is : vowel");
			break;
			default :System.out.println("The given "+character+" character is : constant");
			
		}
		
		
	

	}

}
