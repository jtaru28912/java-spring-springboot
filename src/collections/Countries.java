package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Countries {

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
		
		ArrayList<String> countries = 
				new ArrayList<>();
		countries.add("India");
		countries.add("China");
		countries.add("Russia");
		countries.add("Japan");
		countries.add("Korea");
		countries.add("Arab");
		countries.add("Bhutan");
		
		countries.addAll(colors);
		
		Collections.sort(countries);
		
		Collections.reverse(countries);
		for (String descending : countries )
		{
			System.out.println(
					descending);
		}


	}

}
