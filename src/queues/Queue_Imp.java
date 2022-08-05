package queues;

import java.util.*;

public class Queue_Imp {
	public static void main(String args[])
	{
		Queue <String> q = new LinkedList<>();
		q.add("Noun");
		q.add("Is");
		q.add("The");
		q.add("Name");
		q.add("Of");
		q.add("Any");
		q.add("Person");
		System.out.println("Elements are: "+ q);
		//removing eleents
		System.out.println("Removed elemet is "
		+ q.remove());
		System.out.println("Head element is "
		+ q.element());
		System.out.println("Poll " +q.poll());
		System.out.println("Peek "+q.peek());
		
	
	
	}

}
