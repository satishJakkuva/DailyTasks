package FirstExercise;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int n=scan.nextInt();
	   int temp=n;
	   int rem=0,sum=0;
	   while(n!=0)
	   {
		   rem=n%10;
		   int fact=1;
		   for(int i=1;i<=rem;i++)
		   {
			   fact=fact*i;
		   }
		   sum+=fact;
		   n=n/10;
	   }
	   if(sum==temp)
	   {
		   System.out.println(temp + " is a perfect number");
	   }
	   else {
			System.out.println(temp + " is not a perfect number");

	   }

	}

}
