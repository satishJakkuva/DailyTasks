package Day10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class TestCaseCount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
		int uCount=0;
		int lCount=0;
		int digit=0;
		try(BufferedReader br= new BufferedReader(new FileReader(str))){
			int ch;
			while(true) {
				ch=br.read();
				if(ch==-1) {
					break;
				}
				if(ch>='a' && ch<='z')
				{
					lCount++;
				}
				else if(ch>='A' && ch<='Z')
				{
					uCount++;
				}
				else if(ch>=48 && ch<=57)
				{
					digit++;
				}
				else {
					continue;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			scan.close();
			System.out.println("lower case count : "+lCount+"\n UpperCaseCount : "+uCount +"\n digits : "+digit);
		}

	}

}
