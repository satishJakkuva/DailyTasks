package FirstExercise;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int highestFactor=1;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				if(highestFactor<i)
				{
					highestFactor=i;
				}
			}
		}
		System.out.println(highestFactor);

	}

}
