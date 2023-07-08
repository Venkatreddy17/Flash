package Series;
import java.util.Scanner;
public class sumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<=15;i++) {
			int number=i*i+1;
			sum=sum+number;
			System.out.println(i+" * "+(i+1) + " = "+sum);
			
		}
		System.out.println("The total sum of series is :"+sum);
		
		

	}

}
