package learning_further;

import java.util.Scanner;

public class EvenOddException {
	
	public void checkEnO(String n) {
		try {
			int x = Integer.parseInt(n);
			if(x%2==0) {
				System.out.println("EVEN");
			}
			if(x%2 !=0)
			System.out.println("ODD");
		}
		catch(Exception e) {
			System.out.println("Number is not an integer value ");
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		for(int i = 0 ; i<5; i++) {
		System.out.println("Enter the string: ");
		String m= s.next();
		EvenOddException c = new EvenOddException();
		c.checkEnO(m);
		}

	}

}
