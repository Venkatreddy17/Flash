package Series;
import java.util.Scanner;
public class OddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		int number=1;
		for(int i=1;i<num;i++) {
			System.out.println(number + " ");
			number+=2;
			
		}
		

	}

}
