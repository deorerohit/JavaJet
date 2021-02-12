import java.util.*;



class AdjacencyList{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of vertices : ");
		int ver = sc.nextInt();
		
		Map<Integer, List<Integer>> lMap = new HashMap<>();
		
		for(int i=0;i<ver;i++){
			lMap.put(i, new ArrayList<>());
		}
		
		char carryOn='y';
		do{
			System.out.print("Enter the edges : ");
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			List<Integer> listFromMap = lMap.get(v1);
			listFromMap.add(v2);
			lMap.put(v1, listFromMap);
			
			listFromMap = lMap.get(v2);
			listFromMap.add(v1);
			lMap.put(v2, listFromMap);
			
			System.out.print("Continue : ");
			carryOn=sc.next().charAt(0);
		}while(carryOn=='y' || carryOn=='Y');
		
		
		for(int i=0;i<ver;i++){
			List<Integer> currList = lMap.get(i);
			System.out.println("Vertex "+i+" : "currList);
		}
	
		
	}
}