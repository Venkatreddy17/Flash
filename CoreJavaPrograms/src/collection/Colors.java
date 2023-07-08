package collection;

import java.util.ArrayList;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("Red");
		list.add("Orange");
		list.add("Yellow");
		list.add("Green");
		list.add("Blue");
		list.add("Voilet");
		System.out.println("Displaying the colors : ");
		for(String color:list) {
			System.out.println(color);
		}

	}

}
