
import java.util.*;
class BinarySearch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		BinarySearch bs = new BinarySearch();
		int arr[] = {10,20,30,40,50,60,70,80,90,100,
						15,25,35,45,55,65,75,85,95,105,
						11,21,31,41,51,61,71,81,91,101,
						13,23,33,43,53,63,73,83,93,103};
		
		System.out.print("No. to search : " );
		int key = sc.nextInt();
		Arrays.sort(arr);
		int n = arr.length;		
	
		
		System.out.println(key+" found at "+ binaryNonRecurrsive(arr, 0, n-1, key) +" index ( Non Recurrsive)" );
		System.out.println(key+" found at "+ bs.binaryRecurrsive(arr, 0, n-1, key) +" index ( Recurrsive)" );
		
	}
	
	
	public static int binaryNonRecurrsive(int arr[], int l, int r, int noToFind){
		
		while(l<=r) {
			int mid = l + (r-l)/2;
			if(arr[mid]==noToFind){
				return mid;
			}
			else if(arr[mid] > noToFind){
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		return -1;
	}
	
	
	public int binaryRecurrsive(int arr[], int l, int r, int noToFind){
		
		if(l<=r){
			int mid = l+(r-l)/2;
			if(arr[mid]==noToFind)
				return mid;
			else if(arr[mid] > noToFind){
				return binaryRecurrsive(arr, l, mid-1, noToFind);
			}
			else{
				return binaryRecurrsive(arr, mid+1, r, noToFind);
			}
		}
		
		return -1;
	}
}