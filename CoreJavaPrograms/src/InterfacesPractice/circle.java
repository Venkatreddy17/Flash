package InterfacesPractice;

public class circle implements Shape {
	double radius;
	
	public circle(double radius) {
		this.radius=radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

}
