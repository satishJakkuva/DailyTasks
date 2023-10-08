package practiceQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

	public static void main(String[] args) {
		Pattern p =Pattern.compile("ab");
		int count=0;
		Matcher m=p.matcher("abaabbbaab");
		while(m.find()) {
			count++;
		  System.out.println(m.start()+"--"+m.end()+"--"+m.group());
		}
		System.out.println("the number of pattern occrences are "+count);

	}

}
