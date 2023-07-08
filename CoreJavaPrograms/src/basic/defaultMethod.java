package basic;
import java.util.Scanner;
public class defaultMethod {
	int a,b;
	public void accept()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		
	}
	public void add()
	{
		System.out.println("addition"+(a+b));
		
	}
	
	public int sub()
	{
		return a-b;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultMethod method = new defaultMethod();
		method.accept();
		method.add();
		int result = method.sub();
	System.out.println("sub: "+result);

	}

}
