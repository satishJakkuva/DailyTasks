package Day10;

import java.util.Scanner;

public class TestUntil {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n=0;
        int sum=0;
        try {
        while(n!=(int)'o')
        {
        	System.out.println("enter number");
        	n=scan.nextInt();
        	sum+=n;
        }
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        finally {
        	System.out.println(sum);
        }
	}

}
