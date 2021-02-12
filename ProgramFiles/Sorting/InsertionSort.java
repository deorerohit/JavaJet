import java.util.*;
class InsertionSort{
	public static void main(String[] args){
		
		int arr[] = {10 ,20 ,30 ,40 ,50 ,60 ,70 ,80 ,90 ,100 ,15 ,25 ,35 ,45 ,55 ,65 ,75 ,85 ,95 ,105};
						
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		sort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	public static void sort(int[] arr){
		
		for(int i=1 ; i<arr.length ; i++){
			int current = arr[i];
			int j = i-1;
			while(j>=0){
				if(current < arr[j]){
					arr[j+1] = arr[j];
					--j;
				}
				else
					break;
			}
			arr[j+1] = current;
		}
	}
}