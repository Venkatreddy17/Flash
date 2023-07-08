package InterfacesPractice;

public class Tringle implements Shape {
	double base;
	double height;
	

	public Tringle(double base, double height) {
		
		this.base = base;
		this.height = height;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5*base*height;
	}

}
