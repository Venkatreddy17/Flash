package LambdaExpressionPracticeProblems;

@FunctionalInterface
interface Circle{
	public double circle(float radius);
	
}

public class areaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle cir=(r) -> Math.PI*r*r;
		
		double result=cir.circle(7.2f);
		
		System.out.println("Area of circle is : "+result);

	}

}
