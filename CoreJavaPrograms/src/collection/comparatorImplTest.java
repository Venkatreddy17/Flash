package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		if(st1.age==st2.age)
		return 0;
		else if(st1.age>st2.age)
			return 1;
		else
			return -1;
	}
	
}
class NameComparator implements Comparator<Student>{

	@Override
	public int compare(Student st1, Student st2) {
		// TODO Auto-generated method stub
		
		return st1.name.compareTo(st2.name);
	}
	
}

public class comparatorImplTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(new Student(101, "Shivani", 21));
		list.add(new Student(102, "raju", 34) );
		list.add(new Student(103, "Arun", 20));
		list.add(new Student(104, "shiva", 45));
		list.add(new Student(105, "balu", 19));
		
		System.out.println("\nsorting on the basic of age : ");
		Collections.sort(list,new AgeComparator());
		for (Student student : list) {
			System.out.println(student);
			
		}
		System.out.println("\nsorting on the basics of name : ");
		Collections.sort(list,new NameComparator());
		for (Student student : list) {
			System.out.println(student);
			
		}
		

	}

}
