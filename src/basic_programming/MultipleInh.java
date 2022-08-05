package basic_programming;

interface first {
	default void fun() {
		System.out.println("First parent ");
	}
	
}
interface second{
	default void func() {
		System.out.println("Second parent ");
	}
}

public class MultipleInh implements first, second{
	public static void main(String args[]) {
		MultipleInh m = new MultipleInh();
		m.fun();
	}
}