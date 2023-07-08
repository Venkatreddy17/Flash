package basic;
import java.util.Scanner;
public class AreaOfCircleRectangleAndTringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Area of Circle.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius Value Of Circle");
		double radius = sc.nextDouble();
		double areaOfCircle = 3.141*radius*radius;
		System.out.println("Area of Circle is :"+areaOfCircle);
		
		//Area of Rectangle
		System.out.println("Enter the Length and Breath Values of Rectangle");
		double length =sc.nextDouble();
		double breath =sc.nextDouble();
		double areaOfRectangle = length*breath;
		System.out.println("Area of Rectangle is "+areaOfRectangle);
		
		//Area of Tringle
		
		System.out.println("Enter the Height and Base Value of Tringle");
		double height = sc.nextDouble();
		double base = sc.nextDouble();
		double areaOfTringle = (height*base)/2;
		System.out.println("Area of Tringle is "+areaOfTringle);
		
		sc.close();
		
		

	}

}
