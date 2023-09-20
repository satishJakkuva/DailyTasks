package Day5;

public class PersonMain {

	public static void main(String[] args) {
		Student s[]= new Student[5];
		
		s[0]= new Student("satish","satishjakkuva123@gmail.com",12,23);
		s[1]= new Student("sai","sai123@gmail.com",13,24);
		s[2]= new Student("anand","anand123@gmail.com",14,22);
		s[3]= new Student("chaithu","chaithu123@gmail.com",15,23);
		s[4]= new Student("anand","anand123@gmail.com",16,23);
		for(int i=0;i<s.length;i++)
		{
			s[i].print();
			System.out.println("-------------------------------------");
		}
        
		

	}

}
class Person{
		protected String name,email;
		public Person(String name,String email){
			this.name=name;
			this.email=email;
			
		}
		public void print() {
			System.out.println("name : "+name +",email : "+email);
		}
}
class Student extends Person{
	protected int id,age;
	
	public Student(String name,String email,int id,int age) {
		super(name,email);
		this.id=id;
		this.age=age;
	}
	@Override
	public void print()
	{
		super.print();
		System.out.println("id : "+id + ",age  : "+ age);
	}
	
	
	
}
