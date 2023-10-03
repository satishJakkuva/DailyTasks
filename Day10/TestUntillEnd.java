package Day10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class TestUntillEnd {

	public static void main(String[] args) {
		try(BufferedReader br= new BufferedReader(new InputStreamReader(System.in))){
			  FileWriter f= new FileWriter("/home/satishj/Java/DailyAssignments/src/Day10/names.txt");
			  String string;
			  while((string=br.readLine())!=null)
			  {
				 if(string.equals("end"))
				 {
					 break;
				 }
				 f.write(string+"\n");
			  }
				 f.close();

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
