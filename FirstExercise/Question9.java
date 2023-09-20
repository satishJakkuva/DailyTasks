package FirstExercise;

public class Question9 {

	public static void main(String[] args) {
		System.out.println(findAverage(12,13,56,78,90));

	}
	public  static int findAverage(int ... num)
	{
		int avg=0;
		for(int k: num)
		{
			avg= avg+k;
		}
		int result=avg/(num.length);
		return result;
	}

}
