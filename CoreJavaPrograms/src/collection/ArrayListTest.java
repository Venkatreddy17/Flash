package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList(); //non-generic any type of data
		
		list.add(20);
		list.add(56.5f);
		list.add("Raj");
		list.add(true);
		list.add(null);
		list.add(20);
		
		System.out.println(list);
		
		
		ArrayList<String> list2=new ArrayList<String>();//Generic : specific type of data
		list2.add("Venkat");
		list2.add("Sri varshini");
		list2.add("himansh Reddy");
		list2.add("Balram");
		list2.add("bhasker");
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.add(20);
		list3.add(30);
		list3.add(40);
		list3.add(50);
		list3.add(443);
		
		System.out.println("\nusing Iterator interface");
		 Iterator<Integer> itr1=list3.iterator();
		 while(itr1.hasNext()) { 
			 System.out.println(itr1.next());
		 }
		
		
		System.out.println("\nusing Iterator Interface :");
		Iterator<String> itr=list2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("\nusing for each loop:   ");
		for(String string : list2) {
			System.out.println(string);
		}
		
				
				

	}

}
