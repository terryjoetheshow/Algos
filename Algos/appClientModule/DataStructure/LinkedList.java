package DataStructure;

//Nodes in linkedList class
class Node {
	
	public int data;
	public Node next;
	
	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
}

public class LinkedList {

	public static void main(String[] args) {
		//Test LinkedList
		LinkedList list = new LinkedList();
		list.Add(1);
		list.Add(2);
		list.Add(5);
		list.Add(-1);
		list.PrintList();
		list.Remove(-1);
		list.Remove(2);
		list.Remove(0);
		list.PrintList();
		list.Remove(1);
		list.Remove(5);
		list.Remove(0);
		list.PrintList();
	}
	
	public LinkedList() {
		head = null;
		tail = null;
		size = 0;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public Node getHead() {
		return head;
	}
	
	public Node getTail() {
		return tail;
	}
	
	public int getSize() {
		return size;
	}
	
	public void Add(int value) {
		Node newNode = new Node(value, null);
		
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		else 
		{
			Node temp = tail;
			temp.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void Remove(int data) {
		if (size == 0)
			return;
		
		Node curr = head;
		
		if (curr.data == data) {
			head = curr.next;
			size--;
			if (size == 0)
				tail = null;
			return;
		}
		
		while (curr.next != null) {
			if (curr.next.data == data) {
				break;
			}
			curr = curr.next;
		}
		
		//could not find data in list
		if (curr.next == null)
			return;
		
		//remove curr.next and re-point curr.next
		if (curr.next == tail)
			tail = curr;
		curr.next = curr.next.next;		
		size--;
	}
	
	public void PrintList() {
		Node curr = head;
		while (curr != null) {
			System.out.print(curr.data + " ");
			curr = curr.next;
		}
		System.out.println("size = " + size);
	}
}

