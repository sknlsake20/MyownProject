import java.util.Scanner;

public class DoubleValueBigger {

	public static void main(String[] args) {
		System.out.println("Enter numbers:");
		Scanner sc=new Scanner(System.in);
		double m=sc.nextDouble();
		double n=sc.nextDouble();
		double c=m>n?m:n;
		System.out.println("Bigger is:"+c);

	}

}
