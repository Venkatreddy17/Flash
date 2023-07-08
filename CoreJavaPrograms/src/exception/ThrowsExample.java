package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int age;
		String name;
		float m1,m2;
		
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter name");
		name=reader.readLine();
		System.out.println("enter age");
		age=Integer.parseInt(reader.readLine());
		System.out.println("enter marks of two subject marks");
		m1=Float.parseFloat(reader.readLine());
		m2=Float.parseFloat(reader.readLine());
		
		float avg=(m1+m2)/2;
		
		System.out.println("name :"+name);
		System.out.println("Age :"+age);
		System.out.println("average  :"+avg);;
		
		

	}

}
