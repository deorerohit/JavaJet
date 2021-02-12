
import java.util.*;

class AdjacencyMatrix {
	public static void main(String[] args){
		
		
		int[][] graph = new int[ver][ver];
		
		
		char carryOn='y';
		do{
			System.out.print("Enter the edges : ");
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			graph[v1][v2]=1;
			graph[v2][v1]=1;
			System.out.print("Continue : ");
			carryOn=sc.next().charAt(0);
		}while(carryOn=='y' || carryOn=='Y');
	
	
		for(int i=0;i<ver;i++){
			for(int j=0;j<ver;j++){
				System.out.print(graph[i][j]+" ");
			}
			System.out.println();
		}
	
	}
}