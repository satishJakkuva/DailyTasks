package Day11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSortUniqueNames {

	public static void main(String[] args) {
		String path="/home/satishj/Java/DailyAssignments/src/Day11/names.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			Set<String> uNames=new HashSet();
			String str;
			while(br.ready()) {
				str=br.readLine();
				uNames.add(str);
			}
			System.out.println(uNames);
			List<String> sortedNames= new ArrayList<>(uNames);
			Collections.sort(sortedNames);
			for(String str1:sortedNames) {
				System.out.println(str1);
			}
		}
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

}
