package lab.three;
import java.util.*;
public class ExerciseOne {

	public static void main(String[] args) {
		int sum=0;
		Scanner scanner = new Scanner(System.in);
	           System.out.println("Enter numbers with single gap");
	           String s=scanner.nextLine();
	           scanner.close();
	           StringTokenizer st = new StringTokenizer(s," ");
	           while(st.hasMoreTokens()) {
	        	   String temp=st.nextToken();
	        	   int n=Integer.parseInt(temp);
	        	   System.out.println(n);
	        	   sum=sum+n;
	           }
         System.out.println("sum of the integers is "+sum);
	}

}
