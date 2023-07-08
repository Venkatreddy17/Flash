package relationship;

public class SalesPerson extends Employee {
	 int sales; 
	 double commision;

	public SalesPerson() {
		super();
		sales = 0;

	}

	public SalesPerson(int id, String name, MyDate birthDate, double workingDays, double perDay, int sales) {
		super(id, name, birthDate, workingDays, perDay);
		this.sales = sales;

	}

	@Override
	public void calulate() {
		// TODO Auto-generated method stub
		super.calulate();

		if (sales >= 95) {
			commision = 0.20 * salary;
		} else if (sales >= 90) {
			commision = 0.15 * salary;
		} else if (sales >= 80) {
			commision = 0.10 * salary;
		} else if (sales >= 75) {
			commision = 0.05 * salary;
		} else {
			commision = 0.0;
		}
		
	}
	

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("sales percentage :" + sales);
		System.out.println("commision :" + commision);
		System.out.println("Total salary: " +(salary+commision));
	}

	public static void main(String[] args) {
		SalesPerson salesPerson = new SalesPerson(101, "balram",new MyDate(17, 8, 2004), 22, 1400, 85);
		salesPerson.calulate();
		salesPerson.display();

	}

}
