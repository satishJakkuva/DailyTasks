package Day7;

import java.util.Scanner;

public class StringUptoEnd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		String result = "";
		while(true)
		{
			String str=scan.nextLine();
			if(str.isEmpty())
			{
				break;
			}
			
			if(str.length()>result.length())
			{
				result=str;
			}
		}
		if (!result.isEmpty()) {
            System.out.println("The largest string is: " + result);
        } else {
            System.out.println("No strings were entered.");
        }


		
	}

}
