package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtilsTest {

	@Test
	void testAdd() {
		MathUtils mathUtils = new MathUtils();
		int excpected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(excpected,actual);
	}
	
	@Test
	void testSqureNumber() {
		MathUtils mathUtils = new MathUtils();
		int expected = 5;
		assertEquals(expected,mathUtils.getSquareOfNumber(2),"The square method should multiple number");
	}

}
