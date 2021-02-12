

import java.util.*;
class ForEachLambda{
	public static void main(String[] args){
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(7);
		list.add(11);
		list.add(16);
		
		
		System.out.println(list.contains(110));
		System.out.println(list.indexOf(11));
		System.out.println(list.poll());
		
		list.forEach((Integer n)->System.out.println(n));
		list.forEach((n)		->System.out.println(n));
		list.forEach( n			->System.out.println(n));
		
		
		
	}
}