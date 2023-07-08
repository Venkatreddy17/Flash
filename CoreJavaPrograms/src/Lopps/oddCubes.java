package Lopps;
import java.util.Scanner;
public class oddCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			int number=(2*i-1)*(2*i-1);
			System.out.println(number);
		}

	}

}
