import java.util.Scanner;

public class GreatLess {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+"a is greatest b and c");
		}
		else if(b>a && b>c) {
			System.out.println(b+"a is greatest b and c");
		}
		else if(c>a && c>b) {
			System.out.println(c+"a is greatest b and c");
		}
		else if(a<b && a<c) {
			System.out.println(a+"a is least b and c");
		}
		else if(b<a && b<c) {
			System.out.println(b+"a is least b and c");
		}
		else if(c<a && c<b) {
			System.out.println(c+"a is least b and c");
		}
	}
}
