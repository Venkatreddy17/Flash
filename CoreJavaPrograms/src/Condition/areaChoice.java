package Condition;
import java.util.Scanner;
public class areaChoice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1 for area of circle");
		System.out.println("2 for area of tringle ");
		System.out.println("3 for area of rectangle");
		
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1 : System.out.println("Enter radius of circle");
		double radius=sc.nextDouble();
		double AreaOfCircle=3.141*radius*radius;
		System.out.println("the area of circle is : "+AreaOfCircle);
		break;
		
		case 2 : System.out.println("Enter base and height of tringle ");
		double base=sc.nextDouble();
		double height=sc.nextDouble();
		double AreaOfTringle=0.5*base*height;
		System.out.println("the area of rectangle is : "+AreaOfTringle);
		break;
		
		case 3 : System.out.println("Enter length and breath of rectangle");
		double length=sc.nextDouble();
		double breath=sc.nextDouble();
		double AreaOfRectangle=length*breath;
		System.out.println("the area of rectangle is : "+AreaOfRectangle);
		break;
		
		default : System.out.println("Enter number between 1-3");
		
		}
		

	}

}
