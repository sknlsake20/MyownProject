package Task5;
import java.util.*;

public class UserNamePassWord1 {
	public static boolean isValid(String password)
    {
  
        // for checking if password length
        // is between 8 and 33
        if (!((password.length() >= 8)
              && (password.length() <= 33))) {
            return false;
        }
        if (true) {
            int count = 0;
  
            // check digits from 0 to 9
            for (int i = 0; i <= 9; i++) {
  
                // to convert int to string
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        // for special characters
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
            return false;
        }
  
        if (true) {
            int count = 0;
  
            // checking capital letters
            for (int i = 65; i <= 90; i++) {
  
                // type casting
                char c = (char)i;
  
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        if (true) {
            int count = 0;
  
            // checking small letters
            for (int i = 90; i <= 122; i++) {
  
                // type casting
                char c = (char)i;
                String str1 = Character.toString(c);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
                return false;
            }
        }
  
        // if all conditions fails
        return true;
    }
  
	public static void main(String[] args) {
		 String password1 = "Shivakumar8&";
		 System.out.println(password1);
		 String username1=rev(password1);
		 System.out.println(username1);
	        if (isValid(password1)) {
	            System.out.println("Valid Password and valid Username");
	        }
	        else {
	            System.out.println("Invalid Password!!! and Invalid Username");
	        }
	  
	        String password2 = "Shiva@kumar";
	        System.out.println(password2);
	        String username2=rev(password2);
	        System.out.println(username2);
	        if (isValid(password2)) {
	            System.out.println("Valid Password and valid username");
	        }
	        else {
	            System.out.println("Invalid Password!!! and Invalid Username");
	        }
	        
	}

	private static String rev(String password2) {
		
		return null;
	}

	
}
