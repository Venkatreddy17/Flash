package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class setimp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("venkat");
		hashSet.add("hyd");
		hashSet.add("kamareddy");
		hashSet.add("tadwai");
		hashSet.add("santhaipet");
		hashSet.add("santhaipet");
		hashSet.add(null);
		
		System.out.println("\nImplementing Hashset : ");
		for (String string : hashSet) {
			System.out.println(string);
			
		}
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
		linkedHashSet.add("mango");
		linkedHashSet.add("bannana");
		linkedHashSet.add("Apple");
		linkedHashSet.add("orange");
		linkedHashSet.add("pine-apple");
		linkedHashSet.add("Apple");
		linkedHashSet.add(null);
		
		System.out.println("\nImplementing LinkesHashSet");
		for (String string : linkedHashSet) {
			System.out.println(string);
			
		}
		TreeSet<String> set=new TreeSet<>();
		set.add("ramu");
		set.add("raju");
		set.add("venkat");
		set.add("balram");
		set.add("reddy");
		set.add("venkat");
		System.out.println("\nImplementing TreeSet : ");
		for (String string : set) {
			System.out.println(string);
		}
		

	}

}
