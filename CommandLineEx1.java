package day5;
import java.util.Scanner;
public class CommandLineEx1 {
	int a;
	public static void main(String[] args) {
		CommandLineEx1 cle=new CommandLineEx1();
		if(args.length>0) {
			int i=Integer.parseInt(args[0]);
	        cle.prime(i);
		}
		else {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number:");
			cle.a=sc.nextInt();
			cle.prime(cle.a);
		}
	}
		public void prime(int n) {
			int count=0;
			for(int i=2;i<=n/2;i++)
			{
			    if(n%i==0)
			    {
			        count=1;
			    }
			}
			if(count==0)
			{
			    System.out.println(n+" is prime");
			}
			else
			{
			    System.out.println(n+"  is not prime");
			}
		}
		

	

}
