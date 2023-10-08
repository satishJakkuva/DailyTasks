package practiceQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMapProblems {

	public static void main(String[] args) {
		Map<String,String> map= new HashMap<>();
		map.put("satish","developer");
		map.put("anand","QA");
		map.put("sai", "hr");
		map.put("chaithu", "manager");
		for(String n:map.keySet()) {
			System.out.println(n+" "+map.get(n));
		}
		System.out.println(map.containsKey("sai"));
		System.out.println(map.containsKey("lohi"));
		map.remove("chaithu");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.values());
        map.replace("sai","manager");
        System.out.println(map);
        
	}

}
