package practiceQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestIntegerHash {

	public static void main(String[] args) {
		Set<String> s= new TreeSet<>();
		s.add("govind sai");
		s.add("satish");
		s.add("lohi");
		s.add("ram");
		s.add("anand");
		System.out.println(s);
		
		TreeSet<String>  ts= new TreeSet<>();
		ts.add("govind sai");
		ts.add("satish");
		ts.add("lohi");
		ts.add("ram");
		ts.add("anand");
		System.out.println(ts);
		ArrayList<String> a= new ArrayList<>();
		a.add("govind sai");
		a.add("satish");
		a.add("lohi");
		a.add("ram");
		a.add("anand");
		System.out.println(a);
		Set<String> m=new LinkedHashSet<>();
		m.add("govind sai");
		m.add("satish");
		m.add("lohi");
		m.add("ram");
		m.add("anand");
		System.out.println(m);
		Set<String> r= new HashSet<>();
		r.add("govind sai");
		r.add("satish");
		r.add("lohi");
		r.add("ram");
		r.add("anand");
		System.out.println(r);

	}

}
