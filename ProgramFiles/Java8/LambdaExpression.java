

//too much of boilerplate code


/* interface Shape{
	public void drawShape();
}


class Circle implements Shape{
	public void drawShape(){
		System.out.println("Draw circle");
	}
}


class Triangle implements Shape{
	public void drawShape(){
		System.out.println("Draw triangle");
	}
}



class LambdaExpression{
	public static void main(String[] args){
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		circle.drawShape();
		triangle.drawShape();
	
	}
} 

 */








//using anonymous inner class


 /* interface Shape{
	public void drawShape();
}


class LambdaExpression{
	public static void main(String[] args){
		
		Shape circle = new Shape(){
			public void drawShape(){
				System.out.println("Draw circle");
			}
		};
		
		
		Shape triangle = new Shape(){
			public void drawShape(){
				System.out.println("Draw triangle");
			}
		};
		
		
		circle.drawShape();
		triangle.drawShape();
	}
}
 
 */





//using lambdas


interface Shape{
	public void drawShape();
}

class LambdaExpression{
	public static void main(String[] args){
		
		Shape circle =()->{
				System.out.println("Draw circle");
			}
		;
		
		
		Shape triangle = ()->{
				System.out.println("Draw triangle");
			}
		;
		
		
		circle.drawShape();
		triangle.drawShape();
	}
} 