/*Create a method that accepts a String and checks if it is a positive string. 
 * A string is considered a positive string, 
 * if on moving from left to right each character in the String
 * comes after the previous characters in the Alphabetical order. 
*/
package lab.three;

import java.util.*;

public class ExerciseSix {
	public static boolean isPositiveString(String s) {
		char character[] = new char[s.length()];
		for(int i=0;i<s.length();i++) {
			character[i]=s.charAt(i);
		}
		Arrays.sort(character);
		for(int j=0;j<s.length();j++) {  
			if(character[j]!=(s.charAt(j)))
			return false;}
		
			return true;
			
		
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string=scanner.next();
		scanner.close();
	    System.out.println("Is given String "+string+" positive ?");
		System.out.println(isPositiveString(string));
	}

}
