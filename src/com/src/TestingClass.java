package com.src;

public class TestingClass {

	public static void main(String[] args) {
		ArithmeticOp am=new ArithmeticOp();
		int exp=am.add(89, -45);
		int act=44;
		if(exp == act)
			System.out.println("Pass");
		else System.out.println("Fail");
	}

}
