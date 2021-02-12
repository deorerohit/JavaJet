

class CountingSort{
	public static void main(String[] args){
		int[] arr = {2,1 ,1 ,0 ,2 ,5 ,4 ,0 ,2 ,8 ,7 ,7 ,9 ,2 ,0 ,1, 9};
		
		NewClass ms = new NewClass();				
		for(int i : arr)
			System.out.print(i+" ");
		System.out.println();
		arr=ms.sort(arr);
		for(int i : arr)
			System.out.print(i+" ");
	
	}
}


class NewClass{
		public int[] sort(int[] arr){
			int[] count = new int[10];
			int[] outputArr = new int[arr.length];
			
			for(int i=0; i<arr.length; i++){
				++count[arr[i]];
			}
			
			for(int i=1;i<count.length;i++){
				count[i] = count[i]+count[i-1];
			}
			
			for(int i=arr.length-1 ; i>=0 ; i--){
				--count[ arr[i] ];
				int value = count[arr[i]];
				outputArr[value] = arr[i];
			}
			return outputArr;
		}
}