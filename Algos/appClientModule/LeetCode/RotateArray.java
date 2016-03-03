package LeetCode;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] inputArr = {1, 3, 5, 2, 6, 7, 9};
		int[] inputArr = {1, 2, 3, 4};
		int order = 3;
		System.out.print("I: " );
		for (int i:inputArr) {
			System.out.print(i + " ");
		}
		System.out.println();
		rotate(inputArr, order);
		System.out.print("O: " );
		for (int i:inputArr) {
			System.out.print(i + " ");
		}
	}

	//rotate the arr by order such that given arr of size n = 8, order = 3
	//1, 5, 3, 2, 4, 7, 9, 2 becomes:
	//7, 9, 2, 1, 5, 3, 2, 4
	public static void rotate(int[] arr, int order) {
		order = order % arr.length;
		
		if (order == 0)
			return;
		
		if (arr == null || order < 0) {
			throw new IllegalArgumentException("illegal argument!");		
		}
		
		//split array into 2 parts
		int a = arr.length - order;
		
		//reverse the first part
		reverse(arr, 0, a - 1);
		//reverse the 2nd part
		reverse(arr, a, arr.length - 1);
		//recombine, reverse the whole thing.
		reverse(arr, 0, arr.length - 1);
	}
	
	public static void reverse(int[] arr, int left, int right) {
		if (arr == null || arr.length == 1) 
			return;
		
		while (left < right) {
			//going from both left and right side of the sub array, swap
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			//move the swapping index to the next position
			left++;
			right--;
		}
	}
}
