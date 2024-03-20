package com.tnsif.Streamapiprograms;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class JavaStreamexample {
	public static void main(String[] args) {



		List<Product> productlist=new ArrayList<Product>();

		productlist.add(new Product (1, "hp laptop", 25000f)); 
		productlist.add(new Product (2, "dell laptop", 35000f)); 
		productlist.add(new Product (3, "lenova laptop", 45000f));
		productlist.add(new Product (4, "apple laptop", 65000f));
		
		List<Float> p2 =productlist.stream().filter(p->p.price>30000)//filtering data
		.map(p->p.price) // fetching price 
		.collect (Collectors.toList()); //collecting as list

		System.out.println(p2);

	}

}
