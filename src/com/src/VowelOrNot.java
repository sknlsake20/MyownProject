import java.util.Scanner;

public class VowelOrNot {
		public static void main(String args[]) {
			System.out.println("Select from menu:");
			Scanner sc=new Scanner(System.in);
			char choice=sc.next().charAt(0);
			switch(choice) {
			case 'a':
				System.out.println("a is a vowel");
				break;
			case 'e':
				System.out.println("e is a vowel");
				break;
			case 'i':
				System.out.println("i is a vowel");
				break;
			case '0':
				System.out.println("0 is a vowel");
				break;
			case 'u':
				System.out.println("u is a vowel");
				break;
			default:
				System.out.println("It is not a vowel");
				break;
			}
			
		}
	

}
