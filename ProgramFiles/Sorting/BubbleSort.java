class BubbleSort{
	public static void main(String[] args){
		
		int arr[] = {5, 1, 4, 2, 8 };
						
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		sort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	}
	
	
	public static void sort(int[] arr){
		
		while(true){
			int check=0;
			for(int i=1 ; i<arr.length ; i++){
				if(arr[i]<arr[i-1]){
					int temp = arr[i];
					arr[i] = arr[i-1];
					arr[i-1] = temp;
					check=1;
				}
			}
			if(check == 0)
				break;
		}
	}
}


