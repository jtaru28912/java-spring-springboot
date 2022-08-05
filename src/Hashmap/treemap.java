package Hashmap;

import java.util.TreeMap;
public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Integer, String> t = new TreeMap<>();
		t.put(1,"A");
		t.put(2,"B");
		t.put(6,"F");
		t.put(20,"T");
		t.put(10 ,"J");
		t.put( 26,"Z");
		System.out.println(t);
		System.out.println(t.get(2));
System.out.println(t.containsKey(6));


	}

}
