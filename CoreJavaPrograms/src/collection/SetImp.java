package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class SetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> strings=new HashSet<>();
		strings.add("venkat");
		strings.add("raju");
		strings.add("ravi");
		strings.add("ramu");
		strings.add(null);
		
		System.out.println("\nImplementing hashSet :");
		for (String set : strings) {
			System.out.println(set);
			
		}
		LinkedHashSet<String> strings1=new LinkedHashSet<>();
		
		strings1.add("venkat");
		strings1.add("raju");
		strings1.add("ravi");
		strings1.add("ramu");
		strings1.add(null);
		
		System.out.println("\nImplementing LinkedHashSet");
		for (String string : strings1) {
			System.out.println(string);
			
		}
		TreeSet<String> strings2=new TreeSet<>();
		strings2.add("himansh");
		strings2.add("reddy");
		strings2.add("bhasker");
		strings2.add("balram");
		//strings2.add(null); In Treeset Null values are not allowed
		
		System.out.println("\nImplementing TreeSet :");
		for (String string : strings2) {
			System.out.println(string);
			
		}
		
		

	}

}
