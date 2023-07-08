package JavaFeatures;

import java.util.ArrayList;
import java.util.Collections;

class Product{
	int Id;
	String ProductName;
	int price;
	public Product(int id, String productName, int price) {
		super();
		Id = id;
		ProductName = productName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [Id=" + Id + ", ProductName=" + ProductName + ", price=" + price + "]";
	}
	
	
}

public class LambdaInComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Product> list=new ArrayList<>();
		list.add(new Product(101,"keybord", 5000));
		list.add(new Product(102,"Laptop", 55000));
		list.add(new Product(101,"Speakers", 12000));
		list.add(new Product(101,"Desktop", 47000));
		list.add(new Product(101,"Mousetop", 1000));
		list.add(new Product(101,"wire-less Mousetop", 1500));
		
		Collections.sort(list,(p1,p2)-> {
			return p1.ProductName.compareTo(p2.ProductName);
		});
		list.forEach(p -> System.out.println(p));

	}

}
