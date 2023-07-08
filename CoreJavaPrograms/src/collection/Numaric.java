package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Numaric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Number> numbers=new ArrayList<Number>();
		numbers.add(10);
		numbers.add(15.6f);
		numbers.add(100000000000L);
		numbers.add((byte)5);
		numbers.add(10.0);
		System.out.println("Displaying Elements using Iterators :");
		Iterator<Number> iterator=numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
 