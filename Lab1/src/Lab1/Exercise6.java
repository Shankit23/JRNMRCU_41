package Lab1;
import java.util.Scanner;
public class Exercise6 {
	static int calcResult() {
		int x=0,y=0;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size: ");
		int size=s.nextInt();
		for(int i=1;i<size;i++) {
			x=x+(i*i);
			y=y+i;
		}
		return(x-(y*y));
	}
	public static void main(String args[]) {
		System.out.print("Result: "+calcResult());
	}
}
