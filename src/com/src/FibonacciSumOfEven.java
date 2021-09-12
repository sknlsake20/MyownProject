package day12;

import java.util.Scanner;
import java.util.function.IntFunction;

public class FibonacciSumOfEven {
	public static void main(String[] args) {
		IntFunction fi=(o1)->
		{
		 int n1=0,n2=1,n3,sum=0;
		 for(int i=0;i<=o1;++i)
		 {    
		    n3=n1+n2; 
		    if(n3%2==0)
		    {
		    	sum=sum+n3;
		    }
		    n1=n2;    
		    n2=n3;    
		 } 
		 return sum;
	  };
	  System.out.println("Enter a number:");
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  System.out.println("The even numbers until "+a+" element is:"+fi.apply(a));

	}
}
