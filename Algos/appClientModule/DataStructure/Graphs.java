package DataStructure;


class GraphNode {
	int value;
	boolean visited;
	GraphNode next;
	GraphNode[] neighbours;
	
	GraphNode(int value) {
		this.value = value;
	}
	
	GraphNode(int value, GraphNode[] nodes)	{
		this.value = value;
		this.neighbours = nodes;
	}

	public String toString() {
		return "value = " + this.value;
	}
}

class Queue {
	GraphNode first, last;
	
	public void enqueue(GraphNode node) {
		if (first == null) {
			first = node;
			last = node;
		}
		else {
			last.next = node;
			last = node;
		}
	}
	
	public GraphNode dequeue() {
		GraphNode result;
		if (first == null)
			return null;
		else {
			//must create new instance, otherwise assigning first is by referring, the next line changes it.
			GraphNode temp = new GraphNode(first.value, first.neighbours);
			first = first.next; 
			result = temp;
		}
		return result;
	}
}

public class Graphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
