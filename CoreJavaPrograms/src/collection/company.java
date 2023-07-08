package collection;

import java.util.ArrayList;

public class company {
	int comanyId;
	String comanyName;
 
	public company(int comanyId, String comanyName, ArrayList<Employee> emps) {
		super();
		this.comanyId = comanyId;
		this.comanyName = comanyName;
		this.emps = emps;
	}
	@Override
	public String toString() {
		return "company [comanyId=" + comanyId + ", comanyName=" + comanyName + ", emps=" + emps + "]";
	}
	

}
