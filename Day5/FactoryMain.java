package Day5;

public class FactoryMain {

	public static void main(String[] args) {
		FactoryEmployee f1= new FactoryEmployee(111,"satish",1,"meeting");
		FactoryEmployee f2= new FactoryEmployee(222,"ganesh",2,"discussion");
		f1.print();
		System.out.println("----------------------");
		f2.print();

	}

}
class Employee{
	protected int id;
	protected String name;
	public Employee(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public void print()
	{
		System.out.println("id : "+id + ",name : "+ name);
	}
}
class FactoryEmployee extends Employee{
	protected int busNo;
	protected String empBoard;
	public FactoryEmployee(int id,String name,int busNo,String empBoard)
	{
		super(id,name);
		this.busNo=busNo;
		this.empBoard=empBoard;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println("busNo : "+ busNo + ",employee board : "+empBoard);
	}
}
