package basic;

public class Student {
	int rollNo;//variable declaration
	String name;//instance variable:Which id declare inside a class
	float phy,chem,maths,total,percent;
	
	public Student()  //defalt: without any parameter ,used to initialize defalt vaues
	{
		rollNo = 101;
		name = "Venkat";
		phy = 68;
		chem = 67;
		maths = 90;
		
	}
	public Student(int rollNo,String name,float phy,float chem,float maths)
	{
		this.rollNo = rollNo;
		this.name = name;
		this.phy = phy;
		this.chem =chem;
		this.maths = maths;
	}
	public void caluculate()
	{
		total=phy+chem+maths;
		percent=total/3;
		System.out.println("--------------Student Info--------------");
		System.out.println("RollNo: "+rollNo);
		System.out.println("Name: "+name);
		System.out.println("Total: "+total);
		System.out.println("percent: "+percent);
	}
	
		
		
	
		
	

}
