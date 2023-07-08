package Condition;

import java.util.Scanner;

public class GradeAndPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths,chem,scince,totalMarks,percent;
		String grade=null;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks in maths Subject");
		maths =sc.nextInt();
		System.out.println("Enter marks in chem Subject");
		chem =sc.nextInt();
		System.out.println("Enter marks in scince Subject");
		scince =sc.nextInt();
		
		totalMarks = maths+chem+scince;
		percent = totalMarks/3;
		
		if(percent >=90) {
			grade = "A+";
			
		}else if (percent >=80) {
			grade ="A";
		}
		else if (percent >=70) {
			grade = "B";
		}
		else if (percent >=60) {
			grade = "C";
			
		}
		else if (percent >=50) {
			grade = "D";
			}
		else if (percent >=40) {
			grade = "F";
			}
		System.out.println("totalMarks of student is : "+totalMarks);
		System.out.println("grade of student is : "+grade);
		System.out.println("percent of student is : "+percent);
		
	}
}
	
		
