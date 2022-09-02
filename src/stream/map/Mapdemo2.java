package stream.map;

import java.util.Arrays;
import java.util.List;

public class Mapdemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> vehicles= Arrays.asList("bus","car","aeroplane",
				"ship","bicycle","motorcycle","train");
		//before java 8 /without streams
		/*for(String n:vehicles) {
			System.out.println(n.length());
		}*/
	
	//using streams
	//vehicles.stream().map(n1->n1.length()).forEach(System.out::println); //or
	vehicles.stream().map(n1->n1.length()).forEach(n->System.out.println(n));

}
}
