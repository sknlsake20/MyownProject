package day7;

import java.util.Scanner;

public class VowelsConstantsCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int vcount=0;
		int ccount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a' ||  ch=='e' || ch=='i' ||ch=='o' || ch=='u' ) {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("In this string "+vcount+" vowels");
		System.out.println("In this string "+ccount+" Constants");
		

	}

}
