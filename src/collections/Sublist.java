package collections;

import java.util.ArrayList;
import java.util.List;



public class Sublist {
		public static void main(String[] args) {
			ArrayList<String> languages = 
					new ArrayList<>();
			languages.add("Hindi");
			languages.add("English");
			languages.add("French");
			languages.add("German");
			languages.add("Sanskrit");
			System.out.println("Original ArrayList :"
					 + languages);
			ArrayList<String>lang  = 
					new ArrayList<>
			(languages.subList(1, 4));
			System.out.println("Sublist of above is : "
					+ lang);
			
			List<String> list = languages.subList(1, 4);
			System.out.println("Sublist stored " 
					+ list);
			System.out.println("ArrayList contains the string "+
					languages.contains("French"));
		}
}
