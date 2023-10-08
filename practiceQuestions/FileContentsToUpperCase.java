package practiceQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileContentsToUpperCase {

	public static void main(String[] args) throws Exception {
		FileWriter fw=null;
		String fileContent="";
		String str="/home/satishj/Java/DailyAssignments/src/practiceQuestions/alone.txt";
		try(BufferedReader br= new BufferedReader(new FileReader(str))){
			String str1;
			while(br.ready()) {
				str1=br.readLine();
				fileContent=fileContent+str1+System.lineSeparator();
			}
			System.out.println(fileContent);
			String newContent=fileContent.toUpperCase();
			fw=new FileWriter(str);
			System.out.println(newContent);
			fw.write(newContent);
		}
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
		finally {
			fw.close();
		}
	}

}
