package ds;
//Notes from Data Structures and Algorithms I - Prof Brian Murphy

public class ArrayStack {
	private int[] A;
	private int top = -1;
	
	public ArrayStack(int size) {
		A = new int[size];
	}
	 
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void pop() {
		top--;
	}

	public int peak() {
		return A[top]; 
	}
	
	public void push(int x) {
		top++;
		A[top] = x;
	}

}
