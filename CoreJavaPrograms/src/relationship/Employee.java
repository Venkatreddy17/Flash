package relationship;

public class Employee extends Person {
	double workingDays,perDay,salary;
	
	public Employee() {
		super();//call constractor from parent class
		workingDays=20;
		perDay=2000;
	}
	public Employee(int id,String name,MyDate birthDate,double workingDays,double perDay)
	{
		super(id,name,birthDate);
		this.workingDays=workingDays;
		this.perDay=perDay;
	}
	public void calulate()
	{
		salary=workingDays*perDay;
	}
	public void display() {
		super.display();
		System.out.println("salary :"+salary);
		
	}

}
 