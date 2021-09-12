import java.util.Scanner;

public class PositiveDivisibleByTwo {
	public static void main(String args[]) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=m/100;
		if(m>99 && m<1000) {
			System.out.println(m+" is a 3 digit integer...");
			if(n%2==0) {
				System.out.println(n+" is a stating number and its divisible by 2...");
			}
			else if(n%2!=0) {
				System.out.println(n+" is a stating number and it is not divisible by 2...");
			}
		}
		else {
			System.out.println(m+" is not a 3 digit integer");
		}
	}
}
