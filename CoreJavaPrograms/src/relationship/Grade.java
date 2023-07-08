package relationship;

public class Grade extends Student {
	String grade;
	
	public Grade() {
		super();
		grade="";
	}

	
	public Grade(int id, String name, MyDate birthDate, int physics, int chemistry, int maths) {
		super(id, name, birthDate, physics, chemistry, maths); 
		
	}
	

}
