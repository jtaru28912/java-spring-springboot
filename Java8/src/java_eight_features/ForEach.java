package java_eight_features;

import java.util.HashMap;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> p = new HashMap<>();
		p.put("Iphone",75000 );
		p.put("OnePlus",55000 );
		p.put("Mi",20000 );
		p.put("Oppo",15000 );
		
		for(Map.Entry<String,Integer> entry :p.entrySet())
		{
			System.out.println("Phone -"+ entry.getKey()
			+" Price = "+ entry.getValue());
		}
		System.out.println("=================================");
	p.forEach((key,balue)->System.out.println("Phone- "+ key+ " Price = "+balue));	

	}

}
