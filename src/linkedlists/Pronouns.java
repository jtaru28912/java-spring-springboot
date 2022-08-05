package linkedlists;

import java.util.Collections;
import java.util.LinkedList;

public class Pronouns {

	public static void main(String[] args) {
		
		LinkedList<String> l = new LinkedList<>();
		LinkedList<String> m = new LinkedList<>();
		m.add("It");
		m.add("Themselves");
		m.addFirst("It");
     	l.add("I");
		l.add("You");
		l.add("My");
		l.add("Me");
		l.add("Mine");
		l.add("Myself");
		
		System.out.println("the list without alter: "+ l);
		System.out.println("--------------------------------------");
		
		l.addFirst("Him");//insertion at begning
		System.out.println("List after insertion at begning"+ l);
		System.out.println("--------------------------------------");
		
		l.add(0,"Her");//Add at certain index
		System.out.println("List after insertion at certain index"+ l);
		System.out.println("--------------------------------------");
		
		l.addAll(m);
		System.out.println("List after addAll "+ l);
		System.out.println("--------------------------------------");
		
		l.addAll(5, m);
		System.out.println("List after addAll "+ l);
		System.out.println("--------------------------------------");
		
		l.addLast("Their");
		System.out.println("List after insertion at end "+ l);
		System.out.println("--------------------------------------");
		
		m.clone();
		System.out.println("List after clone "+ m.clone());
		System.out.println("--------------------------------------");
		
		System.out.println("List after contains "+ m.contains("Its"));
		System.out.println("--------------------------------------");
	
		System.out.println("List after fetchinf 2nd index "+ m.get(2));
		System.out.println("--------------------------------------");
		
		System.out.println("List after Fetching First "+ l.getFirst());
		System.out.println("--------------------------------------");
		
		System.out.println("List after Fetching last index "+l.getLast());
		System.out.println("--------------------------------------");
		
		System.out.println("List after index of element which does not exixt "+ l.indexOf("Pink"));
		System.out.println("--------------------------------------");
		
		System.out.println("List after index of element which exixt "+ l.indexOf("Her"));
		System.out.println("--------------------------------------");
		
		System.out.println("Size of second list  "+ m.size());
		System.out.println("--------------------------------------");
		
		System.out.println("Size of First list  "+ l.size());
		System.out.println("--------------------------------------");
		
		l.set(6, "Its");
		System.out.println("Set index "+ l);
		System.out.println("--------------------------------------");
		
		System.out.println("append m to l append  "+ l.addAll(m));
		System.out.println("--------------------------------------");

		System.out.println("Sublist : "+l.subList(2, 6));
		System.out.println("--------------------------------------");
		
		Collections.sort(l);
		System.out.println("Sorted "+l);
		System.out.println("--------------------------------------");

		l.push("Herself");
		System.out.println("pushed "+ l);
		System.out.println("--------------------------------------");

		System.out.println("peek "+ l.peek());
		System.out.println("--------------------------------------");
	
		l.pop();
		System.out.println("popped "+ l.pop());
		System.out.println("--------------------------------------");
		
		System.out.println("isEmpty! "+ l.isEmpty());
		System.out.println("--------------------------------------");
		
		System.out.println("Search "+Collections.binarySearch(l, "It"));
		System.out.println("--------------------------------------");
		
		l.remove("It");
		System.out.println("remove! "+l );
		System.out.println("--------------------------------------");
		
		System.out.println("poll "+ l.poll() );
		System.out.println("--------------------------------------");
			
		System.out.println("poll first! "+l.pollFirst());
		System.out.println("--------------------------------------");
		
		System.out.println("poll last "+ l.pollLast() );
		System.out.println("--------------------------------------");
		
		System.out.println("peek fierst "+l.peekFirst() );
		System.out.println("--------------------------------------");
		
		System.out.println("peek last "+l.peekLast());
		System.out.println("--------------------------------------");
		
		l.clear();
		System.out.println("List after clear "+ l);		
	}

}
