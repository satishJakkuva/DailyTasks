package Day7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SortDates {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str[] = new String[5];
		for (int i = 0; i < 5; i++) {
			str[i] = scan.next();
		}
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate str1[] = new LocalDate[5];

		for (int i = 0; i < 5; i++) {
			str1[i] = LocalDate.parse(str[i], d);
		}

		for (int i = 0; i < 5; i++) {
			LocalDate temp=null;
			for (int j = i+1; j < 5; j++) {
				if (str1[i].getYear() > str1[j].getYear()) {
				    temp = str1[i];
					str1[i] = str1[j];
					str1[j] = temp;

				}
			}

		}
		for (int i = 0; i < 5; i++) {
			System.out.println(str1[i]);
		}

	}

}
