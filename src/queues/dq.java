package queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class dq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque d = new ArrayDeque();
		d.add("Green");
		d.add("Yellow");
		d.add("magenta");
		d.add("olive");
		d.add("cream");
		System.out.println("initaially: "+d);
		d.addFirst("Brown");
		System.out.println("Add First: "+d);
		d.addLast("Pink");
		System.out.println("Add Last: "+d);
		System.out.println("Contains: "+d.contains("Brown"));
		System.out.println("get first: "+d.getFirst());
		System.out.println("get Last: "+d.getLast());
		System.out.println("peek first: "+d.peekFirst());
		System.out.println("peek Last: "+d.peekLast());
		System.out.println("pollFirst: "+d.pollFirst());
		System.out.println("pollLast: "+d.pollLast());
		System.out.println("SIze: "+d.size());
		System.out.println("Class: "+d.getClass());
		
	}

}
