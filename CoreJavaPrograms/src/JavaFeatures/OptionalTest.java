package JavaFeatures;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]=new String[10];
		//str[5]="This is optional Example";
		
		Optional<String> optional=Optional.ofNullable(str[5]);
		if(optional.isPresent()) {
			String upperCase=str[5].toUpperCase();
			System.out.println(upperCase);
		}
		else {
			System.out.println("String is not present at 5th postion");
		}

	}

}
