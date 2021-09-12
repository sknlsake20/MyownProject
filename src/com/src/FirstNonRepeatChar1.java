package day7;

import java.util.Scanner;

public class FirstNonRepeatChar1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();	//windowin
		char[] charArray=str.toCharArray();
		
		for(int i=0;i<str.length();i++) {
			boolean repeat=false;
			for(int j=i+1;j<str.length();j++) {
				if(charArray[i]==charArray[j]) {
					repeat=true;
				}
			}
			if(repeat==false) {
				System.out.println(charArray[i]+" first non repeated");
				break;
			}
			
		}
		
		

	}

}
