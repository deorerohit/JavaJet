class SelectionSort{
	public static void main(String[] args){
		
		int arr[] = {10 ,20 ,30 ,40 ,50 ,60 ,70 ,80 ,90 ,100 ,15 ,25 ,35 ,45 ,55 ,65 ,75 ,85 ,95 ,105 };
						
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		sort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}

	public static void sort(int[] arr){
		for(int i =0 ; i<arr.length-1; i++){
			int min = i;
			for(int j=i+1 ; j<arr.length ; j++){
				if(arr[min]>arr[j])
				min=j;
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}


