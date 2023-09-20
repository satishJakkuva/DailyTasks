package Day4Assign;

public class CounterProgram {

	public static void main(String[] args) {
		Counter c= new Counter();
		System.out.println("default constructor values");
		c.display();
		Counter c1= new Counter(6);
		c1.display();

	}

}
class Counter{
	private int number;
	public Counter()
	{
		
	}
	public Counter(int number)
	{
		this.number=number;
	}

   int iValue=increment(number);
   int dValue=decrement(number);
	public  int increment(int number)
	{
		int k=number++;
		return k;
	}
	public   int decrement(int number)
	{
		int k=number--;
		return k;
	}
	public void display()
	{
		System.out.println("number : "+ this.number + ",  increment value : "+ increment(number)+ ",  decrementValue : "+ decrement(number));
	}
}
