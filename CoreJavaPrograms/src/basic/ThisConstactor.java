package basic;
//this(): used to call constractor of same class
public class ThisConstactor {
	String msg;
	public ThisConstactor() {
		this("User");//calling this Constractor
		System.out.println("Hello " +msg);
	}
	
	public ThisConstactor(String msg) {
		this.msg =msg;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstactor obj = new ThisConstactor();

	}

}
