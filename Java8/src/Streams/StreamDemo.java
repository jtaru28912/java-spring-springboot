package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//stream does not store element
//functional in nature
//elements of stream are only visited once during life of stream

class Product{
	int id;
	String name;
	float price;
	
	Product(int id , String name , float price){
		this.id=id;
		this.name=name;
		this.price=price;
	}
}



public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> product =new ArrayList<>();
		product.add(new Product(101, " Superpoly ",293 ));
		product.add(new Product(102, " Lycra ",139 ));
		product.add(new Product(103, " 2Way ",200 ));
		product.add(new Product(104, " 4way ",298 ));
		product.add(new Product(105, " Hosirey ",304 ));
		//without streams
		//if i want the output of only price
		for(Product prod: product){
		if(prod.price<200) {
		
			System.out.println("price below 200: "+ prod.price);
			
		}
	
		
		
		List<Product> plstream = new ArrayList<>();
		plstream.add(new Product(101, " Superpoly ",293 ));
		plstream.add(new Product(102, " Lycra ",139 ));
		plstream.add(new Product(103, " 2Way ",200 ));
		plstream.add(new Product(104, " 4way ",298 ));
		plstream.add(new Product(105, " Hosirey ",304 ));
		
		List<Float> proList = plstream.stream().filter(p->p.price<200).map(p->p.price).collect(Collectors.toList());
		System.out.println(proList);
		
		List<Integer> proid = plstream.stream()
				.filter(input->input.id==101)
				.map(input->input.id)
				.collect(Collectors.toList());
		
		System.out.println(proid);
		
		
	}

	}
}
