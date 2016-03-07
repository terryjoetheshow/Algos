//Time Complexity
//Best: O(n log(n))
//Avg: O(n log(n))
//Worst: O(n^2)

//Space Complexity: O(n log(n))

public class QuickSort extends Sort {

	public static void main(String[] args) {
		int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		//int[] inputArr = {6, 5, 1, 3, 8, 4, 7, 9, 2};
		QuickSort s = new QuickSort();
		s.sort(inputArr);
		s.DisplayArray(inputArr);
		System.out.println("Quick sort");
	}

	@Override
	public void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		doQuickSort(0, length - 1);
	}

	//divide and conquer, recursively perform partition
	public void doQuickSort(int low, int high) {
		if (low < high) 
		{
			int p = partition(low, high);
			doQuickSort(low, p - 1);
			doQuickSort(p + 1, high);
		}
	}
	
	//pick a pivot (last element)
	//move all the numbers smaller than it to the left of it
	public int partition(int low, int high) {
		int temp;
		int pivot = array[high];
		int wall = low;
		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				temp = array[wall];
				array[wall] = array[j];
				array[j] = temp;
				wall++;
			}
		}
		temp = array[wall];
		array[wall] = array[high];
		array[high] = temp;
		return wall;
	}
}
