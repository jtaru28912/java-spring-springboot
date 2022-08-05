package collections;

import java.util.ArrayList;
import java.util.Collections;

public class SwapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> swap= new ArrayList<>();
		swap.add("Hiii");
		swap.add("Byee");
		swap.add("Hello");
		swap.add("Yooo");
		swap.add("Heyy");
		System.out.println("Before swap: "+ swap);
		for(String s : swap) {
			System.out.println("Elements of Swap is: "+
		s);
			
		}
		Collections.swap(swap, 0, 4);
		System.out.println("Elements after Swap is: "+
				swap);

	}

}
