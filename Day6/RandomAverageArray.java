package Day6;

public class RandomAverageArray {

	public static void main(String[] args) {
		int arr[]= new int[10];
		double avg=0;
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.round(Math.random()*100));
			avg=avg+arr[i];
		}
		avg=avg/10;
		System.out.println("avg : "+avg);
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>avg)
			{
			System.out.println(arr[i]);
			}
		}
		

	}

}
