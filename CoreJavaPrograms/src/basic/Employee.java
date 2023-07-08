package basic;
import java.util.Scanner;
public class Employee {
	String empName;
	int empCode;
	double basicSalary,allowance,grossSalary,tax,netSalary;
	
	public Employee() {
		empCode=0;
		empName="";
		basicSalary=0;
		
	}
	
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp name :");
		empName = sc.nextLine();
		System.out.println("Enter emp code :");
		empCode =sc.nextInt();
		System.out.println("Enter emp salary :");
		basicSalary = sc.nextDouble();
	}
	public void allow()
	{
		allowance = basicSalary*0.55;
	}
	public void gross()
	{
		grossSalary = basicSalary + allowance;
	}
	public void tax()
	{
		tax=grossSalary*0.12;
	}
	public void net()
	{
		netSalary = grossSalary - tax;
		
	}
	public void display()
	{
		System.out.println("emp code : "+empCode);
		System.out.println("emp Name : "+empName);
		System.out.println("Basic salary : "+basicSalary);
		System.out.println("Gross Salary : "+grossSalary);
		System.out.println("Tax  : "+tax);
		System.out.println("Net Salary : "+netSalary);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.accept();
		employee.allow();
		employee.gross();
		employee.tax();
		employee.net();
		employee.display();
		

	}

}
