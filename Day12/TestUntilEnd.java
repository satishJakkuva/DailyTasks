package Day12;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestUntilEnd {

	public static void main(String[] args) {
		List<String> ls= new ArrayList<>();
		Pattern p=Pattern.compile("^[a-zA-Z]+\\d+");
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			String inputString=scan.nextLine();
			if(inputString.equals("end")) {
				break;
			}
			Matcher m=p.matcher(inputString);
			if(m.matches()) {
				ls.add(inputString);
			}
			else {
				System.out.println("invalid input");
			}
		}
		Collections.sort(ls);
		try(PrintWriter writer= new PrintWriter(new FileWriter("/home/satishj/Java/DailyAssignments/src/Day12/codes.txt"))){
			for(String validString:ls) {
				writer.println(validString);
			}
		}
		catch(Exception e) {
		     System.out.println(e.getMessage());
		}

	}

}
