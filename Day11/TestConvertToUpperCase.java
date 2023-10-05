package Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TestConvertToUpperCase {

	public static void main(String[] args) {

		 String filePath = "/home/satishj/Java/DailyAssignments/src/Day11/uppercase.txt";

	        try (BufferedReader reader = new BufferedReader(new FileReader(filePath));
	             BufferedWriter writer = new BufferedWriter(new FileWriter("/home/satishj/Java/DailyAssignments/src/Day11/upperCase1.txt"))) {

	            String line;
	            while ((line = reader.readLine()) != null) {
	                
	                String upperCaseLine = line.toUpperCase();
	                writer.write(upperCaseLine);
	                writer.newLine(); 
	            }
	            System.out.println("File content converted to uppercase in-place!");
	        } catch (Exception e) {
	            System.err.println("An error occurred: " + e.getMessage());
	        }

	}

}
