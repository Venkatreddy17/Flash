package Condition;

import java.util.Scanner;

public class BillAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double noOfCalls,bill;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter no.of calls : ");
		noOfCalls = sc.nextDouble();
		
		if(noOfCalls < 200) {
			bill=noOfCalls*1;
		}
		else {
			bill=noOfCalls*3;
		}
		System.out.println("Bill Amount is : "+bill);

	}

}
