package dsa450;

public class linkedListLess1 {
	
	

	public static void main(String[] args) {
		
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		n3.next=null;
		Node curr=head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr=curr.next;
		}
		

	}

}

class Node{
	int data;
	Node next;
	// making new node
	Node(int data){
		this.data=data;
	}
	
}
