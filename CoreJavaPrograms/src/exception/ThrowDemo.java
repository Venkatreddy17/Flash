package exception;

public class ThrowDemo {
	public static void checkAge(int age) {
		if (age<18)
			throw new ArithmeticException("Age is not valid");
		else
			System.out.println("eligible");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkAge(20);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code");
	}

}
