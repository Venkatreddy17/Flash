package abstraction;

public abstract class Bike {
	public Bike()
	{
		System.out.println("constractor in abstract class bike");
	}
	public void changeGear() {
		System.out.println("non-abstact method : changing gear");
	}
	public abstract void run(); 
	

}
