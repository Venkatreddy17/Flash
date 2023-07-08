package InterfacesPractice;

public class FlyableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flyable s = new SpaceCraft();
		s.fly_obj();

		Flyable a = new AirPlane();
		a.fly_obj();

		Flyable h = new Helicopter();
		h.fly_obj();

	}
}
