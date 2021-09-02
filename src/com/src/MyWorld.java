package com.src;

public class MyWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1=new Thread1() {
			public void run(){
				System.out.println("Hello");
			}
		};
		t1.start();
	}
}
class Thread1 extends Thread{
	public void run() {
		System.out.println("Hi");
	}
}
