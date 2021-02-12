
import java.util.*;
class HeapDataStructure{
	final static int SIZE = 15;
	public static void main(String[] args){
		
		
		int emptyIndex=0;
		
		//to keep it simple and easy to understand i had used array otherwise arraylist can be used 
		int[] arr = new int[SIZE];

		NewClass nc = new NewClass();
		emptyIndex = nc.insert(arr, 70, emptyIndex);
		emptyIndex = nc.insert(arr, 50, emptyIndex);
		emptyIndex = nc.insert(arr, 40, emptyIndex);
		emptyIndex = nc.insert(arr, 45, emptyIndex);
		emptyIndex = nc.insert(arr, 35, emptyIndex);
		emptyIndex = nc.insert(arr, 39, emptyIndex);
	    emptyIndex = nc.insert(arr, 16, emptyIndex);
		emptyIndex = nc.insert(arr, 10, emptyIndex);
		emptyIndex = nc.insert(arr, 9, emptyIndex);
		emptyIndex = nc.insert(arr, 8, emptyIndex);
		emptyIndex = nc.insert(arr, 7, emptyIndex);
		emptyIndex = nc.insert(arr, 6, emptyIndex);
	    emptyIndex = nc.insert(arr, 5, emptyIndex);
		emptyIndex = nc.insert(arr, 4, emptyIndex);
		emptyIndex = nc.insert(arr, 3, emptyIndex);
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		
		
		
		
		emptyIndex = nc.delete(arr, emptyIndex);
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		
		emptyIndex = nc.insert(arr, 100, emptyIndex);
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
			
	}
}


class NewClass{
	
	public int insert(int[] arr, int noToInsert, int emptyIndex){
		
		if(emptyIndex<HeapDataStructure.SIZE){
			arr[emptyIndex]= noToInsert;
			int cIndex = emptyIndex;
			int pIndex = (emptyIndex-1)/2;
			while(arr[pIndex] < arr[cIndex]){
				int temp = arr[pIndex];
				arr[pIndex] = arr[cIndex];
				arr[cIndex] = temp;
				cIndex=pIndex;
				pIndex = (cIndex-1)/2;
			}	
			++emptyIndex;
		}
		else{
			System.out.println("Heap is full");
		}
		return emptyIndex;
	}
	
	
	
	public int delete(int[] arr, int emptyIndex){
		
		int lastIndex = emptyIndex-1;
		if(arr[0] != 0){
			arr[0]=arr[lastIndex];
			arr[lastIndex]=0;
			int pIndex = 0;
			int leftChild = (2*pIndex)+1;
			int rightChild = (2*pIndex)+2;
			
			while(leftChild<=lastIndex && rightChild<= lastIndex){
				
				int biggerChild = (arr[leftChild]> arr[rightChild]) ? leftChild : rightChild;
				
				if(arr[pIndex] < arr[biggerChild]){
					int temp = arr[pIndex];
					arr[pIndex] = arr[biggerChild];
					arr[biggerChild] = temp;
					pIndex=biggerChild;
					leftChild = (2*pIndex)+1;
			        rightChild = (2*pIndex)+2;
				}
				else{
					break;
				}
			}
			--emptyIndex;
		}
		else{
			System.out.println("Empty hash");
		}
		
		return emptyIndex;
	}
}