package stream.map;

import java.util.Arrays;
import java.util.List;

class Employee{
	private int eid;
	private String ename;
	private double esal;
	public Employee(int eid, String ename, double esal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}
	
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

	public double getEsal() {
		return esal;
	}

	public void setEsal(double esal) {
		this.esal = esal;
	}

	@Override
	public String toString() {
		return "eid=" + eid + ", ename=" + ename + ", esal=" + esal;
	}
	
	
}

public class Mapfilterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> emplist = Arrays.asList(new Employee(100,"Rahul",10000)
				,new Employee(101,"Ravi",20000)
				,new Employee(102,"Gopinath",30000)
				,new Employee(103,"Rocky",25000)
				,new Employee(104,"Inayatkhaleel",50000)
				,new Employee(105,"Vanaram",40000)
				,new Employee(101,"Adheera",45000));
		//System.out.println(emplist);
		
		emplist.stream().filter(n1->n1.getEsal()>20000)
		.map(e->e.getEsal()).forEach(System.out::println);
	}

}
