package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("lotus");
		list.add("Lilly");
		list.add("jasmin");
		list.add("Rose");
		list.add("lotus");
		list.add(null);
		
		for(String string : list) {
			System.out.println(string);
		}

	}

}
