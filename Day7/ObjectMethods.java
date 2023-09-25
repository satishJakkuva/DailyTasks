package Day7;

import java.util.Objects;

public class ObjectMethods {

	public static void main(String[] args) {
		Employee emp1 = new Employee(23, "satish");
		Employee emp2 = new Employee(23, "satish");
		Employee emp3 = new Employee(24, "lalith");
		System.out.println(emp3);
		System.out.println(emp1.equals(emp2));
		System.out.println(emp1.equals(emp3));
		System.out.println(emp1);
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp3.hashCode());

	}

}

class Employee {
	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "id: " + id + ",name : " + name;
	}

	@Override
	public boolean equals(Object obj) {
		Employee that = (Employee) obj;
		if (this.id == that.id && this.name == that.name) {
			return true;
		} else {
			return false;
		}
	}
    @Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

}
