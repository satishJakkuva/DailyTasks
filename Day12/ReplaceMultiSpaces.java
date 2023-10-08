package Day12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReplaceMultiSpaces {

	public static void main(String[] args) {
		String str = "/home/satishj/Java/DailyAssignments/src/Day12/multiSpace.txt";
		String content = "";
		FileWriter fr = null;
		try (BufferedReader br = new BufferedReader(new FileReader(str));) {
			String fileStr;
			while (br.ready()) {
				fileStr = br.readLine();
				fileStr = fileStr.replaceAll("\\s+", " ");
				content = content + fileStr + System.lineSeparator();
			}
			System.out.println(content);
			fr = new FileWriter(str);
					fr.write(content);
			fr.close();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
