//: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order
package lab.two;
import java.util.*;
import java.util.Scanner;
public class ExerciseThree {
      public void inputMethod(){
    		Scanner scanner = new Scanner(System.in);
    		System.out.println("Enter the length for an array");
    		int length=scanner.nextInt();
    		int array[]=new int[length];
    	    System.out.println("enter the array elements");
    	    for(int i=0;i<length;i++){
    	    	array[i]=scanner.nextInt();
    	    }
    	    scanner.close();
    	    reverseNumberInArray(array);
      }
      public void reverseNumberInArray(int[] arr) {
    	  int []temp = new int[arr.length];
    	  for(int i=0;i<arr.length;i++) {
    		  while(arr[i]!=0) {
    		  int digit=arr[i]%10;
    		  temp[i]=(temp[i]*10)+digit;
    		  arr[i]=arr[i]/10;
    		  }
    	}
    	  System.out.println("Array after reversing the number");
    	  for(int x:temp) {
    		  System.out.println(x);
    	  }
    	  sortTheArray(temp);
      }
      void sortTheArray(int[] sortArray) {
    	  for(int x=0;x<sortArray.length;x++) {
    		  for(int z=x+1;z<sortArray.length;z++) {
    		  if(sortArray[x]>sortArray[z]) {
    			  int temp=sortArray[x];
    			  sortArray[x]=sortArray[z];
    			  sortArray[z]=temp;
    			  }
    		  }
    	  }
    	  System.out.println("Sorted Array after reverse the numbers in an array");
    	  for(int l:sortArray)
    		  System.out.println(l);
    	  
      }
      public void getSorted(int[] arr) {
    	  
      }
	public static void main(String[] args) {
	ExerciseThree object = new ExerciseThree();
	object.inputMethod();
	}

}
