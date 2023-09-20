package FirstExercise;
import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		System.out.println("enter the values of a and b");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int result= evaluateGCD(a,b);
		System.out.println(result);

	}
	public static int evaluateGCD(int a,int b)
	{
		if(b==0)
		{
			return a;
		}
		else {
			return evaluateGCD(b,a%b);
		}
	}

}
