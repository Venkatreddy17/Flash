package LambdaExpressionPracticeProblems;

@FunctionalInterface
interface PercentageCalculator {
	public double calculator(double m1, double m2, double m3);
}

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PercentageCalculator cal = (m1, m2, m3) -> ((m1 + m2 + m3) / 3);
		double result = cal.calculator(90, 90, 90);
		System.out.println("The total Percentage is : " + result);

	}

}
