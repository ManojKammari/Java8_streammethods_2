package streams.filter;

import java.util.Arrays;
import java.util.List;

public class Filterdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> names = Arrays.asList("Ravi","Somesh","Rajinikanth"
				,"Chiranjeevi","RamCharantej","Prabhas");
		System.out.println(names);
		
		//Required data whose legnth of name is >6 and less than 10
		
		names.stream().filter(n1->((n1.length())>6) && ((n1.length())<10)).
		forEach(n1->System.out.println(n1));
		names.stream().filter(n1->((n1.length())>6)).
		forEach(n1->System.out.println(n1));

	}

}
