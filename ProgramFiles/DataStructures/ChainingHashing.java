import java.util.*;
class Node{
	int data;
	int probes;
	Node next;
	
	Node(int data){
		this.probes=0;
		this.data=data;
		this.next=null;
	}
	
}


class ChainingHashing{
	public static void main(String[] args){
					
			NewClass newClass = new NewClass();
			newClass.insert(3);
			newClass.insert(2);
			newClass.insert(9);
			newClass.insert(6);
			newClass.insert(11);
			newClass.insert(13);
			newClass.insert(7);
			newClass.insert(12);
			newClass.display();
			
			newClass.find(123);
	}
}


//Use Division method & Open Addressing to store these values(3,2,9,6,11,13,7,12) --jenny's lecture
// use h(k)=2k+3

class NewClass{
	private Map<Integer, Node>  cMap = new HashMap<>();
	
	public NewClass(){
		for(int i=0;i<=9;i++)
			cMap.put(i, null);
	}
	
	public void insert(int data){
		int key = ((2*data)+3) % 10;
		Node headNode = cMap.get(key);
		
		Node currentNode = new Node(data);
		++currentNode.probes;
		
		if(headNode==null){
			headNode=currentNode;
			cMap.put(key, headNode);
		}
		else{
			Node temp=headNode;
			while(temp.next!=null){
				++currentNode.probes;
				temp=temp.next;
			}
			++currentNode.probes;
			temp.next=currentNode;
			cMap.put(key, headNode);
		}
	}
	
	public void display(){
		for(int i=0;i<10;i++){
			Node disp = cMap.get(i);
			while(disp!=null){
				System.out.println("Key "+i+ " :  "+disp.data + " "+ disp.probes);
				disp=disp.next;
			}
			System.out.println();
		}
	}
	
	
	public void find(int noToFind){
		int key = ((2*noToFind)+3)%10;
		Node currentNode = cMap.get(key);
		int check=0;
		while(currentNode!=null){
			if(currentNode.data==noToFind){
				System.out.println(noToFind+" Number found : \nprobes : "+ currentNode.probes+"\nKey : "+key);
				++check;
				break;
			}
			currentNode=currentNode.next;
		}
		
		if(check==0)
		System.out.println("No not found");
		
	}
}