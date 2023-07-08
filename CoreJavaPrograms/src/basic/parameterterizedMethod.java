package basic;

import java.util.Scanner;

public class parameterterizedMethod {
	public void add(int a,int b)
	{
		System.out.println("add :"+(a+b));
		
	}
	public double sub(double x,double y)
	{
		return x-y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parameterterizedMethod method = new parameterterizedMethod();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		method.add(a, b);
		double p,q;
		System.out.println("Enter 2 double numbers");
		p=sc.nextDouble();
		q=sc.nextDouble();
		double result=method.sub(p, q);
		System.out.println("sub: "+result);
		
		
		

	}

}
