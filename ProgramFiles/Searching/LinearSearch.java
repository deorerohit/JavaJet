


import java.util.*;

class LinearSearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = {10,20,30,40,50,60,70,80,90,100,
						15,25,35,45,55,65,75,85,95,105,
						11,21,31,41,51,61,71,81,91,101,
						13,23,33,43,53,63,73,83,93,103};
		
		System.out.print("No. to search : " );
		int key = sc.nextInt();
		
		System.out.println(key+" found at "+ search(arr, key) +" index" );
					
		
	}
	
	public static int search(int [] arr, int key){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==key){
				return i;
			}
		}
		return -1;
	}
}