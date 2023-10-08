package Day11;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestUniqueLinesFromFiles {

	public static void main(String[] args) throws Exception{
		Path names1Path=Path.of("/home/satishj/Java/DailyAssignments/src/Day11/names1.txt");
		Path names2Path=Path.of("/home/satishj/Java/DailyAssignments/src/Day11/names2.txt");
		var s1= new LinkedHashSet<String>(Files.readAllLines(names1Path));
		var s2= new LinkedHashSet<String>(Files.readAllLines(names2Path));
		var uniqueNames= new LinkedHashSet<String>();
		for(String name: Files.readAllLines(names2Path)) {
			if(!s1.contains(name)){
				uniqueNames.add(name);
			}
		}
		for(var name: uniqueNames) {
			System.out.println(name);
			
		}

	}

}
