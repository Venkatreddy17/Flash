package InterfacesPractice;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle=new Rectangle(10, 12);
		
		circle c=new circle(10);
		
		Tringle tringle=new Tringle(10, 5);
		
		System.out.println("Area of rectangle : "+rectangle.getArea());
		System.out.println("Area of circle : "+c.getArea());
		System.out.println("Area of tringle : "+tringle.getArea());

	}

}
