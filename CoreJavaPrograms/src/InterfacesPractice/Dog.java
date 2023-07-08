package InterfacesPractice;

public class Dog implements Animal {
	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Dog is bracking!");
		
	}
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.bark();
	}
	

		

	}


