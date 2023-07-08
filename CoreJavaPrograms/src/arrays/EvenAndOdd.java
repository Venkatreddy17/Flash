package arrays;
import java.util.Scanner;
public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int evenCount,oddCount;
		 evenCount=oddCount=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array ");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+ " an arrayElements");
		
		for(int i=0;i<size;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			if(a[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println( " The frequency of Even numbers are "+evenCount);
		System.out.println( " The frequency of odd numbers are "+oddCount);

		
		
		
		

	}

}
