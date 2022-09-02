package streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	private int eid;
	private String ename;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	private String empdept;
	public Employee(int eid, String ename, String empdept) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.setEmpdept(empdept);
	}
	@Override
	public String toString() {
		return " [eid=" + eid + ", ename=" + ename + ", empdept=" + getEmpdept() + "]";
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	
}
public class Filterdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Employee> emps = new ArrayList <Employee>();
		emps.add(new Employee(101,"Rahul","finance"));
		emps.add(new Employee(102,"Sony","health"));
		emps.add(new Employee(103,"Megha","marketing"));
		emps.add(new Employee(105,"Himalaya","humanresources"));
		emps.add(new Employee(110,"Arunchal","finance"));
		emps.add(new Employee(124,"Sruthi","marketing"));
		emps.add(new Employee(132,"pallavi","marketing"));
		
		System.out.println(emps);
		
		//List <Employee> deptlist= emps.stream().filter(n1->n1.getEmpdept() == "marketing").collect(Collectors.toList());
		//System.out.println(deptlist);
		
		emps.stream().filter(n1->n1.getEmpdept() == "marketing" && n1.getEname().length()>5).forEach(p->System.out.println(p));

		

	}

}
