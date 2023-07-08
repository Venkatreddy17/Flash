package collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Employee(int i, String string, String string2, double d) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Employee st) {
		// TODO Auto-generated method stub
		if(age==st.age)
		return 0;
		else if(age>st.age)
			return 1;
		else 
			return -1;
			
		
	}
}

public class comparebleImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(101, "Venkat", 21));
		list.add(new Employee(102, "Bhasker", 24));
		list.add(new Employee(103, "suresh", 40));
		list.add(new Employee(104,"Ramreddy", 35));
		list.add(new Employee(105, "nareshReddy", 38));
		
		Collections.sort(list);
		for(Employee employee:list) {
			System.out.println(employee);
		}

	}

}
