package collection;

import java.util.HashMap;
import java.util.Hashtable; 
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map=new HashMap<Integer,String>();
		map.put(1, "venkat");
		map.put(2, "saloni");
		map.put(3, "varshini");
		map.put(4, "naresh");
		
		System.out.println("Implementing HashMap : ");
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			
			System.out.println("ID : "+entry.getKey());
			System.out.println("\t Name : "+entry.getValue());
			
		}
		System.out.println("\nFetching ID : 3 "+map.get(3));
		
		System.out.println("\nImplementing HashMap");
		TreeMap<String, String> treepMap=new TreeMap<String,String>();
		treepMap.put("B102", "dosa");
		treepMap.put("185", "Biryani");
		treepMap.put("B105", "vada");
		treepMap.put("D75", "Roti-curry");
		treepMap.put("165", "butter masala");
		
		
		for(Map.Entry<String, String> entry : treepMap.entrySet()) {
			System.out.println("\nFood Id : "+entry.getKey());
			System.out.println("\tName : "+entry.getValue());
			
		}
		Hashtable<String, String> hashtable=new Hashtable<String,String>();
		hashtable.put("Ind","India");
		hashtable.put("pk", "pakisthan");
		hashtable.put("Fr", "france");
		hashtable.put("Aus","Austalia");
		hashtable.put("NZ", "New Zealand");
		hashtable.put("SL", "Srilanka");
		
		System.out.println("\nImplementing Hashtable HashTable");
		for (Map.Entry<String, String> entry :hashtable.entrySet()) {
			System.out.println("\ncountry code : "+entry.getKey());
			System.out.println("\tcountry Name : "+entry.getValue());
			
		}
			
		

	}

}
