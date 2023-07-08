package exception;

public class FinallyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("case 1 :Where exception doesn't occur ");
		try {
			String s1="123";
			System.out.println(Integer.parseInt(s1));
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("finally executed in case 1 :Where exception doesn't occur");
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("case 2 :where exception occurs and handled");
		try {
			String s2=null;
			System.out.println(s2.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		finally {
			System.out.println("finally executed case 2 :where exception occurs and handled ");
		}
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("case 3 :exception occurs but does not handled");
		try {
			int a=10/0;
			System.out.println("div "+a);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			System.out.println("finally executed in case 3 :exception occurs but does not handled ");
		}
		System.out.println("rest of lines...");

	}

}
