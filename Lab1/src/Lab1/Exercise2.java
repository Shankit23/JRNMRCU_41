package Lab1;

import java.util.Scanner;

public class Exercise2 {
	public int select() {
		Scanner s = new Scanner(System.in);
		System.out.print("enter your choices:");
		int num=s.nextInt();
		if(num==1) {
			System.out.println("Stop");
		}
		else if(num==2) {
			System.out.println("Ready");
		}
		else if(num==3) {
			System.out.println("Go");
		}
		else {
			System.out.println("Wrong Choice");
		}
		return 0;
	}
	public static void main(String[] args) {
		System.out.println("1:Red, 2:yellow, 3:Green");
		Exercise2 e=new Exercise2();
		e.select();
	}

}
