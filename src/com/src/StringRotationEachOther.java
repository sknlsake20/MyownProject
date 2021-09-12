package day7;

import java.util.Scanner;

public class StringRotationEachOther {
	public static boolean checkRotation(String st1, String st2) {  
        if (st1.length() != st2.length()) {  
            return false;  
        }  
        String st3 = st1 + st1;  
        if (st3.contains(st2))  
            return true;  
        else  
            return false;  
    }  
   
    public static void main(String[] args) {  
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter two strings");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        System.out.println("Checking if a string is rotation of another");  
        if (checkRotation(str1, str2)) {  
            System.out.println("Yes " + str2 + " is rotation of " + str1);  
        } else {  
            System.out.println("No " + str2 + " is not rotation of " + str1);  
        }  
    }  
}  




