package abstraction;

public class InterfaceImpl implements Drawable,Printable {


	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		float radius=PI;
		float area =PI*radius*radius;
		System.out.println("Area of circle : "+area);
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl interfaceImpl=new InterfaceImpl();
		interfaceImpl.calculate();
		interfaceImpl.cube(5);
		System.out.println("square : "+Drawable.square(5));

	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Implementing multiple interfaces....method from 2nd interface");
		
	}

}
