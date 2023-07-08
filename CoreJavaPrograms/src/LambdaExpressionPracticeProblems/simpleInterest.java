package LambdaExpressionPracticeProblems;

@FunctionalInterface
interface Interest {
	double simpleInterest(float p, float n, float r);
}

public class simpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interest interest = (p, n, r) -> ((p * n * r) / 100);
		double result = interest.simpleInterest(100000f, 5f, 2.5f);
		System.out.println("The simple interest is : " + result);

	}

}
