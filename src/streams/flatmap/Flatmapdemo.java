package streams.flatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class student{
	private int sid;
	private String sname;
	private char sclass;
	public student(int sid, String sname, char sclass) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sclass = sclass;
	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public char getSclass() {
		return sclass;
	}
	public void setSclass(char sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + "]";
	}
}
public class Flatmapdemo {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<student> Stdlst1 = new ArrayList<student>();
		Stdlst1.add(new student(100,"Kavita",'A'));
		Stdlst1.add(new student(101,"Ramyakrishna",'B'));
		Stdlst1.add(new student(102,"Shekawath",'C'));
		

		List<student> Stdlst2 = new ArrayList<student>();
		Stdlst2.add(new student(104,"Vennela",'A'));
		Stdlst2.add(new student(105,"Vijay",'B'));
		Stdlst2.add(new student(106,"Pushpa",'C'));
		
		List <List<student>> Finallst = Arrays.asList(Stdlst1,Stdlst2);
		
		Finallst.stream().flatMap(x->x.stream().map(n1->n1.getSname())).forEach(System.out::println);
	}

}
