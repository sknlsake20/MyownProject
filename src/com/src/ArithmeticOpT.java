package com.src;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArithmeticOpT {

	@Test
	void testAdd() {
		ArithmeticOp am=new ArithmeticOp();;
		assertEquals(68,am.add(45,23));
	}

}
