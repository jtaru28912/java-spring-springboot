package basic_programming;
final class Bc{
	final void demo() {
		System.out.println("Hello to the Base class");
	}
	int x = 20;

}
class Sc {
	void demo() {
		System.out.println("Hello to the Suub class");
	}

}
public class FinalwithInh {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Sc n = new Sc();
   n.demo();
	}

}
