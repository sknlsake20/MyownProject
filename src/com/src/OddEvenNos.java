package com.src;

import java.util.Scanner;

public class OddEvenNos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num:");
		int n=sc.nextInt();
		Thread t=new Thread(()->{
			for(int i=0;i<=n;i++) {
				if(i%2==0) {
				System.out.println("Even "+i+" ");
				}
			}
		}
		);
		t.start();
		Thread t1=new Thread(()->{
			for(int i=0;i<=n;i++) {
				if(i%2!=0) {
				System.out.println("Odd "+i+" ");
				}
			}
		}
		);
		t1.start();
	
		
	}

}
