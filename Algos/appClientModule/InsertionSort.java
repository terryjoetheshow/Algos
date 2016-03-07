//Time Complexity
//Best: O(n)
//Avg: O(n^2)
//Worst: O(n^2)

public class InsertionSort extends Sort{

	
	
	// TODO Auto-generated method stub
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		int[] inputArr = {-5, 1, -5, 1, 5, 1};
		InsertionSort s = new InsertionSort();
		s.sort(inputArr);
		s.DisplayArray(inputArr);
		System.out.println("Insertion sort");
	}


	@Override
	public void sort(int[] inputArr) {
		
		this.array = inputArr;
		this.length = inputArr.length;
		doInsertionSort();
	}
	
	public void doInsertionSort() {
		int temp;
		// TODO Auto-generated method stub
		for (int i = 1; i < length; i++) {
			for (int j = i; j > 0; j--) {
				if (array[j] < array[j-1]) {
					temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}				
	}
}
