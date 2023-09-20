package FirstExercise;

public class Question1 {

	public static void main(String[] args) {
		//first 10 fibonacci numbers
		int initialFibonacci=0;
		int nextFibonacci=1;
		int sum=0;
		System.out.println(0);
		System.out.println(1);
		for(int i=3;i<=10;i++)
		{
			
			initialFibonacci=nextFibonacci;
			nextFibonacci=sum;
			sum=initialFibonacci+nextFibonacci;
			System.out.println(sum);

		}

	}

}
