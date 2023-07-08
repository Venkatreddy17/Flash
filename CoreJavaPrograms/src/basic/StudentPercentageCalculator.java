package basic;
import java.util.Scanner;
public class StudentPercentageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Student 3 subject marks");
		System.out.println("Enter the Student marks in Maths");
		int mathsMarks=sc.nextInt();
		
	
		System.out.println("Enter the Student marks in physics");
		int physicsMarks=sc.nextInt();
		
		
		System.out.println("Enter the Student marks in English");
		int englishMarks=sc.nextInt();
		
		int totalMarks = mathsMarks+physicsMarks+englishMarks;
		double percentageStudent = (totalMarks*100)/300;
		
		
		System.out.println("student total marks obtained are "+totalMarks);
		System.out.println("student percentage is  "+percentageStudent);
		
		sc.close();
		
		
		
		
		

	}

}
