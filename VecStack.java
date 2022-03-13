package ds;

import java.util.Vector;

public class VecStack {
	
	public int top = -1;
	
	Vector<Integer> v = new Vector<Integer>();
	
	public void push(int x) {
		v.add(x);
		top++;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public int peak() {
		return v.get(top);		
	}
	
	public void pop() {
		v.remove(top);
		top--;
	}
}
