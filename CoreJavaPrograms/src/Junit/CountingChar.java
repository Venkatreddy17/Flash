package Junit;

public class CountingChar {
	public int countA(String str) {
		//str=str.toLowerCase();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='A' || str.charAt(i)=='a') {
				count++;
			}
		}
		return count;
		
	}

}
