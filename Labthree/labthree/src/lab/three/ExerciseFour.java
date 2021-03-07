//Create a method that accepts a number and modifies it such that the each of the digit in the newly formed number is equal to the difference between two consecutive digits in the original number. The digit in the units place can be left as it is.
package lab.three;
import java.util.*;
public class ExerciseFour {
 public static int modifyNumber(int number1) {
	 String s= String.valueOf(number1);
	 StringBuffer sb = new StringBuffer();
	 char character[]=new char[s.length()];
	 for(int i=0;i<(s.length()-1);i++) {
		 character[i]=s.charAt(i);
		 character[i+1]=s.charAt(i+1);
		 int difference = Math.abs(Integer.valueOf(character[i])-Integer.valueOf(character[i+1]));
		 sb.append(difference);
	 }
	 sb.append(character[(s.length()-1)]);
	 String str=sb.toString();
	 return Integer.valueOf(str);
 }
 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);
	 System.out.println("Enter the number");
	 int number=scanner.nextInt();
	 scanner.close();
	 System.out.println("Modified Number is "+ExerciseFour.modifyNumber(number));
 }
}
