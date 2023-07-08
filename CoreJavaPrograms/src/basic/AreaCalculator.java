package basic;

public class AreaCalculator {
	//circleArea
			public static double AreaOfCircle(double radius)
			{
				return 3.141*radius*radius;
			}
			//Area of rectangle
			public static double AreaOfRectangle(double length,double birth)
			{
				return length*birth;
			}
			// Area of tringle
			public static double AreaOfTringle(double base, double height)
			{
				return 0.5*base*height;
			}
			//square
			public static double AreaOfSquare(double side)
			{
				return side*side;
			}
			
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double circleRadius =20.0;
		double RectangleLength=12.0;
		double RectangleBirth=23.0;
		double TringleBase=24.0;
		double TringleHeight=54.0;
		double SquareSide=60.0;
		
		double circleArea=AreaOfCircle(circleRadius);
		double RectangleArea=AreaOfRectangle(RectangleLength,RectangleBirth);
		double triangleArea=AreaOfTringle(TringleBase,TringleHeight);
		double squareArea=AreaOfSquare(SquareSide);
		
		System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + RectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Square Area: " + squareArea);
		
	     
		
}
}