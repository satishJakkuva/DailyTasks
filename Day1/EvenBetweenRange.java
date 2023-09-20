import java.util.Scanner;
public class EvenBetweenRange {

	public static void main(String[] args) {
	  
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        while(n!=0)
        {
        	if(n%2==0)
        	System.out.println(n);
        	n--;
        }
	}

}
