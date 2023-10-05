package practiceQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;

public class TestQuestion4 {

	public static void main(String[] args) {
		try {
			BufferedReader br= new BufferedReader(new FileReader("/home/satishj/Java/DailyAssignments/src/practiceQuestions/game.txt"));
		    RandomAccessFile raf= new RandomAccessFile("/home/satishj/Java/DailyAssignments/src/practiceQuestions/game.txt","rw");
		    
		}
       catch(Exception e) {
    	   System.out.println(e.getMessage());
       }
	}

}
