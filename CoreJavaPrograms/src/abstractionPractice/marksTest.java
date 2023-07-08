package abstractionPractice;

public class marksTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		marks a=new StudentA(90,86, 56);
		double percentageA=a.getPercentage();
		System.out.println("The percentage of student A is : "+percentageA);
		
		marks b=new StudentB(90, 90, 87, 66);
		double percentageB=b.getPercentage();
		System.out.println("The percentage of student A is : "+percentageB);

	}

}
