package JavaFeatures;

import java.util.ArrayList;

public class FOrEachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<>();
		list.add("venkat");
		list.add("venkatlaxmi");
		list.add("Balamani");
		list.add("Padmma");
		list.add("SriVarshini");
		
		list.forEach(str -> System.out.println(str));

	}

}
