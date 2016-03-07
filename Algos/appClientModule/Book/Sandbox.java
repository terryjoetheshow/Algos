package Book;



public class Sandbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArr = new int[10];
		for (int i = 0; i < 10; i++) {
			intArr[i] = i;
		}
		
		for(int i:intArr) {
			System.out.println("value = "+i);
		}
	}

}
