package Day6;
import java.util.Scanner;
public class StringVertical {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		scan.close();

	}

}
