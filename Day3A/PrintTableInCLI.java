package Day3A;

public class PrintTableInCLI {

	public static void main(String[] args) {
		int number,tableLength;
		number=Integer.parseInt(args[0]);
		if(args.length <2)
		{
			tableLength=10;
		}
		else 
		{
			tableLength=Integer.parseInt(args[1]);
		}
		for(int i=1;i<=tableLength;i++) {
		System.out.println(number + "  X  " + i+"  =  "+number*i);
		}

	}

}
