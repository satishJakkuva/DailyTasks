package FirstExercise;

public class Question2 {

	public static void main(String[] args) {
		int n;
		for(int i=1000;i<=2000;i++)
		{
			int sum=0;
			n=i;
			while(n!=0)
			{
				sum=sum*10+(n%10);
				n=n/10;
				
			}
			if(sum==i)
			{
				System.out.println(i);

			}
			
		}

	}

}
