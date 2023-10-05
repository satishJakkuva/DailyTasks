package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("enter your roll number");
		    int rollNumber=scan.nextInt();
			try {
				FileReader fr= new FileReader("/home/satishj/Java/DailyAssignments/src/Day11/StudentRecord.txt");
				BufferedReader br= new BufferedReader(fr);
				String str;
				
				while(br.ready()) {
					 str=br.readLine();
					 String arr[]=str.split(",");
					 if(Integer.parseInt(arr[0])==rollNumber) {
						 System.out.println(arr[1]);
						 break;
					 }
				}
				fr.close();
				br.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		   finally {
			   
			   
		   }
		
	}

}
