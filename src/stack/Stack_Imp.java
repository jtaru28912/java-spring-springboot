package stack;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Stack;

public class Stack_Imp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack<String>();
		s.add("The Bridgetons");		
		s.add("The Vampire Diaries");
		s.push("Narcos");
		s.push("Money Heist");
		s.push("Friends");
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.isEmpty());
		System.out.println(s.peek());
		//System.out.println();
		
		
		


	}

}
