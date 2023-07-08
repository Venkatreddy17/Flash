package Condition;
import java.util.Scanner;
public class calls {
	
	String custName;
	int phoneNo,numberOfCalls;
	double tax,bill,finalBill;
	
	
	
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the custName : ");
		custName=sc.nextLine();
		System.out.println("Enter the phone number : ");
		phoneNo=sc.nextInt();
		System.out.println("Enter the No.Of.calls : ");
		numberOfCalls=sc.nextInt();
	}
	public void billing()
	{
		if(numberOfCalls <= 100) {
			bill=numberOfCalls*0;
			
		}
		else if(numberOfCalls <=300) {
			bill=numberOfCalls*0.80;
		}
		else if(numberOfCalls <=500 )
		{
			bill=numberOfCalls*1.25;
		}
		else
		{
			bill=numberOfCalls*2.50;
		}
		finalBill=bill*0.12;
		System.out.println("The total call bill is : "+finalBill);
	}
	public void display()
	{
		System.out.println("customerName : "+custName);
		System.out.println("customer phone number : "+phoneNo);
		System.out.println("Number of phone calls : "+numberOfCalls);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calls call=new calls();
		call.accept();
		call.billing();
		call.display();
		
		

	}

}
