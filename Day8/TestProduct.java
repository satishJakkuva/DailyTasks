package Day8;

import java.util.Arrays;
import java.util.Comparator;

public class TestProduct {

	public static void main(String[] args) {
		Product product[] = new Product[5];
		product[0] = new Product("shirt", 23, 2000);
		product[1] = new Product("pant", 56, 2500);
		product[2] = new Product("watch", 229, 5000);
		product[3] = new Product("shoe", 203, 3000);
		product[4] = new Product("glasses", 22, 6000);
		Comparator<Product> comp = new Comparator<Product>() {
			
//			@Override
//			public int compare(Product i, Product j) {
//				if (i.price > j.price)
//					return 1;
//				else if(i.price<j.price)
//					return -1;
//				else
//					return 0;
//            
//			}
			
			@Override
			public int compare(Product m,Product n)
			{
//				if(m.name.length() >n.name.length())
//				{
//					return 1;
//				}
//				else if(m.name.length() >n.name.length()) {
//					return -1;
//				}
//				else 
//					return 0;
				return n.name.compareTo(m.name);
			}
			
		};
		Arrays.sort(product,comp);
		for(Product n:product)
		{
			System.out.println(n);
		}

	}

}

class Product {
	protected String name;
	protected int id;
	protected int price;

	public Product(String name, int id, int price) {
		this.name = name;
		this.id = id;
		this.price = price;
	}

	@Override
	public String toString() {
		return " name : " + name + " id : " + id + " price : " + price;
	}
}
