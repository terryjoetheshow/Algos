//Time Complexity:
//Best: O(n)
//Avg: O(n^2)
//Worse: O(n^2)

//each loop, move the current biggest to the right 
//until reaching a bigger one, then move to bigger one right until 
//the biggest one is at the end

public class BubbleSort extends Sort {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		//int[] inputArr = {-5, 1, -5, 1, 5, 1};
		BubbleSort s = new BubbleSort();
		s.sort(inputArr);
		s.DisplayArray(inputArr);
		System.out.println("Bubble sort");
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		doBubbleSort();
	}
	
	private void doBubbleSort() {
		int temp;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length - i - 1; j++) {
				if (array[j] > array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
}
