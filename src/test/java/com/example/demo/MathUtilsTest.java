package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		mathUtils = new MathUtils();
	}
	
	@Test
	void testAdd() {
		
		int excpected = 2;
		int actual = mathUtils.add(1, 1);
		assertEquals(excpected,actual);
	}
	
	@Test
	void testSqureNumber() {
		
		int expected = 4;
		assertEquals(expected,mathUtils.getSquareOfNumber(2),"The square method should multiple number");
	}
	
	@Test
	void testDivideNumber() {
		
		assertThrows(ArithmeticException.class, () ->  mathUtils.getDivdeNumber(1, 0));
		//assertThrows(NullPointerException.class, () ->  mathUtils.getDivdeNumber(1, 0));
	}

}
