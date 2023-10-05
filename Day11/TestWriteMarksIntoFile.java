package Day11;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class TestWriteMarksIntoFile {

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int marks[]= new int[20];
		for(int i=0;i<marks.length;i++) {
			marks[i]=scan.nextInt();
		}
		RandomAccessFile rf= new RandomAccessFile("/home/satishj/Java/DailyAssignments/src/Day11/marks.dat","rw");
		for(int i: marks)
		{
			rf.writeInt(i);
		}
		rf.seek(0);
		long count=(int)rf.length()/4;
		for(int i=0;i<count;i++)
		{
			System.out.print(rf.readInt()+" ");
		}
	}

}
