/**
 * Calculating profit Percentage.
 */
package lab.three;
import java.util.Scanner;

/**
 * @author Shankit Kumar
 *
 */
public class ProfitAndLoss {

	public void inputMethod() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of dozens of toys purchased");
		 int x=scanner.nextInt();
		System.out.println("Enter the price per dozen");
		int y=scanner.nextInt();
		System.out.println("Enter the selling price of one toy");
		int z=scanner.nextInt();
		scanner.close();
		float netProfit=calculateProfit(x,y,z);
		System.out.printf("Sam's Profit Percentage is %.2f percent.",netProfit);
		
	}
	public float calculateProfit(int dozenCount, int pricePerDozen,int sellPrice) {
		float costPriceForOneToy=pricePerDozen/12.0f;
		float profit=sellPrice-costPriceForOneToy;
		float profitPercentage=(profit/costPriceForOneToy)*100;
		return profitPercentage;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfitAndLoss obj= new ProfitAndLoss();
          obj.inputMethod();
	}

}
