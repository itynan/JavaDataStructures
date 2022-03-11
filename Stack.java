package ds;

import java.util.Vector;

public class Stack {
	
	public int top = -1;
	
	Vector<Integer> v = new Vector<Integer>();
	
	public void push(int x) {
		v.add(x);
		top++;
	}
	
	public boolean isEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public int peak() {
		int peak = 0;
		
		if(!isEmpty())
			return peak = v.get(top);
		else
			return 0;
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("out of bounds");
			return;
		}
		v.remove(top);
		top--;
		
	}
}
