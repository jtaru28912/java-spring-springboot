package learning_further;

public class NestedTry {

	public static void main(String[] args) {
	 
		try {
			System.out.println("first layer");
			try {
				System.out.println("Nested try");
				try {
					int b = 34 / 0;
					System.out.println(b);
				}
				catch(Exception e) {
					System.out.println("Uo");
				}
			}
			catch(Exception e) {
				
			}
		}
		catch(Exception e) {
			
		}
		finally{
			System.out.println("Finally u will rock");
		}
	
	}

}
