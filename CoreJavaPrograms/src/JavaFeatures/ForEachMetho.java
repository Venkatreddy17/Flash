package JavaFeatures;

import java.util.ArrayList;

public class ForEachMetho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("siri");
		list.add("Chiru");
		list.add("venkat");
		list.add("chinna");
		
		list.forEach(str-> System.out.println(str));

	}

}
