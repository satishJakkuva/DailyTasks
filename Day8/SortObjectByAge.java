package Day8;

import java.util.Arrays;

public class SortObjectByAge {

	public static void main(String[] args) {
	     Person person[]=new Person[5];
	     person[0]=new Person("sai",23);
	     person[1]=new Person("jay",24);
	     person[2]=new Person("satish",19);
	     person[3]=new Person("chaithu",11);
	     person[4]=new Person("lohi",29);
       Arrays.sort(person);
       for(Person k:person)
       {
    	   System.out.println(k);
       }

	}

}
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	@Override
	public int compareTo(Person p)
	{
		return this.age-p.age;
	}
	@Override
	public String toString()
	{
		return "name : "+ name+"age : "+age;
	}
}
