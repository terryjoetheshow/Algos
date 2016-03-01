//Time Complexity
//Best: O(n log(n))
//Avg: O(n log(n))
//Worst: O(n log(n))

//Space Complexity: O(n)

public class MergeSort extends Sort {

	private int[] tempMergArr;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputArr = {45, 23, 11, 89, 77, 98, 4, 28, 65, 43};
		int[] inputArr = {4, 4, 4, 4};
		MergeSort s = new MergeSort();
		s.sort(inputArr);
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
        
        //only need to iterate the left side of the merge
        //because, if i > midIndex, it means whatever remains on the right side must be bigger than the rest. 
        //so do not need to do anything more, because the remainders are sorted already
        //if i <= midIndex, it means, whatever remains on the left side are all bigger than the rest.
        //but they're not in the correct spot in the final array, so move them all over to fill the remaining slots.
        //They are already sorted, so can move in chunks.
 
        while (i <= midIndex) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }
 
	}
	
}
