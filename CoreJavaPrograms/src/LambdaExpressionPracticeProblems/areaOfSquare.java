package LambdaExpressionPracticeProblems;
@FunctionalInterface
interface Square {
	public int square(int n);
}

public class areaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sqr = (n) -> n * n;

		int result = sqr.square(7);
		System.out.println("Area of Square is " + result);

	}

}
