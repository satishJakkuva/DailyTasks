package Day6;
import java.util.Scanner;
public class SpacePosition {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str=scan.nextLine();
       char pos[]=str.toCharArray();
       System.out.println("space positions are");
       for(int i=0;i<pos.length;i++)
       {
    	   if(pos[i] == ' ')
    	   {
    		   System.out.println(i);
    	   }
       }
       scan.close();
	}

}
