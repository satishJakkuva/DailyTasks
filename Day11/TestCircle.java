package Day11;

import java.util.HashSet;
import java.util.Objects;
import java.util.TreeSet;


public class TestCircle  {

	public static void main(String[] args) {
		var insert= new HashSet<Object>();
		var insert1=new TreeSet<Object>();
         insert.add(new Circle(1,2));
         insert.add(new Circle(2,3));
         insert.add(new Circle(3,4));
         insert.add(new Circle(1,2));
         for(var obj:insert) {
        	 System.out.println(obj);
         }
         System.out.println("---------------------");
         insert1.add(new Circle(1,2));
         insert1.add(new Circle(2,3));
         insert1.add(new Circle(3,4));
         insert1.add(new Circle(1,2));
         for(var obj:insert1) {
        	 System.out.println(obj);
         }
         System.out.println();
         

	}

}
class Circle implements Comparable<Circle>{
	private int x;
	private int y;
	public Circle(int x,int y) {
		this.x=x;
		this.y=y;
	}
    public int compareTo(Circle c) {
    	return this.x-c.x;
    }
    @Override
	public String toString() {
		return this.x +","+this.y;
	}
	@Override
	public int hashCode() {
		return Objects.hash(1,2);
	}
	@Override//it is important to override equals and hashcode method to avoid duplicate elements in hashset
	public boolean equals(Object obj) {
		Circle that = (Circle) obj;
		if (this.x == that.x && this.y == that.y) {
			return true;
		} else {
			return false;
		}
	}
	
	
}
