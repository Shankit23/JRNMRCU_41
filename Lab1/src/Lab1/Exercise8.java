package Lab1;
import java.util.*;
public class Exercise8 {
	static boolean checkNumber(int n) {
		while(n>1) {
			if(n%2!=0) {
				return false;
			}
			n=n/2;
		}
		return true;
	}
     
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("Result: "+checkNumber(a));

	}

}
