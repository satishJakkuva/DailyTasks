package Day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestSpaceSeperator {

	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);  
		  System.out.println("enter space seperated names");
          String str=scan.nextLine();
          Pattern p=Pattern.compile("\\s");
          String arr[]=p.split(str);
          for(String s:arr) {
        	  System.out.println(s);
          }
          
          
          
          
                                                             
	}

}
