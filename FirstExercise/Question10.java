package FirstExercise;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[]= new int[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<10/2;j++)
		{
			
				int temp=arr[j];
				arr[j]=arr[j+5];
				arr[j+5]=temp;
			
			
		}
		for(int j: arr)
		{
			System.out.print(j+ " ");
		}

	}

}
