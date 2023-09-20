package FirstExercise;
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int large=arr[0];
		for(int k:arr)
		{
			if(k>large)
			{
				large=k;
			}
		}
		System.out.println(large);
		

	}

}
