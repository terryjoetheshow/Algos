package DataStructure;

import java.util.*;
import java.io.*;


public class Stack {

	int topIndex;
	int[] stackValues;	
	
	public int getTopIndex() {
		return topIndex;
	}
	
	public static void main(String[] args) throws IOException {
		//reverse input
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter some numbers: ");
		String input = reader.readLine();
		
		Stack stack = new Stack(100);
				
		for (int i = 0; i < input.length(); i++) {
			stack.push(Integer.parseInt(Character.toString(input.charAt(i))));
		}
	
		while(stack.getTopIndex() > -1) {
			try {
				System.out.print(stack.pop());
			}
			catch (Exception e) {
				
			}
		}
		
	}
	
	public Stack(int maxSize) {
		stackValues = new int[maxSize];
		topIndex = -1;
	}
	
	public void push(int value) {
		try {
			stackValues[++topIndex] = value;
		}
		catch (IndexOutOfBoundsException e) {
			System.out.print("no more space in array" + e.toString());
		}
	}
	
	public int pop() throws Exception {
		if (topIndex > -1)
			return stackValues[topIndex--];
		else 
			throw new Exception("stack is empty");
	}
	
	public int peek() {
		return stackValues[topIndex];
	}
}
