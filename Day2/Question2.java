package Day2;
import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n=1;int k;int avg=0;
		while(n<=5) {
			System.out.println("enter the " + n + "number");
			k=scan.nextInt();
			avg=avg+k;
			n++;
		}
		System.out.println("the average of all the numbers are "+avg/5);

	}

}
