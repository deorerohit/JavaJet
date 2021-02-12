



interface Addition{
	public int add(int a, int b);
	
	
}

class LambdaWithParameters{
	public static void main(String[] args){
		
		
		Addition a1 =(int x, int y)->{
				return x+y;	
			}
		;
		
		Addition a2 = (x,y)->(x+y);
		
		
		System.out.println(a1.add(10,20));
		System.out.println(a2.add(14,26));
	}
}