
import java.util.stream.*;

class IntegerStreamExample{
	public static void main(String[] args){
		
		
		//1 Integer Stream
		
		System.out.println("\n*******\n");
		IntStream
				.range(1, 10)
				.forEach(System.out::print);
				
		
		
		
		
		System.out.println("\n*******\n");
		IntStream
			.range(1, 10)
			.skip(5)        //skip first five
			.forEach(x->System.out.print(x+" "));
			
			
		
		
		
		
		System.out.println("\n*******\n");
		System.out.println(
			IntStream
				.range(1, 5)
			  //.skip(1)
				.sum()
		);
	}
}