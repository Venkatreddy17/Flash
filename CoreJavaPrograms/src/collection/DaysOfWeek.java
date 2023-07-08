package collection;

import java.util.ArrayList;

public class DaysOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> days=new ArrayList<String>();
		days.add("Sunday");
		days.add("Monday");
		days.add("Tuesday");
		days.add("WednesDay");
		days.add("ThursDay");
		days.add("FriDay");
		days.add("SaturDay");
		
		System.out.println("\nDisplay the ArrayList :");
		for(String day :days) {
			System.out.println(day);
		}
		
		

	}

}
