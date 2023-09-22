package Day6;
import java.util.Scanner;
public class TotalString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int sum=0;
		String a[]=str.split(",");
		for(int i=0;i<a.length;i++)
		{
			sum+=Integer.parseInt(a[i]);
		}
		System.out.println(sum);

	}

}
