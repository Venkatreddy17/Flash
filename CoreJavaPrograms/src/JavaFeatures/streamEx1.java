package JavaFeatures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList=Arrays.asList("Raj","Bhagyashree","BalramReddy","Renna","bhaskerreddy");
		
		//creating stream
		Stream<String> allNames=nameList.stream();
		
		//perform intermediate operation : length>7
		Stream<String> longNames=allNames.filter(str -> str.length()>7);
		
		System.out.println("long names (>7 length ): ");
		//perform terminal operation : print long names 
		longNames.forEach(str -> System.out.println(str));
		
		System.out.println("long names (>7 and <10 length");
		nameList.stream().filter(str -> str.length()>7 && str.length()<10).forEach(str -> System.out.println(str));

	}

}
