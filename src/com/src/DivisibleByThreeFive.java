import java.util.Scanner;

public class DivisibleByThreeFive {
	public static void main(String args[]) {
		System.out.println("enter a number:");
		Scanner sc=new Scanner(System.in);
		int m=sc.nextInt();
		int n=m%10;
		if((n%3==0)) {
			System.out.println(m+" is accepeted number and "+n+" is a last digit and this is divisible by 3");
		}
		else if(n%5==0) {
			System.out.println(m+" is accepeted number and "+n+" is a last digit and this is divisible by 5");
		}
		else {
			System.out.println(m+" It is accepeted number and "+n+" It is last digit and this is not divisible by 3 and 5..");
		}
	}
}
