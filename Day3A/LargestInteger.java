package Day3A;

public class LargestInteger {
	public static int findLargest(int ...nums) {
		int largest=0;
		for(int k : nums) {
			if(largest<k)
			{
				largest=k;
			}
			
		}
		return largest;
		
	}

	public static void main(String[] args) {
		
          System.out.println(findLargest(12,45,78,32,90));
	}

}
