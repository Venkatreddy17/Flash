package abstraction;

public class Honda extends Bike{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implemented abstract method : running safely");
		
	}
       public static void main(String[] args) {
		// TODO Auto-generated method stub
    	   Bike b=new Honda();//Honda h=new Bike();downcasting is not allowed
    	   b.changeGear();
    	   b.run();

	}

}
