package day12;

import java.util.Scanner;
import java.util.function.IntFunction;

public class FibonacciSeries {
	public static void main(String[] args) {
		IntFunction fi=(o1)->
		{
			 int n1=0,n2=1,n3=0;
			 if(o1==0)
			 {
				 return n1;
			 }
			 else if(o1==1)
			 {
				 return n2;
			 }
			 for(int i=2;i<=o1;++i)
			 {    
			    n3=n1+n2;        
			    n1=n2;    
			    n2=n3;    
			 } 
			 return n3;
		};
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("The "+a+" element of a fibonacci series is:"+fi.apply(a));

	}
}
