package JavaFeatures;

@FunctionalInterface
interface Sayable{
	public String say();
		
	
}

public class LamdaNopara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sayable s1=() -> {
			return "Hello user";
		};
		
		System.out.println(s1.say());

	}

}
