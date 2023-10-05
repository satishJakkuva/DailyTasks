package Day11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.RandomAccessFile;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter rollNumber");
		System.out.println("enter new marks to change for that particuar roll number");
		String rollno=scan.nextLine();
		String newMarks=scan.nextLine();
		String sourceFile="/home/satishj/Java/DailyAssignments/src/Day11/StudentRecord.txt";
		String targetFile="/home/satishj/Java/DailyAssignments/src/Day11/Question3File.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(sourceFile))){
        	RandomAccessFile rf= new RandomAccessFile("targetFile","rw"); 
        	String str;
        	while(br.ready()) {
        		str=br.readLine();
        		rf.writeUTF(str);
        	}
        	rf.seek(0);
        	int lineCount=0;
        	int count=(int)rf.length()/4;
        	for(int i=0;i<count;i++) {
        		String arr[]=rf.readUTF().split(",");
        		lineCount++;
        		if(arr[0].equals(rollno))
        		{
        			System.out.println("marks of respective rollNumber : "+ arr[1]);
        			arr[1]=newMarks;
        			String str1="";
        			//str1=str1+arr[0];
        			str1+=arr[0];
        			str1+=",";
        			str1+=arr[1];
        			rf.seek(0);
        			for(int j=0;j<lineCount-1;j++) {
        				rf.readUTF();
        			}
        			rf.writeUTF(str1);
        			break;
        			
        			
        		}
        		//System.out.println(rf.readUTF());
        	}
        	rf.seek(0);
        	for(int i=0;i<count;i++)
        	{
        	System.out.println(rf.readUTF());
        	}
        	
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
	}

}
