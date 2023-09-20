package Day5;

public class ProductMain {

	public static void main(String[] args) {
		// object creation of each class
		Product product = new Product("shirt", 2300);
		product.print();
		ImportedProducts importedProducts = new ImportedProducts("trousers", 2000, 789);
		importedProducts.print();
		DiscountedProducts discountedProducts = new DiscountedProducts("t-shirts", 1500, 0.4);
		discountedProducts.print();
		// upcasting importedProducts to product
		Product product1 = importedProducts;
		System.out.println(product1.getNetPrice());
		// upcasting discountedProducts to product
		Product product2 = discountedProducts;
		//downcasting from  products to importedProduct
		ImportedProducts importedProducts1= (ImportedProducts)product1;
		//downcasting from discountedProduct to product
		DiscountedProducts discountedProducts1= (DiscountedProducts)product2;
		System.out.println(discountedProducts1.getNetPrice());


	}

}

class Product {
	protected String name;
	protected int basePrice;

	public Product(String name, int basePrice) {
		this.name = name;
		this.basePrice = basePrice;
	}

	public void print() {
		System.out.println("name : " + name + "basePrice : " + basePrice);
	}

	public double getNetPrice() {
		return basePrice;
	}

	public void setPrice(int basePrice) {
		this.basePrice = basePrice;
	}

}

class ImportedProducts extends Product {
	protected double importDuty;

	public ImportedProducts(String name, int basePrice, double importDuty) {
		super(name, basePrice);
		this.importDuty = importDuty;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("importDuty : " + importDuty);
	}

	public double getNetPrice() {
		return super.getNetPrice() + importDuty;
	}

	public void setImportDuty(double importDuty) {
		this.importDuty = importDuty;
	}
}

class DiscountedProducts extends Product {
	protected double discountRate;

	public DiscountedProducts(String name, int basePrice, double discountRate) {
		super(name, basePrice);
		this.discountRate = discountRate;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("discountRate : " + discountRate);
	}

	public double getNetPrice() {
		return super.getNetPrice() * discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

}
