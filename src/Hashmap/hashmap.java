package Hashmap;

import java.util.HashMap;

public class hashmap {
	public static void main(String args[]) {
		HashMap<Integer, String> m = new HashMap<>();
		m.put(2, "King");
		m.put(12, "Queen");
		m.put(13, "Jack");
		m.put(22, "Aces");
		m.put(18, "DIamond");
		m.put(11, "Hearts");
		System.out.println(m.size());
		System.out.println(m.get(23));
		System.out.println(m.get(12));
	}

}
