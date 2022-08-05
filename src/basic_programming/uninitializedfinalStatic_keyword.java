package basic_programming;
class Example{
	//static blank final variable
	static final int EMPID;
	static final double i;
	static final char j;
	static final int k;
	static final int l;
	static final String m ;

	//COMNSTRUCTOR
	static{
		EMPID = 123456;
		i = 10.004;
		m = "Hello from the other side ";
		
	}
	static {
		j = 65;
		k = 33;
		l = 9;
		
	}
}
public class uninitializedfinalStatic_keyword {
	
	public static void main(String[] args) {
		System.out.println(Example.EMPID);
		System.out.println(Example.i);
		System.out.println(Example.j);System.out.println(Example.k);
		System.out.println(Example.l);
		System.out.println(Example.m);

	}

}
