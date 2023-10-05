package practiceQuestions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestIterator {

	public static void main(String[] args) {
		List<Integer> a= new ArrayList<>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
//		System.out.println(a);
//		Iterator itr= a.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		a.set(2,67);
		System.out.println(a);
        ListIterator<Integer> li= a.listIterator();
        while(li.hasPrevious())
        {
        	System.out.println(li.previous());
        }
	}

}
