package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
	
	MathUtils mathUtils;
	
	@BeforeEach
	void init() {
		System.out.println("2. operation BeforeEach... ");
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanUp() {
		System.out.println("3. CleanUp operation afterEach... ");
	}
	
	@BeforeAll
	static void beforeAllProcess() {
		System.out.println("1. Before all processing start...");	
	}
	
	@AfterAll
	static void afterAllProcess() {
		System.out.println("4. After all processing start...");	
	}
	
	@Test
	@DisplayName("This method will add two number")
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

	@Test
	@Disabled
	void textDisabeld() {
		System.out.println("Test disabled...");
	}
}
