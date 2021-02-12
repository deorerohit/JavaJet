
import java.util.*;

class ListPractice
{
    public static void main(String[] args)
	{
		List<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(100);
		values.add(99);
		values.add(100000000);
		values.add(789);
		/* values.add("Rohit Deore");
		values.add(123.4f);
		values.add(123.567); */
		
		for(Object i : values)
			System.out.println(i);
		
		
		Iterator it = values.iterator();
		while(it.hasNext())
		System.out.println(it.next());
	
	    Comparator<Integer> com = (Integer i1 , Integer i2)->
			{
				if(i1>i2)
					return 1;
				
				return -1;
			}
		;
		
		Collections.sort(values,com);
		
		
		for(Object i : values)
			System.out.println(i);
		
	}
}