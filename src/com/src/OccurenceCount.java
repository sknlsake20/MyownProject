package day7;

import java.util.Scanner;

public class OccurenceCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		System.out.println("Enter a character:");
		char ch=sc.next().charAt(0);
		str=str.toLowerCase();
		int occrencecount=0;
		char[] chararray=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(ch==chararray[i]) {
				occrencecount++;
			}
		}
		System.out.println("In this string,the given character occurs "+occrencecount+" times.");
	}

}
