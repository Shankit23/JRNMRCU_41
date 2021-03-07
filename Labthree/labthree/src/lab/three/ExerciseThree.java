//Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
package lab.three;
import java.util.*;
public class ExerciseThree {
	public boolean isVowel(char c) {
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
			return true;}
		else
			return false;
		}
	public String alterString(String s) {
		char[] array=s.toCharArray();
		for(int i=0;i<array.length;i++) {
			if(!isVowel(array[i])) {
				if(array[i]=='z')
					array[i]='a';
				else if(array[i]=='Z')
					array[i]='A';
				else
					array[i]=(char)(array[i]+1);
				
			}
		}
		return String.valueOf(array);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string=scanner.next();
		ExerciseThree obj=new ExerciseThree();
		scanner.close();
		System.out.println("Updated string is "+obj.alterString(string));
	}

}
