package basic_programming;

public class Wrapperclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		double t = 20;
		
		Integer i = Integer.valueOf(n);
		Double d = Double.valueOf(t);
		if(i instanceof Integer) {
			System.out.println("An object of instance created");
		}
		if(d instanceof Double) {
			System.out.println("An object of double is created");
		}
		
	}

}
