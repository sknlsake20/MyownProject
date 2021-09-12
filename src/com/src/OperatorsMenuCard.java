import java.util.Scanner;
public class OperatorsMenuCard {
	static void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	static void subtraction(int a,int b)
	{
		System.out.println(a-b);
	}
	static void multiplication(int a,int b)
	{
		System.out.println(a*b);
	}
	static void division(int a,int b)
	{
		System.out.println(a/b);
	}
	static void modulus(int a,int b)
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		
			System.out.println("1. Arithmetic");
			System.out.println("2. relational");
			System.out.println("3.logical");
			System.out.println("choose from above menu");
			
			Scanner sc=new Scanner(System.in);
			int i=sc.nextInt();
			if(i==1)
			{
			    System.out.println("1 addition");
			    System.out.println("2 subtraction");
			    System.out.println("3 mlutiplication");
			    System.out.println("4 divsion");
			    System.out.println("5 modulus");
			    System.out.println("6 go back");
			    System.out.println("choose from above menu");
				int j=sc.nextInt();
				if(j==1)
				{
					System.out.println("Enter two values");
					int a=sc.nextInt();
					int b=sc.nextInt();
					addition(a,b);
				}
				if(j==2)
				{
					System.out.println("Enter two values");
					int a=sc.nextInt();
					int b=sc.nextInt();
					subtraction(a,b);
				}
				if(j==3)
				{
					System.out.println("Enter two values");
					int a=sc.nextInt();
					int b=sc.nextInt();
					multiplication(a,b);
				}
				if(j==4)
				{
					System.out.println("Enter two values");
					int a=sc.nextInt();
					int b=sc.nextInt();
					division(a,b);
				}
				if(j==5)
				{
					System.out.println("Enter two values");
					int a=sc.nextInt();
					int b=sc.nextInt();
					modulus(a,b);
				}
				else
				{
					System.exit(0);
				}
			}
			else if(i==2)
			{
				System.out.println("1.less than");
				System.out.println("2.less than or equal to");
			    System.out.println("3.greater than");
				System.out.println("4.greater than or equal to");
				System.out.println("5.equal to");
				System.out.println("6.not equal to");
				System.out.println("choose from above menu");
				int j=sc.nextInt();
			}
			else
			{
				System.out.println("1. AND");
				System.out.println("2. OR");
				System.out.println("3. NOT");
				System.out.println("choose from above menu");
				int j=sc.nextInt();
			}



	}

}
