/**
 * 
 */
package lab.three;
import java.util.Scanner;
/**
 * @author Shankit Kumar
 *
 */
public class ProductDetails {
	class Main{
		
		public void mainMethod() {
			 ProductDetails.Product p = new ProductDetails().new Product();
			Scanner scanner= new Scanner(System.in);
			System.out.println("Enter the product id");
			int pId=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter the product name ");
			String pName=scanner.nextLine();
			System.out.println("Enter the Supplier name");
			String pSupplier=scanner.nextLine();
			scanner.close();
			p.setProductDetails(pId,pName,pSupplier);
			p.getProductDetails();
		}
	}
          class Product{
        	  private long id;
        	  private String productName;
        	  private String supplierName;
        	   
        	  public void setProductDetails(long id, String productName, String supplierName) {
        		  this.id=id;
        		  this.productName=productName;
        		  this.supplierName=supplierName;
        	  }
        	  public void getProductDetails() {
        		  System.out.println("Product Id is "+id+"\n"+"Product Name is "+productName+"\n"+"Supplier Name is "+supplierName);
        	  }
          }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ProductDetails.Main m = new ProductDetails().new Main();
         m.mainMethod();
        
     
	}

}
