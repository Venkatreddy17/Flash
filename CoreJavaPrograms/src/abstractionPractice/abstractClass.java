package abstractionPractice;

public  abstract class abstractClass {
	public abstractClass() {
		System.out.println("This is abstract class constractor");
	}
	public abstract void a_method();
	public void non_abstractMethod() {
		System.out.println("This is normal method of abstract class");
	}

}
class SubClass extends abstractClass{
	@Override
	public void a_method() {
		// TODO Auto-generated method stub
		System.out.println("This is abstract method");
		
	}
}
