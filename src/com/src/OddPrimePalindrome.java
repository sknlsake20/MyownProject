package day12;

import java.util.Scanner;
import java.util.function.BiFunction;

public class OddPrimePalindrome {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,String> bi=(o1,o2)->
		{
			int b=0,sum=0,temp=o2;
			if(o1==1)
			{
				if(o2%2==0)
				{
					return "EVEN";
				}
				else
				{
					return "ODD";
				}
			}
			else if(o1==2)
			{
				for(int i=2;i<=o2/2;++i)
				{
					if(o2%i==0)
					{
						b=1;
						break;
					}
				}
				if(b==0)
				{
					return "PRIME";
				}
				else
				{
					return "COMPOSITE";
				}
			}
			else if(o2>2)
			{  
			    while(o2>0)
			    {    
				   int rem=o2%10;  
				   sum=(sum*10)+rem;    
				   o2=o2/10;    
				}    
				if(temp==sum) 
				{   
				    return "PALINDROME"; 
				}   
				else 
				{   
				   return "NOT PALINDROME"; 
				}
			}
			
			return null;
			
			
		};
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        System.out.println("Enter two values:");
        System.out.println(bi.apply(sc.nextInt(), sc.nextInt()));    	
            
	}

}
