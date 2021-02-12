import java.util.*;

class CreateQueue{
	
	private static final int SIZE=5;
	private Integer[] arrayQueue;
	private int currentSize;;
	private int back;
	private int front;
	
	public CreateQueue(){

		arrayQueue = new Integer[SIZE];
		this.back=0;
		this.front=0;
		this.currentSize=0;
	}
	
	
	public void insert(int value) {
		if(arrayQueue[back] == null){
			arrayQueue[back] = value;
			back = (back+1)%SIZE;
			++currentSize;
		}
		else{
			System.out.println("queue is full");
		}
	}
	
	public Integer delete() {
		if(arrayQueue[front] != null) {
			Integer valueToDelete = arrayQueue[front];
			arrayQueue[front] = null;
			front=(front+1)%SIZE;
			--currentSize;
			return valueToDelete;
		}
		else {
			System.out.println("Queue is empty");
			return null;
		}
	}
	
	public void display() {
		
		System.out.println("Elements in queue are");
		
		for(int i=0; i<5;i++) {
		System.out.println(arrayQueue[i]+ "   "+ currentSize);
		}
	}
}




class QueuePract{
		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			CreateQueue que = new CreateQueue();
			int choice=0;
			do{
				System.out.println(" 1) Insert\n 2) Delete\n 3)Display\n 4) Exit");
				choice = sc.nextInt();
				switch(choice){
					case 1: 
						System.out.print("No to add : ");
						que.insert(sc.nextInt());
						break;
					case 2:
						System.out.println("Deleted : "+que.delete());
						break;
					case 3: 
						que.display();
						break;
				}
			}while(choice != 4);
		}
}