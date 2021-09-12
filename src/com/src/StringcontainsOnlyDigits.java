package day7;

import java.util.Scanner;

public class StringcontainsOnlyDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		boolean result=str.matches("[0-9]+");
		if (result==true) {
			System.out.println("String contains only digits");
		}
		else {
			System.out.println("String contains digits as well as characters");
		}
	}

}
