package Lab1;
import java.util.*;
public class Exercise5 {
	public int calculateSum(int n) {
		int res=0;
		if(n==1) {
			res=n;
		}
		else
		{
			for(int i=1;i<=n;i++) {
				if(i%3==0||i%5==0) {
					res=res+i;
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Exercise5 cal=new Exercise5();
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		System.out.print("result:"+cal.calculateSum(a));
        
}

}
