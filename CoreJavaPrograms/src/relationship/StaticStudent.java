package relationship;

public class StaticStudent {
	int id;
	String name;
	static String clgName="cvr";
	
	public StaticStudent(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	 
				
	@Override
	public String toString() {
		return "id= "+id+", name="+name+",collage Name : "+clgName;
	}

	static {
		System.out.println("it will call before main");
	}
	public static void square(int a)
	{
		System.out.println("square : "+(a*a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticStudent stu1=new StaticStudent(101, "venkat");
		StaticStudent stu2=new StaticStudent(101, "bhasker");
		square(3);
		System.out.println(stu1);
		System.out.println(stu2);
		
		
		
		

	}
	

}
