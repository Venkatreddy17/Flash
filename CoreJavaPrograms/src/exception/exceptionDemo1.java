package exception;

public class exceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10/0;
			System.out.println("div "+a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			//System.out.println(e);
			//System.err.pritln(e);
		}
		
		System.out.println("rest of code.....");
		

	}

}
