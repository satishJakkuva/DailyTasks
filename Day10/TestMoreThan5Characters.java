package Day10;
import java.io.*;
public class TestMoreThan5Characters {

	public static void main(String[] args) {
		     try(BufferedReader br= new BufferedReader(new FileReader("/home/satishj/Java/DailyAssignments/src/Day10/NewFile.txt"))){
		    	 String str;
		    	 while(br.ready()) {
		    		 str=br.readLine();
		    		 if(str.length()>5) {
		    			 System.out.println(str);
		    		 }
		    	 }
		     }
		     catch(Exception e) {
		    	 System.out.println(e.getMessage());
		     }

	}

}
