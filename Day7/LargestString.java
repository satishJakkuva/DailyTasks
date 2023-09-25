package Day7;
import java.util.Scanner;
public class LargestString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		int largest=str.length();
		if(str.equals(""))
		{
			System.out.println("string is empty");
		}
		else {
			while(true) {
				System.out.println("enter the string");
				str=scan.next();
				if (str.equals("")) {
					break;

				} else {
					if(largest<str.length())
					{
						largest=str.length();
					}
				}
			}
		}
		System.out.println(largest);

	}

}
