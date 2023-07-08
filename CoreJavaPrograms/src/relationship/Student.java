package relationship;

public class Student extends Person {
	int physics;
	int chemistry;
	int maths;

	public Student() {
		super();
		physics = 0;
		chemistry = 0;
		maths = 0;
	}

	public Student(int id, String name, MyDate birthDate, int physics, int chemistry, int maths) {
		super(id, name, birthDate);
		this.physics = physics;
		this.chemistry = chemistry;
		this.maths = maths;
	}

	public int calculateTotalMarks() {
		return physics + chemistry + maths;
	}

	public double calculatePercentage() {
		int totalMarks = calculateTotalMarks();
		return (totalMarks / 3.0);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("physics : " + physics);
		System.out.println("chemistry : " + chemistry);
		System.out.println("maths : " + maths);
		System.out.println("TotalMarks : " +calculateTotalMarks());
		System.out.println("TotalPercentage : " +calculatePercentage());
	}

}
