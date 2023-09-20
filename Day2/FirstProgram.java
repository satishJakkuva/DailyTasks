package Day2;
import java.util.Scanner;
public class FirstProgram {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		System.out.println("enter the day between 1 to 7 and number of hours worked");
		int day=scan.nextInt();
		int hoursWorked=scan.nextInt();
		double wage,bonus;
		double amount= switch(day) {
		 
		case 1,2,3 -> 
		         hoursWorked*200; 
		case 4,5 -> hoursWorked *400;
		case 6   ->hoursWorked*600;
		case 7   -> hoursWorked*800;
		default  -> 0;    
		};
		if(amount>=2000) {
			bonus=amount +amount*0.1;
			System.out.println(" calculated wages are "+bonus);
		}
		else {
			bonus=amount;
			System.out.println("calculated wages are  "+bonus);
		}
		

	}

}
