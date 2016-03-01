package DataStructure;

import java.util.Stack;

public class ReversePolishNotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "2", "1", "+", "3", "*" };
		System.out.println("Result = " + EvalRPN(input));
	}
	
	public static int EvalRPN(String[] arr) {
		Stack<String> stack = new Stack<String>();
		int result = 0;
		String operators = "+-*/";
		
		for(String s:arr) {
			if (operators.contains(s)) {
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (s) {
					case "+":
						result += a + b;
						break;
					case "-":
						result += a - b;
						break;
					case "*":
						result += a * b;
						break;
					case "/":
						result += a / b;
						break;
						
				}
				stack.push(String.valueOf(result));
			}
			else
				stack.push(s);
		}
		return result;
	}
}
