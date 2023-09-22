package Day6;

import java.util.Scanner;

public class RandomNumberBetweenRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 1;
		Boolean b=false;
		while (n <= 3) {
			System.out.println("enter number between 1 to 27 to match the random number");
			int k = scan.nextInt();
			int min = 1;
			int max = 27;
			int randomNumber = (int) (Math.random() * (max - min + 1)) + min;
			if(randomNumber==k) {
				System.out.println("hurray! U had matched the random number");
				b=true;
				break;
			}
			else {
				System.out.println("You did not match the random number.Have one more try");
			}
			n++;
			
		}
		if(b)
		{
			System.out.println("congratulations");
		}
		else {
			System.out.println(" your tries are over !Better luck next time");
		}
		scan.close();

	}

}
