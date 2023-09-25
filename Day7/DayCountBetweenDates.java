package Day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DayCountBetweenDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("dd-mm-yyyy");
		String str1=scan.next();
		DateTimeFormatter d= DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String str2=scan.next();
        LocalDate iDate=LocalDate.parse(str1, d);
        LocalDate fDate=LocalDate.parse(str2,d);
        long days=ChronoUnit.DAYS.between(iDate, fDate);
        System.out.println("the total days between given two dates : "+days);
	}

}
