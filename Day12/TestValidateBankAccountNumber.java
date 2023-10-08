package Day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestValidateBankAccountNumber {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
            String str=scan.nextLine();
            Pattern pattern=Pattern.compile("^\\d{11}$");
            Matcher match=pattern.matcher(str);
            if(match.matches())
            {
            	System.out.println("valid account number");
            }
            else {
            	System.out.println("invalid account number");
            }
	}

}
