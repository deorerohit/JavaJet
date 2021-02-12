
import java.util.*;

class MapPract{
	
	public static void main(String[] args){
		Map<Integer , String> map0 = new HashMap<>();
		map0.put(4,"Rohit");
		map0.put(5,"Tejas");
		map0.put(6,"Dhairya");
		
		map0.put(1,"Rohit");
		
		map0.put(2,"Dhairya");
		map0.put(3,"Tejas");
		
		
		Set<Integer> keySet0 = map0.keySet();
		
		for(Integer i : keySet0){
			System.out.println(i);
		}
		
		System.out.println("************************");
		
		
		
		Map<Integer, String> map = new LinkedHashMap<>();
		map0.put(4,"Rohit");
		map0.put(5,"Tejas");
		map0.put(6,"Dhairya");
		map.put(1,"Rohit");
		map.put(2,"Dhairya");
		map.put(3,"Tejas");
		
		Set<Integer> keySet = map.keySet();
		
		for(Integer i : keySet){
			System.out.println(i);
		}
		
	}
}