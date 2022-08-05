package linkedlists;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class linkedlists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> l = new LinkedList<>();
		l.add("My");
		l.add("Me");
		l.add("Mine");
		l.add("Myself");
		l.add("I");
		l.add("You");
		l.add("Yourself");
		l.addFirst("Him");
		l.add(0,"Her");
		Iterator<String> iterator = l.iterator();
		while(iterator.hasNext())
		System.out.println(iterator.next());
		System.out.println("------------------------------");
		l.remove(3);
		while(iterator.hasNext())
			System.out.println(iterator.next());		
		
	}

}
