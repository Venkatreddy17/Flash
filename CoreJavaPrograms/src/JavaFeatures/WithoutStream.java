package JavaFeatures;

import java.util.ArrayList;

public class WithoutStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<>();
		list.add("raj");
		list.add("Meera");
		list.add("Venkatreddy");
		list.add("Balaramreddy");
		list.add("Venkatlaxmi");
		list.add("Balatripura");
		list.add("ram");

		int count = 0;
		for (String string : list) {
			if (string.length() > 7)
				count++;

		}
		System.out.println("There are "+count+" string with length greater than 7 ");

	}

}
