package Day3A;

public class CommonFactors {
	public static void findCommonFactors(int ... nums)
	{
		int large=nums[0];
		for(int i=0;i<nums.length;i++)
		{
			 if(large <nums[i])
			 {
				 large=nums[i];
			 }
			 
		}
		for(int i=1;i<=large;i++)
		{
			int check=1;
			for(int j=0;j<nums.length;j++)
			{
				if(nums[j]%i!=0)
				{
					check=0;
					break;
				}
			}
			if(check==1)
			{
				System.out.println(i);
			}
		}
		
	}

	public static void main(String[] args) {
		findCommonFactors(10,23,13,22);

	}

}
