package Day2;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		while(n!=0)
		{
			sum=sum*10+(n%10);
			n=n/10;
		}
		System.out.println(sum);


	}

}
