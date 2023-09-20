package Day2;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	     int arr[]= new int[5];
	     for(int i=0;i<5;i++)
	     {
	    	 arr[i]=scan.nextInt();
	     }
	     for(int i=4;i>=0;i--)
	     {
	    	 System.out.print(arr[i]+"  ");
	     }
	     

	}

}
