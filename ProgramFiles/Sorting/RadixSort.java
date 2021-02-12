import java.lang.Math.*;
class RadixSort{
	public static void main(String[] args){
		int arr[] = {82, 901, 100, 12, 150, 77, 55, 23};
		
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
		int max = findMax(arr);
		int digitsInMax = findDigits(max);
		
		for(int i=1 ; i<= digitsInMax ; ++i){
			int[] count = new int[10];
			int[] outputArr = new int[arr.length];
			int div = (int)(Math.pow(10, i))/10;
			int rem = (int)Math.pow(10, i);
			
			for(int j=0 ; j<arr.length ; j++){
				int digit = arr[j]%rem;
				digit=digit/div;
				++count[ digit ];
			}
			
			for(int j=1 ; j<count.length ; j++){
				count[j]=count[j]+count[j-1];
			}
			
			for(int j = arr.length-1 ; j>=0 ; j--){
				int digit = arr[j]%rem;
				digit=digit/div;
				--count[digit];
				int value = count[digit];
				outputArr[value] = arr[j];
			}
			arr=outputArr;
	    }
		return arr;
	}
	
	
	
	
	
	public int findMax(int[] arr){
		int max = arr[0];
		for(int i=0;i<arr.length;i++){
			if(max<arr[i])
			max=arr[i];
		}
		return max;
	}
	
	public int findDigits(int max){
		int count =0;
		
		if(max==0)
			return 1;
		while(max!=0){
			max=max/10;
			++count;
		}
		return count;
	}
}

