package lab.two;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Player p1 = new Player();
	Scanner scanner= new Scanner(System.in);
	System.out.println("Enter the player name");
	String n=scanner.next();
    p1.setPlayerName(n);
	System.out.println("Enter the country name");
	String c=scanner.next();
	scanner.nextLine();
	p1.setCountryName(c);
	System.out.print("Enter the Skills\n");
	String s=scanner.nextLine();
	p1.setSkill(s);
	scanner.close();
	String print=p1.getPlayerDetails();
	System.out.println(print);
	}

}
