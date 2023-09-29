package Day9;

import java.util.Scanner;

public class CLIExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        try {
            int c = a / b;

            int arr1[] = new int[4];
            System.out.println(arr1[4]);

        } catch (ArithmeticException e) {
            System.err.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Some other exception caught: " + e.getMessage());
        } finally {
            System.out.println("finally block");
        }
	}

}
