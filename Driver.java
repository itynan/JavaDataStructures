package ds;

public class Driver {
	public static void main(String[] args) {
		Stack s = new Stack();
		
		for(int i = 0; i < 300 ; i+=9) {
			s.push(i);
		}
		s.pop();
		s.pop();
		//s.pop();
		System.out.println(s.top);
		System.out.println(s.peak());
	
	}
}