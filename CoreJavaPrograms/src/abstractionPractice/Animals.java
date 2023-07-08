package abstractionPractice;

public abstract class Animals {
	public abstract void cats();
	
	public abstract void dogs();

}
class Cats extends Animals{
	@Override
	public void cats() {
		// TODO Auto-generated method stub
		System.out.println("Cats Meow !!");
		
	}
	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		
	}
}
class Dogs extends Animals{
	@Override
	public void dogs() {
		// TODO Auto-generated method stub
		System.out.println("Dogs Bark !!");
		
	}
	@Override
	public void cats() {
		// TODO Auto-generated method stub
		
	}
}
