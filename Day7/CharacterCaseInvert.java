package Day7;
import java.util.Scanner;
public class CharacterCaseInvert {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch[i]>=65 && ch[i]<=90)
			{
				int k=(int)ch[i]+32;
				ch[i]=(char)k;
			}
			else {
				int k=(char)ch[i]-32;
				ch[i]=(char)k;
			}
		}
		
     for(int i=0;i<ch.length;i++) {
    	 System.out.print(ch[i]);
     }
	}

}
