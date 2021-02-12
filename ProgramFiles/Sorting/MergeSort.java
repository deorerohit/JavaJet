class MergeSort{
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

		int size = arr.length;
		if(size<2)
			return;
			
		int mid = size/2;
		int[] left = new int[mid];
		int[] right = new int[size-mid];
		
		for(int i=0; i<mid; i++){
			left[i] = arr[i];
		}
		for(int i=mid; i<size; i++){
			right[i-mid] = arr[i];
		}
		
		sort(left);
		sort(right);
		merge(left, right, arr);
	}
	
	public void merge(int[] left, int[] right, int[] arr){
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<left.length && j<right.length){
			if(left[i] < right[j]){
				arr[k] = left[i];
				++i;
				++k;
			}
			else{
				arr[k] = right[j];
				++j;
				++k;
			}
		}
		while(i<left.length){
			arr[k] = left[i];
			++i;
			++k;
		}
		while(j<right.length){
			arr[k] = right[j];
			++j;
			++k;
		}
	}
}

