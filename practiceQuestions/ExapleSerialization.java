package practiceQuestions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ExapleSerialization {

	public static void main(String[] args) throws Exception {
	   Student s1= new Student(23,20000);
	   Student s2= new Student(24,30000);
	   FileOutputStream f=new FileOutputStream("/home/satishj/Java/DailyAssignments/src/practiceQuestions/prac1File.txt");
	   ObjectOutputStream o= new ObjectOutputStream(f);
       o.writeObject(s1);
       o.writeObject(s2);
       FileInputStream input = new FileInputStream("/home/satishj/Java/DailyAssignments/src/practiceQuestions/prac1File.txt");
       ObjectInputStream itr= new ObjectInputStream(input);
      Student p=(Student) itr.readObject();
      System.out.println(p.toString());
	}

}
class Student implements Serializable{
	private int id,sal;
	public Student(int id,int sal) {
		this.id=id;
		this.sal=sal;
	}
	public String toString() {
		return id+" , "+sal;
	}
}
