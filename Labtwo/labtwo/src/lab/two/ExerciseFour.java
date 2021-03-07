//Create a method which accepts an integer array and removes all the duplicates in the array. Return the resulting array in descending order
package lab.two;
import java.util.*;
public class ExerciseFour {
	void sortArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of an array");
		int length=scanner.nextInt();
		int array[]= new int[length];
		System.out.println("Enter the elements of an array ");
		for(int i=0;i<length;i++) {
			array[i]=scanner.nextInt();}
		scanner.close();
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(array[i]<array[j]) {
				int temp =array[i];
				array[i]=array[j];
				array[j]=temp;
				}
			}
		}
		removeDuplicates(array);
	}
       void removeDuplicates(int[] arr) {
    	   if(arr.length==0||arr.length==1)
    		   System.out.println("add more elements in an array");
    	   int[] temp=new int[arr.length];
    	   int j=0;
    	   for(int i=0;i<(arr.length)-1;i++) {
    		   if(arr[i]!=arr[i+1]) {
    			   temp[j++]=arr[i];
    		   }
    		   
    	   }
    	   temp[j++]=arr[(arr.length)-1];
    	   System.out.println("Resulting array with non duplicate elements in deescinding order is given below");
    	   for(int i=0;i<j;i++) {
    		   System.out.println(temp[i]);}
		
	}
	
	public static void main(String[] args) {
		ExerciseFour obj = new ExerciseFour();
		obj.sortArray();
	}

}
