package basic;
import java.util.Scanner;
public class AreaDefault {
	
	double radius,area,length,breath;
	Scanner sc = new Scanner(System.in);
	
	//defalt without return
	public void circle()
	{
		System.out.println("Enter radius : ");
		radius=sc.nextDouble();
		area=3.14*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
	
	//defalt with return
	public double rectangle()
	{
		System.out.println("Enter the length and breath : ");
		length = sc.nextDouble();
		breath =sc.nextDouble();
		area = length*breath;
		return area;
		
	}
	//parameterized without return
	 public void tringle(float base,float height)
	 {
		 area = 0.5*base*height;
		 System.out.println("area of tringle : "+area);
	 }
	 //parameterized with return type
	 public int square(int side)
	 {
		 return side*side;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaDefault findArea = new AreaDefault();
		findArea.circle();
		double arRect=findArea.rectangle();
		System.out.println("Area of rectangle : "+arRect);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base and height");
		float base =sc.nextFloat();
		float height=sc.nextFloat();
		findArea.tringle(base, height);
		
		
		System.out.println("Enter the side : ");
		int s =sc.nextInt();
		int sqArea=findArea.square(s);
		System.out.println("Area of square : "+sqArea);
		
		

	}

}
