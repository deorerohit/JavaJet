import java.util.stream.*;
import java.util.*;







class StreamWithList{
	
	
	
	
	public static void main(String[] args){
	
		
	
		
		System.out.println("\n*******\n");
		List<String> list = Arrays.asList("Rohit", "Balwant", "Deore", "Shaila", "Shweta", "shuBh");	
	
		list
			.stream()
			.map(String::toLowerCase)
			.sorted()
			.filter(x->x.startsWith("s"))
			.forEach(x->System.out.print(x+" "));
			//.forEach(System.out::print);
	
	}
}