package day7;

import java.util.Arrays;

public class AnagramEx {

	public static void main(String[] args) {
		String str1="race";
		String str2="care";
		if(str1.length()==str2.length()) {
			char chararr1[]=str1.toCharArray();
			char chararr2[]=str2.toCharArray();
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			boolean result=Arrays.equals(chararr1, chararr2);
			if(result) {
				System.out.println(str1+" and "+str2+" are anagram each other");
			}
			else {
				System.out.println(str1+" and "+str2+" are not anagram");
			}
			
		}
		else {
			System.out.println(str1+" and "+str2+" are not anagram");
		}

	}

}
