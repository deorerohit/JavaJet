class QuickSort{
	public static void main(String[] args){
		int arr[] = {10 ,20 ,30 ,40 ,50 ,60 ,70 ,80 ,90 ,100 ,15 ,25 ,35 ,45 ,55 ,65 ,75 ,85 ,95 ,105};
		
		NewClass ms = new NewClass();				
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		ms.sort(arr, 0, arr.length-1);
		for(int i : arr)
			System.out.print(i+" ");
	}
}


class NewClass{
	public void sort(int[] arr, int start, int end){
		if(start>=end)
			return;
		
		int pIndex = partion(arr, start, end);
		sort(arr, start, pIndex-1);
		sort(arr, pIndex+1, end);
	}
	
	
	public int partion(int[] arr, int start, int end){
				
		int pivot = arr[end];
		int pIndex = start;
		
		for(int i=start ; i<=end-1 ; i++){
			if(arr[i]<pivot){
				int temp = arr[pIndex];
				arr[pIndex] = arr[i];
				arr[i] = temp;
				++pIndex;
			}
		}
		arr[end]=arr[pIndex];
		arr[pIndex] = pivot;
		return pIndex;
	}
}