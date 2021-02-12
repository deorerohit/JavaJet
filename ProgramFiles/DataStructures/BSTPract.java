import java.util.*;
class Node{
		public int data;
		Node next;
		Node prev;
		
		public Node(int data){
			this.data = data;
			this.next=null;
			this.prev=null;
		}
}

class CreateBST{
	
	Node head;
	Node currentHead;
	
	public CreateBST(){
		head=null;
	}
	
	public void createNode(int data){
		currentHead = new Node(data);
		if(this.head==null)
		 	this.head=currentHead;
		else
			attachData(this.head, currentHead);
	}
	
	public void attachData(Node head, Node currentHead){
		if(head.data<currentHead.data){
			if(head.next==null)
				head.next=currentHead;
			else
				attachData(head.next, currentHead);
		}
		else if(head.data>currentHead.data){
			if(head.prev==null)
				head.prev=currentHead;
			else	
				attachData(head.prev, currentHead);
		}
	}
	
	
	public void preOrderNonRecurrsive(){
		Node temp = head;
		Stack<Node> stack = new Stack<>();
		stack.push(temp);
		
		while(!stack.isEmpty()){
			Node currentNode = stack.pop();
			System.out.println(currentNode.data);
			if(currentNode.next!=null)
				stack.push(currentNode.next);
			if(currentNode.prev!=null)
				stack.push(currentNode.prev);
		}
	}
	
	public void preorder(Node head){
			if(head==null)
			return;
		
		System.out.println(head.data);
		preorder(head.prev);
		preorder(head.next);
	}
	
	
	
	public void inOrderNonRecurrsive(){
			Node temp = head;
			Stack<Node> stack = new Stack<>();
			while(stack.size()>0 || temp!=null){
				while(temp!=null){
					stack.push(temp);
					temp=temp.prev;
				}
				temp = stack.pop();
				System.out.println(temp.data);
				temp=temp.next;
			}
		}
	
	public void inorder(Node head){
			if(head==null)
			return;
		
		inorder(head.prev);
		System.out.println(head.data);
		inorder(head.next);
	}
	
	
	
	public void postOrderNonRecurrsive(){
		Node temp = head;
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		
		s1.push(temp);
		while(!s1.isEmpty()){
			Node curr = s1.pop();
			s2.push(curr);
			if(curr.prev!=null)
				s1.push(curr.prev);
			if(curr.next!=null)
				s1.push(curr.next);
		}
		
		while(!s2.isEmpty())
		System.out.println(s2.pop().data);
	}
	
	public void postorder(Node head){
			if(head==null)
			return;
		
		postorder(head.prev);
		postorder(head.next);
		System.out.println(head.data);
	}
	
	
	public void serachBST(int noToSearch){
		Node temp = head;
		
		while(temp!=null){
			if(temp.data == noToSearch){
				System.out.println(temp.data+" is found at "+temp+" location");
				return;
			}
			else{
				if(noToSearch < temp.data)
					temp=temp.prev;
				else if(noToSearch > temp.data)
					temp=temp.next;
			}
		}
	}
	
	//Breadth First Search
	public void leverOrderTraversing(){
		Node temp = head;
		Queue<Node> que = new LinkedList<>(); 
		que.add(temp);

		while(!que.isEmpty()){
			Node currentNode = que.remove();
			if(currentNode.prev!=null)
				que.add(currentNode.prev);
			if(currentNode.next!=null)	
				que.add(currentNode.next);
			System.out.println(currentNode.data);	
		}
	}
	
	
	public int findHeight(Node temp){

		if(temp==null)
			return -1;
		
		int lHeight = findHeight(temp.prev);
		int rHeight = findHeight(temp.next);
		
		if(lHeight>rHeight)
			return lHeight+1;
		else
			return rHeight+1;
	}
	
	public void deleteNode(int noToDelete){
		Node temp = head;
		Node prevOfTemp=head;
		
		while(noToDelete!=temp.data){
			
				if(noToDelete<temp.data){
					prevOfTemp=temp;
					temp=temp.prev;
				}
				
				if(noToDelete>temp.data){
					prevOfTemp=temp;
					temp=temp.next;
				}
				if(temp==null){
						System.out.println("No not found");
						break;
				}
			}
			
			if(temp!=null && temp.prev==null && temp.next==null){
				System.out.println("No. deleted "+temp.data);
				if(prevOfTemp.next==temp)
					prevOfTemp.next=null;
				else
					prevOfTemp.prev=null;
			}
			else if(temp!=null && temp.prev==null){
				System.out.println("No. deleted "+temp.data);
				if(prevOfTemp.next==temp){
					prevOfTemp.next = temp.next;
					temp=null;
				}
				else{
					prevOfTemp.prev = temp.next;
					temp=null;
				}
			}
			else if(temp!=null && temp.next==null){
				System.out.println("No. deleted "+temp.data);
					if(prevOfTemp.next == temp){
						prevOfTemp.next = temp.prev;
						temp=null;
					}
					else{
						prevOfTemp.prev= temp.prev;
						temp=null;
					}
			}
			else{
				Node prevOfSuccessor = null;
				Node inOrderSuccessor=temp.next;
				
				while(inOrderSuccessor.prev!=null){
					prevOfSuccessor=inOrderSuccessor;
					inOrderSuccessor=inOrderSuccessor.prev;
				}
				
				if(inOrderSuccessor.next!=null){
					prevOfSuccessor.prev=inOrderSuccessor.next;
				}
				
				if(prevOfTemp.prev==temp){
					prevOfTemp.prev=inOrderSuccessor;
					inOrderSuccessor.prev=temp.prev;
					if(temp.next != inOrderSuccessor)
					inOrderSuccessor.next = temp.next;
						System.out.println("No. deleted "+temp.data);
					temp=null;
				}
				else{
					prevOfTemp.next = inOrderSuccessor;
					inOrderSuccessor.prev=temp.prev;
					if(temp.next != inOrderSuccessor)
					inOrderSuccessor.next = temp.next;
						System.out.println("No. deleted "+temp.data);
					temp=null;
				}
				
			}
	}
}


public class BSTPract{
//	Node head;
	public static void main(String[] args){
	CreateBST createBST = new CreateBST();
	createBST.createNode(25);
	createBST.createNode(10);
	createBST.createNode(30);
	createBST.createNode(5);
	createBST.createNode(20);
	createBST.createNode(3);
	createBST.createNode(6);
	createBST.createNode(15);
	createBST.createNode(21);
	createBST.createNode(16);
	

	//createBST.serachBST(3);
	
	//Breadth first search
	//createBST.leverOrderTraversing();
	
	//Depth first search
	//createBST.preOrderNonRecurrsive();
	//createBST.inOrderNonRecurrsive();
	//createBST.postOrderNonRecurrsive();
	//createBST.preorder(createBST.head); 
	createBST.inorder(createBST.head);
	//createBST.postorder(createBST.head);
	
	//System.out.println(createBST.findHeight(createBST.head));
	
	createBST.deleteNode(25);
	createBST.inorder(createBST.head);
	
	}
}