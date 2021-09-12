import java.util.Scanner;

public class Symbol {

	public static void main(String[] args) {
		System.out.println("Select from menu:");
		Scanner sc=new Scanner(System.in);
		char choice=sc.next().charAt(0);
		switch(choice) {
		case '!':
			System.out.println("enter two values:");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Addition:"+(a+b));
			break;
		case '@':
			System.out.println("enter two values:");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Subtraction:"+(a-b));
			break;
		case '#':
			System.out.println("enter two values:");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Multiplication:"+(a*b));
			break;
		case '$':
			System.out.println("enter two values:");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Division:"+(a/b));
			break;
		case '%':
			System.out.println("enter two values:");
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println("Modulo:"+(a%b));
			break;
		default:
			System.out.println("Invalid symbols");
			break;
		}

	}

}
