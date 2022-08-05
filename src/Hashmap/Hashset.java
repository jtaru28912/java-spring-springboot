package Hashmap;

import java.util.HashSet;

public class Hashset {
	public static void main(String argd[])
	{
		HashSet<String> s= new HashSet<>();
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
		System.out.println(s.remove("Narcos"));
		System.out.println(s.remove("The Vampire Diaries"));
		System.out.println(s.size());
		
	
	
	}

}
