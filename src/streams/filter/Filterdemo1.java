package streams.filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filterdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer>nums = new ArrayList <Integer>();
		List <Integer>el = new ArrayList <Integer>();

		nums.add(10);
		nums.add(12);
		nums.add(49);
		nums.add(53);
		nums.add(64);
		nums.add(40);
		nums.add(71);
		nums.add(25);
		//System.out.println(nums);
		/*for(int a: nums) {
			System.out.println(a);
		}
		for(int n: nums) {
			if(n%2==0) {      //without streams
				el.add(n);
			}
		}
		System.out.println(el);
		Collections.sort(el);
		System.out.println(el);
		Collections.sort(el, Collections.reverseOrder());
		System.out.println(el);
		*/
		//List <Integer> evnum = nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		//System.out.println(evnum);
		//nums.stream().filter(n->n%2==0).forEach(n->System.out.println(n));
		nums.stream().filter(n->n%2==0).forEach(System.out::println);
	}

}
