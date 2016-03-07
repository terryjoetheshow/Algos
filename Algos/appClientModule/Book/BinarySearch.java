package Book;

public class BinarySearch {

	int[] array;
	
	public BinarySearch(int[] array) {
		this.array = array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		BinarySearch bs = new BinarySearch(sortedArray);
		System.out.println(bs.find(1, 0, sortedArray.length-1));
		System.out.println(bs.find(-1, 0, sortedArray.length-1));
		System.out.println(bs.find(5, 0, sortedArray.length-1));
		System.out.println(bs.find(6, 0, sortedArray.length-1));
		System.out.println(bs.find(10, 0, sortedArray.length-1));
		System.out.println(bs.find(11, 0, sortedArray.length-1));
		
	}

	public int find(int searchKey, int low, int high) {
		int mid = (low + high) / 2;
		if (array[mid] == searchKey) // done
		{
			return mid;
		}
		else if (low == high)
			return -1;		
		else if (searchKey < array[mid]){
			return find(searchKey, low, mid);
		}
		else {
			return find(searchKey, mid+1, high);
		}
	}
	
}
