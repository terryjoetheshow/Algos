//Time complexity
//Best: O(n log(n))
//Avg: O(n log(n))
//Worst: O(n log(n))

public class HeapSort extends Sort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		//int[] inputArr = {1, 3, 2, 4, 5};
		//int[] inputArr = {6, 5, 1, 3, 8, 4, 7, 9, 2};
		HeapSort s = new HeapSort();
		s.sort(inputArr);
		for (int i:inputArr) {
			System.out.print(i + " ");
		}
		System.out.println("heap sort");
	}

	@Override
	public void sort(int[] inputArr) {
		array = inputArr;
		length = inputArr.length;
		doHeapSort();
	}

	public void doHeapSort() {
		heapify(); //After heapify, max number will be in the root node
		int end = length - 1;
		while (end > 0) {
			swap(end, 0); //swap max number to the last node
			end--; //take out the last node
			siftDown(0, end); //heapify to make a heap so the max number is at the root.  
		}
	}
	
	//start from the lowest parent node to root node in the tree, perform siftDown
	public void heapify() {
		int start = iParent(length-1);
		while (start>= 0) {
			siftDown(start, length - 1);
			start--;
		}
	}
	
	public void siftDown(int start, int end) {
		int root = start;
		int temp;
		
		while (iLeftChild(root) <= end) { //has a child?
			
			int child = iLeftChild(root); //get index of left child
			temp = root; //default swap with itself
			if (array[temp] < array[child]) //if root < child then consider left child a swap candidate
				temp = child;
			if ((child + 1 <= end) && (array[temp] < array[child+1])) { //has right child? right child greater than left child? swap with right child instead
				temp = child + 1;
			}
			
			if (temp == root) {
				return; //if children are smaller, then do nothing
			}
			else {
				swap(temp, root);
				root = temp;
			}
		}
	}
	
	public void swap(int index1, int index2) {
		try {
			int temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}
		return;
	}
	
	public int iParent(int i) {
		double temp = (i-1) / 2.0;
		return (int)Math.floor(temp);
	}
	
	public int iLeftChild(int i){
		return 2 * i + 1;
	}
	
	public int iRightChild(int i) {
		return 2 * i + 2;
	}
	
}
