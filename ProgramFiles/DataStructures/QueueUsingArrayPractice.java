


class Queue
{
	private static int size = 6; 
	public static int currentSize=0;
	
	Integer[] queue = new Integer[size];
	
	int front=0;
	int rear=0;
	
	void enQueue(no)
	{
	   if(currentSize!=size)
	   {
		   queue[rear]=new Integer[no];
           rear=(rear+1)%size;	
           currentSize++;
	   }		   
	   else
	   {
		   System.out.println("Queue is FUll");
	   }		   
	      
	}
	
	int deQueue()
	{
		
		if(currentSize!=0)
		{
		  int toReturn=queue[front];
		  queue[front]=0;
		  front=(front+1)%size;
		  currentSize--;
		  return toReturn;
		}
		else
		{
			System.out.println("Queue is Empty");
			return 0;
		}
	}
	
	void display()
	{
		for(int i=0;i<currentSize;i++)
		System.out.println(queue[(front+i)%size]+" ");
	}
	
	void reset()
	{
		for(int i=0;i<size;i++)
			queue[i]=0;
	}
	
}



class QueueUsingArrayPractice
{
	public static void main(String[] args)
	{
	Queue q = new Queue();
	
	q.enQueue(1);
	q.enQueue(3);
	q.enQueue(5);
	q.enQueue(7);
	q.enQueue(9);
	q.enQueue(11);
	q.enQueue(13);
	
	
	q.display();
	
	q.reset();
	
	/* System.out.println("************deQuing***************");
	
	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
	System.out.println(q.deQueue());
	 */
	
	}
}