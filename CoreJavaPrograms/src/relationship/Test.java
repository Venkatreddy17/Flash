package relationship;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1=new Person();
		p1.display();
		System.out.println("-----------------------------------------------------------");
		Person p2=new Person(1000, "BhaskerReddy", new MyDate(5, 4, 2000));
		p2.display();
		System.out.println("-----------------------------------------------------------");
		Employee emp=new Employee();
		emp.display();
		System.out.println("-----------------------------------------------------------");
		Employee emp2=new Employee(102,"Balram",new MyDate(7, 8, 2004), 22, 1800);
		emp2.calulate();
		emp2.display();
		
	
		

	}

}
