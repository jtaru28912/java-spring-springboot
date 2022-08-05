package learning_further;

class InvalidPE extends Exception{
	public InvalidPE(String s) {
		super(s);
	}
}
public class ExampleThrow {
	void productCHeck(int w) throws InvalidPE {
		if(w <100) {
			throw new InvalidPE("Exception product invalid..");		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleThrow e = new ExampleThrow();
		try {
		e.productCHeck(8);
		}
		catch(InvalidPE p) {
			System.out.println("Cought execption");
			System.out.println(p.getMessage());
		}
		}
}
