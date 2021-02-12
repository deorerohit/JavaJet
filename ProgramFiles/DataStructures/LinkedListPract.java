class Node {
	public int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}




class CreateLinkedList {
	
	Node head ;
	Node currendNode;
	Node reverseHead;
	
	
	public CreateLinkedList() {
		head=null;
		reverseHead=null;
	}
	
	
	
	public void addData(int data) {
		currendNode = new Node(data);
		
		if(head==null) {
			head=currendNode;
		}
		else {
			Node t = head;
			while(t.next != null) {
			t=t.next;
			}
			t.next = currendNode;
		}
	}
	
	
	
	
	
	public void showData() {
		Node display = head;
		
		while(display!=null) {
			System.out.println(display.data);
			display=display.next;
		}
		
	}
	
	public void showReverse() {
		Node display = reverseHead;
		
		while(display!=null) {
			System.out.println(display.data);
			display=display.next;
		}
		
	}
	
	
	
	public void deleteData(int data) {
		Node t = head;
		
		Node prev=t;
		
		if(t.data == data) {
			head=head.next;
			
		}
		else {
			
			while(t.data != data) {
				prev=t;
				t=t.next;
			
				if(t==null) {
					System.out.println("Data not present");
					break;
				}
			}
		
			if(t!=null)
				prev.next=t.next;
		}
		
	}
	
	
	public void reverseData() {
		Node t = head;
		Node temp=null;
		
		while(t!=null) {
			temp=new Node(t.data);
			
			if(reverseHead==null) {
				reverseHead=temp;
			}
			else {
				temp.next=reverseHead;
				reverseHead=temp;
			}
			t=t.next;
		}
		
	}
	
	public void reverseWithoutNewHead(){
		Node prev = null;
		Node upComing = head.next;
		
		while(head!=null){
			head.next = prev;
			prev=head;
			head = upComing;
			if(upComing!=null)
				upComing=upComing.next;
		}
		head=prev;
	}
}


class LinkedListPract {
	
	public static void main(String[] args) {
		
		CreateLinkedList l1 = new CreateLinkedList();
		
		
		l1.addData(1);
		l1.addData(2);
		l1.addData(3);
		l1.addData(4);
		l1.addData(5);
		l1.addData(6);
		l1.addData(1);
		l1.addData(2);
		l1.addData(3);
		l1.addData(4);
		l1.addData(5);
		l1.addData(6);
		
		
		
		l1.showData();
		
		
		/* l1.deleteData(3);
		l1.deleteData(5);
		l1.deleteData(1);
		l1.deleteData(6);
		l1.deleteData(11);
		
		System.out.println("Data deleted");
		l1.showData(); */
		
		
		//l1.reverseData();
		System.out.println("Data reverse");
		//l1.showReverse();
		l1.reverseWithoutNewHead();
		l1.showData();
		
	}
	
}