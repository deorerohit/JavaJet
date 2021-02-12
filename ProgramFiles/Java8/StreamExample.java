			
import java.util.stream.*;
import java.util.*;

class StreamExample{
	public static void main(String[] args){
		
		
		System.out.println("\n*******\n");
		
		Stream
			.of("Rohit", "Deore", "Ankur")
			.sorted()
			.findFirst()
			.ifPresent(System.out::print);
			
			
		
		
		System.out.println("\n*******\n");

		String[] names ={"Rohit", "Balwant",  "Shweta", "Shubh","Shaila"};
		Stream
			.of(names)
			.filter(x->x.startsWith("S"))
		  //.sorted()
			.forEach(System.out::println);
			
			
			
		
		
		System.out.println("\n*******\n");
		Arrays
			.stream(new int[] {2,4,6,8,10})
			.map(x->x*x)
			.average()
			.ifPresent(System.out::println);
		
	}
}