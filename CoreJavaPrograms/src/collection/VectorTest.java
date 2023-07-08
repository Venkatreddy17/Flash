package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list=new Vector<String>();
		list.add("lotus");
		list.add("Lilly");
		list.add("jasmin");
		list.add("Rose");
		list.add("lotus");
		list.add(null);
		
		Enumeration<String> enumeration=list.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}

	}

}
