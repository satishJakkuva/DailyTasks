package Day4Assign;

public class ProductInfo {

	public static void main(String[] args) {
		Product product1 = new Product(12, "shirt");
		Product product2 = new Product(13, "burger", 5);
		product1.display();
		product2.display();

	}

}

class Product {
	private int id;
	private String name;
	private int quantity;

	public Product(int id, String name, int quantity) {
		this(id, name);
		this.quantity = quantity;
	}

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		if (quantity == 0) {
			System.out.println("id  : " + this.id + "name  : " + this.name);
		} else {
			System.out.println("id  : " + this.id + ",name  : " + this.name + ",number of stocks  :  " + this.quantity);
		}
	}

}
