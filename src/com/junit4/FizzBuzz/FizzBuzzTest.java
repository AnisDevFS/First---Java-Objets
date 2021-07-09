package com.junit4.FizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void doitRetourner1siN1() {
		assertEquals("1", FizzBuzz.fizbuz(1));
	}
	
	@Test
	public void doitRetourner2siN2() {
		assertEquals("2", FizzBuzz.fizbuz(2));
	}
	
	@Test
	public void doitRetournerFizzsiN3() {
		assertEquals("Fizz", FizzBuzz.fizbuz(3));
	}
	
	@Test
	public void doitRetournerFizzsiN6() {
		assertEquals("Fizz", FizzBuzz.fizbuz(3));
	}
	
	@Test
	public void doitRetournerBuzzsiN5() {
		assertEquals("Buzz", FizzBuzz.fizbuz(5));
	}

}
