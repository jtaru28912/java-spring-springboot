package Hashmap;

import java.util.TreeSet;

public class Treeset {
	public static void main(String args[]) {
		TreeSet<String> s = new TreeSet<>();
		s.add("The Bridgetons");		
		s.add("The Vampire Diaries");
		s.add("Narcos");
		s.add("Money Heist");
		s.add("Crash Landimng on You");
		s.add("The Bridgetons");		
		s.add("The Vampire Diaries");
		s.add("Friends");
		System.out.println(s);
		System.out.println(s.clone());
		System.out.println(s.contains("Friends"));
		System.out.println(s.hashCode());
		System.out.println(s.isEmpty());
		System.out.println(s.equals("Crash Landing On you"));
		System.out.println(s.ceiling("The Bridgetons"));
		System.out.println(s.first());
		System.out.println(s.floor(" "));
		System.out.println(s.higher(" "));
		System.out.println(s.remove("The Vampire Diaries"));
		System.out.println(s.size());
	}

}
