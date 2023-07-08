package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("yeshwanth reddy");
		list.add("Venkat");
		list.add("Balamani");
		list.add("Manjula");
		list.add("Tharun");
		
		Collections.sort(list);
		
		System.out.println("sorting String list");
		for(String string : list) {
			System.out.println(string);
		}
		
		ArrayList<Integer> list2=new ArrayList<>();
		list2.add(34);
		list2.add(22);
		list2.add(99);
		list2.add(77);
		list2.add(1);
		
		Collections.sort(list2);
		System.out.println("\nsorting weapper list");
		for(Integer integer:list2) {
			System.out.println(integer);
		}
				

	}

}
