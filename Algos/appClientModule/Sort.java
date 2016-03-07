//Merge, Quick Sort both divide the array into partitions
//Generally speaking the depth of these partitions tree will be base-2 log(n)
//At the each level of the recursive partition tree, the number of comparisons needed is n, 
//hence, time complexity avg = O(n log(n))

//base class for all sorting algorithms
public abstract class Sort {
	
	public int[] array;
	public int length;
	
	public abstract void sort(int inputArr[]);
	
	protected void DisplayArray(int[] inputArr) {
		for (int i:inputArr) {
			System.out.print(i + " ");
		}
	}
}
