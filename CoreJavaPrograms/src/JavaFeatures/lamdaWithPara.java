package JavaFeatures;

interface Addable{
	int add(int a,int b);
}

public class lamdaWithPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addable a1=(x,y) -> x+y;
		
		System.out.println("Add : "+a1.add(15, 5));
		
		Addable a2=(p,q) -> {
			return p+q;
		};
		System.out.println("Add : "+a2.add(100, 50));

	}

}
