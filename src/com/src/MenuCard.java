import java.util.Scanner;

public class MenuCard {
	public static void main(String args[]) {
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch (num) {
			case 1:
				System.out.println("Even Or Odd:");
				System.out.println("Enter value:");
				int m=sc.nextInt();
				if(m%2==0) {
					System.out.println("It is even");
				}
				else{
					System.out.println("It is odd");
				}
				break;
			case 2:
				System.out.println("Prime or Not:");
				System.out.println("Enter value:");
				int n=sc.nextInt();
				boolean flag = false;
				int b=n/2;
				for (int i = 2; i <= b; ++i) {
					if (n % i == 0) {
						flag = true;
						break;
					}
				}

				if (!flag)
					System.out.println(n + " is a prime number.");
				else {
					System.out.println(n + " is not a prime number.");
		    	}
				break;
			case 3:
				System.out.println("Palindrome or Not:");
				System.out.println("Enter value:");
			    int v= sc.nextInt();
			    int sum = 0, r;
				int temp = v;    
			    while(v>0)
				{    
			       r = v % 10;   
			       sum = (sum*10)+r;    
			       v = v/10;    
			    }    
			    if(temp==sum)    
			      System.out.println("It is a Palindrome number.");    
			    else    
			      System.out.println("Not a palindrome"); 
			    break;
			case 4:
				System.out.println("Armstrong or Not:");
				System.out.println("Enter value:");
				int x=sc.nextInt();
				int nu=0,total = 0;
				nu=x;
		        while (nu!= 0)
		        {
		            temp =nu% 10;
		            total = total + temp*temp*temp;
		            nu/= 10;
		        }

		        if(total == x)
		            System.out.println(x + " is an Armstrong number");
		        else
		            System.out.println(x + " is not an Armstrong number");
				break;
			case 5:
				System.out.println("Perfect  or Not:");
				System.out.println("Enter value:");
				int z=sc.nextInt();
				sum=0;
				for( int i = 1; i < z; i++)
		        {
		            if(z % i == 0)
		            {
		                sum = sum + i;
		            }
		        }
		        if(sum == z)
		        {
		            System.out.println("Given number is Perfect");
		        }
		        else
		        {
		            System.out.println("Given number is not Perfect");
		        } 
		        break;
			case 6:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid...");
				break;
		}
	}
}
