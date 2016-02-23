
public class MergeSort extends Sort {

	private int[] tempMergArr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		int[] inputArr = {-5, 1, -5, 1, 5, 1};
		MergeSort mms = new MergeSort();
		mms.sort(inputArr);
		for (int i:inputArr) {
			System.out.print(i + " ");
		}
			
		
		System.out.println("Merge sort");
	}

	public void sort(int inputArr[]) {
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergArr = new int[length];
		doMergeSort(0, length - 1);
	}
	
	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int midIndex = (lowerIndex + higherIndex) / 2;
			doMergeSort(lowerIndex, midIndex);
			doMergeSort(midIndex + 1, higherIndex);

			mergeParts(lowerIndex, midIndex, higherIndex);
			
		}
	}

	//- assuming both left and right chunks are sorted
	//- compare each element of the left side vs the right side
	// - if left side is smaller, leave the element in place
	// - otherwise, copy the right side element over
	//- since the elements are already sorted
	private void mergeParts(int lowerIndex, int midIndex, int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = midIndex + 1;
        int k = lowerIndex;
        while (i <= midIndex && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                i++;
            } else {
                array[k] = tempMergArr[j];
                j++;
            }
            k++;
        }
        while (i <= midIndex) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
	}
	
}
