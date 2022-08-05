package itrerators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class it {
public static void main(String args[]) {
	ListIterator<String> l = null;
	List<String> mh = new ArrayList<String>();
	mh.add("Tokyo");
	mh.add("Rio");
	mh.add("Denvour");
	mh.add("Professor");
	mh.add("Nairobi");
	mh.add("Berlin");
	l = mh.listIterator();
	System.out.println("Traversing farward");
	while(l.hasNext()) {
		System.out.println(l.next());
	}
	System.out.println("Traversing backward");
	while(l.hasPrevious()) {
		System.out.println(l.previous());
	}

}
}
