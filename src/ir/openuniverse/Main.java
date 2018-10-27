package ir.openuniverse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = scanner.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = scanner.nextLine();
		
		System.out.println("Hello " + firstName + " " + lastName + "!");
	}
}
