package ssa;

import java.util.Stack;

public class RPNCalculator {

		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//establishes Stack class
		Stack<Integer> stk = new Stack<Integer> (); 
		
		//lists the 2 numbers and 4 operators that will be used and converts them to the variable "problem" 
		char[] problem = new char[] {'1','2','+','*','-','/'};
		
		//each char in "problem" is turned to a numeric value and pushed on to the stack 
		for (char ch: problem) {
			int term = Character.getNumericValue(ch);
			if (term != -1) {
				stk.push(term);
				 
		//else loop for operators. when an operator is reached, the 2 numbers ( p1, p2 ) are popped off the stack and the operator is applied 	
		}
			else {
				if (ch == '+') {
					int p2 = stk.pop();
					int p1 = stk.pop();
					int Answer = p1 + p2;
					stk.push(Answer);
				}
				if (ch == '*') {
					int p2 = stk.pop();
					int p1 = stk.pop();
					int Answer = p1 * p2;
					stk.push(Answer);
				}
				if (ch == '-') {
					int p2 = stk.pop();
					int p1 = stk.pop();
					int Answer = p1 - p2;
					stk.push(Answer);
				}
				if (ch == '/') {
					int p2 = stk.pop();
					int p1 = stk.pop();
					int Answer = p1 / p2;
					stk.push(Answer);
				}
			}
			
			
		}
		//prints out answer 
			int Answer = stk.pop();
			System.out.println("Calculating..." + "The answer is " + Answer );
		
		 
		 
	} 
	
	
}
