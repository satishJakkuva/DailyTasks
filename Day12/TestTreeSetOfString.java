package Day12;

import java.util.Comparator;
import java.util.TreeSet;

public class TestTreeSetOfString {

	public static void main(String[] args) {
	      TreeSet<String> treeSet= new TreeSet<>(new Comparator<String>() {
	    	  public int compare(String str1,String str2)
	    	  {
	    		  if(str1.length()==str2.length())
	    			  return str1.compareTo(str2);
	    		  else {
	    			  return str1.length()-str2.length();
	    		  }
	    	  }
	    	  
	      });
	      treeSet.add("anand");
	      treeSet.add("chaithu");
	      treeSet.add("satish");
	      treeSet.add("lohi");
	      treeSet.add("sai");
	      for(String str:treeSet) {
	    	  System.out.println(str);
	      }

	}

}
