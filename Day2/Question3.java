package Day2;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		
                   Scanner scan = new Scanner(System.in);
                   int largestFactor=0;
                   int num=scan.nextInt();
                   for(int i=1;i<num;i++)
                   {
                	   if(num%i==0)
                	   {
                		   if(num>largestFactor)
                		   {
                			   largestFactor=i;
                		   }
                	   }
                   }
                   System.out.println(largestFactor);
	}

}
