package Lopps;
import java.util.Scanner;
public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your name");
		name=sc.next();
		
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("your name is : "+name);
		}

	}

}
