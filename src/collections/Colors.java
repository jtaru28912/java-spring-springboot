package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Colors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>colors = 
				new ArrayList<>();
		colors.add("White");
		colors.add("Blue");
		colors.add("Green");
		colors.add("Pink");
		colors.add("Violet");
		colors.add("Grey");
		Collections.sort(colors);
		for(String sort : colors) {
			System.out.println(sort);
		}
		
		System.out.println("-----------------------------------------------");
		for(String sort : colors) {
			colors.remove(sort);
			
		}
		System.out.println(colors.isEmpty());
		System.out.println("-----------------------------------------------");

		
		}

	}

}
