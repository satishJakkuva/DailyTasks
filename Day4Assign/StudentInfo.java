package Day4Assign;

public class StudentInfo {

	public static void main(String[] args) {
		Student stu= new Student(1,"satish","java",5000);
		stu.getTotalFee();
		stu.getDue();
		stu.getFeePaid();
		stu.payment(2000);
		System.out.println("---------------------------------------------------------------");
		Student stu1= new Student(2,"anand","python",3000);
		stu1.getTotalFee();
		stu1.getDue();
		stu1.getFeePaid();
		stu1.payment(3000);
 
	}

}
class Student{
	private int adminNo;
	private String stuName;
	private String courseJoined;
	private int feesPaid;
	private int totalFee;
	private int amount;
	
	
	public Student(int adminNo,String stuName,String courseJoined,int feesPaid)
	{
		this.adminNo=adminNo;
		this.stuName=stuName;
		this.courseJoined=courseJoined;
		this.feesPaid=feesPaid;
	}
	
	
	public void getTotalFee()
	{
		if(courseJoined=="java")
		{
			totalFee=10000;
		}
		else if(courseJoined=="python")
		{
			totalFee=7500;
		}
		System.out.println("totalfee "+totalFee);
		
	}
	public void getDue()
	{
		int due=totalFee-feesPaid;
		System.out.println("due amount"+due);
	}
	public void getFeePaid()
	{
		System.out.println("fees paid"+feesPaid);
	}
	public void payment(int amount)
	{
		this.amount=amount;
		System.out.println("paying amount"+amount);
	}
}
