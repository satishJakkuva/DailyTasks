package Day10;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestTotaMarks {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("/home/satishj/Java/DailyAssignments/src/Day10/marks.txt"))){
			String str;
			int totalMarks;
			while(br.ready())
			{
				str=br.readLine();
				String arr[]=str.split(",");
				totalMarks=0;
				for(var i:arr)
				{
				totalMarks+=Integer.parseInt(i);
				}
				System.out.println(totalMarks);

			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
