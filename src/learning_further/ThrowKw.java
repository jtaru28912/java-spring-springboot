package learning_further;

import java.io.IOException;

public class ThrowKw {
	static void checkEligibility(int a , int w) throws IOException {
		if(w<12 && a <40)
		{
			throw new ArithmeticException("Ineligible");
		}
		else {
			System.out.println("Student entry is valid");
		}
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		checkEligibility(10 , 39);
	}

}
