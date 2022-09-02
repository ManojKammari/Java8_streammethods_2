package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;



public class Mapdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> vehicles= Arrays.asList("bus","car","aeroplane",
				"ship","bicycle","motorcycle","train");
		List <String> Vehiclesuppercase = new ArrayList<String>();
		
		/*for(String n:vehicles) {
			Vehiclesuppercase.add(n.toUpperCase());
		}
		System.out.println(Vehiclesuppercase); 		//before java 8 streams
		*/
		Vehiclesuppercase = vehicles.stream().map(n1->n1.toUpperCase()).collect(Collectors.toList());
		System.out.println(Vehiclesuppercase); 	
	}

}
