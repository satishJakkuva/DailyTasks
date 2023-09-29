package Day9;

import java.util.Scanner;

public class TestFormatTypeException {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter space seperated numbers");
		String str=scan.nextLine();
		String arr[]=str.split(" ");
		int total=0;
		try {
		for(int i=0;i<arr.length;i++)
		{
			 total+=Integer.parseInt(arr[i]);
		}
		}
		catch(NumberFormatException e)
		{
//			e.getStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println(total);
		

	}

}
