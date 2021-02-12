// Java code for stack implementation 

import java.io.*; 
import java.util.*; 

class StackPractie 
{ 
	// Pushing element on the top of the stack 
	


	public static void main (String[] args) 
	{ 
		Stack<Integer> s = new Stack<>();
		
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		System.out.println(s.peek());
		System.out.println(s.peek());
		int i=0;
		
		System.out.println(s);
		
		while(!s.empty())
		{
			System.out.println(s.pop()+" "+i);
			i++;
		}
		
			
	} 
} 
