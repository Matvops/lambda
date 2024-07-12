package comparator.application;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import comparator.entities.Product;

public class Program {

	public static void main(String[] args) {
		List<Product> products = new LinkedList<>();

		products.add(new Product("Tv", 900.00));
		products.add(new Product("Notebook", 1200.00));
		products.add(new Product("Tablet", 450.00));

		Comparator<Product> comp1 = new Comparator<Product>() {

			@Override
			public int compare(Product o1, Product o2) {
				return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
			}

		};

		Comparator<Product> comp2 = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		
		Comparator<Product> comp3 = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		
		products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product p : products) {
			System.out.println(p.toString());
		}
	}

}
