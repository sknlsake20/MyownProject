package day7;

import java.util.Scanner;

public class ReverseStringRecursion {
	static String reverseString(String str) {
		if(str.isEmpty()) {
			return str;
		}
		else {
			return reverseString(str.substring(1))+str.charAt(0);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:" );
		String str=sc.nextLine();
		String reversed=reverseString(str);
		System.out.println("The reverse string is :"+reversed);
	}

}
