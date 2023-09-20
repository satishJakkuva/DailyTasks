package FirstExercise;

public class Question6 {

	public static void main(String[] args) {
		int base,power;
		base=Integer.parseInt(args[0]);
		power=Integer.parseInt(args[1]);
		int pro=1;
		for(int i=1;i<=power;i++)
		{
			pro=pro*base;
		}
		System.out.println(pro);

	}

}
