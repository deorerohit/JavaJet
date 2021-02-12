class HeapSort{
	public static void main(String[] args){
		int arr[] = {10 ,20 ,30 ,40 ,50 ,60 ,70 ,80 ,90 ,100 ,15 ,25 ,35 ,45 ,55 ,65 ,75 ,85 ,95 ,105};
		
		NewClass ms = new NewClass();				
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		ms.sort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}
}

class NewClass{
	
	
	public void sort(int[] arr){
		
		int n = arr.length;
		
		for(int i = n/2-1 ; i>=0 ;i--){
			heapify(arr, n , i);
		}
		
		
		for(int i=n-1 ; i>=0 ; i--){
			int temp = arr[i];
			arr[i]= arr[0];
			arr[0]=temp;
			
			heapify(arr, i, 0);
		}
		
	}
	
	
	public void heapify(int[] arr, int n, int i) {
		int largest = i;
		int leftChild = 2*i+1;
		int rightChild = 2*i+2;
		
		if( leftChild<n && arr[leftChild] > arr[largest])
			largest=leftChild;
		
		if(rightChild<n && arr[rightChild] > arr[largest])
			largest=rightChild;
			
		if(largest!=i){
			int temp=arr[i];
			arr[i] = arr[largest];
			arr[largest]= temp;
			
			heapify(arr, n, largest);
		}
	}
	
}

