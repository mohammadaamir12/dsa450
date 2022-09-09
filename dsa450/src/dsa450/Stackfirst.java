package dsa450;

import java.util.Stack;

public class Stackfirst {
	

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(1);
		s.push(2);
		s.push(3);
		
		pushAtBottom(4,s);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

	private static void pushAtBottom(int i, Stack<Integer> s) {
		if(s.isEmpty()) {
			s.push(i);
			return;
		}
		int top=s.pop();
		pushAtBottom(i,s);
		s.push(top);
		
	}

}
