package linkedlists_implementation;

class Node{
	String data;
	Node previous ;
	Node next;
	Node(String data){
	this.data = data;
	}
	Node head = null;
	Node tail = null;//end indicating the starting i.e head
	public void addNewNode(String data) {
		Node node = new Node(data);
		if(head == null) {
			head = node ;
			tail = node;
			head.previous= null;
			tail.next = null;	
		}
		else {
			tail.next = node;
			node.previous=tail;
			tail = node ;
			tail.next = null;
		}
	}
	public void show() {
		System.out.println();
		//Initialize a new node current that will point to the head
		Node current=head;
		//Check whether the DLL is empty or not
		if(head==null) {
			//Print a statement 
			System.out.println("List is empty");
			return;
		}
		System.out.println("Nodes of double linked list");
		//Iterate the DLL 
		while(current!=null) {
			System.out.println(current.data);
			current=current.next;
	}
}
}
public class Doubly_ll {

	public static void main(String[] args) {
		Node n = new Node("One");
		n.addNewNode("Two");
		n.addNewNode("Three");
		n.addNewNode("Four");
		n.addNewNode("Five");
		n.addNewNode("Six");
		n.addNewNode("Seven");
		n.show();

	}

}
