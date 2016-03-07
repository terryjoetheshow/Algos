//each loop move min of the list to the left

public class SelectionSort extends Sort{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		SelectionSort sort = new SelectionSort();
		sort.sort(inputArr);
		sort.DisplayArray(inputArr);
		System.out.println("Selection Sort");
	}

	@Override
	public void sort(int[] inputArr) {
		this.array = inputArr;
		this.length = inputArr.length;
		
		int minIndex;
		for(int i = 0; i < length; i++) {
			minIndex = i;
			for (int j = i+1; j < length; j++) {
				if (array[j] < array[minIndex])
					minIndex = j;
				
			}
			if (i != minIndex) {
				//swap
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}		
		}	
	}
}
