package Day3A;

public class ProductDetails {

	public static void main(String[] args) {
		ProductInfo pro = new ProductInfo();
		pro.init(2,"shirt",1500,5);
		int netPrice=pro.getNetPrice();
		System.out.println(netPrice);
		pro.purchase();
		pro.sell();
		
		
	}

}
class  ProductInfo{
	private int prodId;
    private	 String prodName;
	private int prodPrice;
	private int quan_on_hand;
	
	public void init(int prodId,String prodName,int prodPrice,int quan_on_hand)
	{
		this.prodId=prodId;
		this.prodName=prodName;
		this.prodPrice=prodPrice;
		this.quan_on_hand=quan_on_hand;
	}
	public int getNetPrice()
	{
		int  result=0;
		result =prodPrice + (prodPrice*12)/100;
		
		return result;
	}
	public   void purchase()
	{
		
		System.out.println(	prodPrice*quan_on_hand);
	}
	public  void sell()
	{
		if(quan_on_hand>0) {
			System.out.println("the sold price is "+ prodPrice*quan_on_hand);
		}
		else {
			System.out.println("there are no quantities in hand to sale");
		}
	}
	
}
