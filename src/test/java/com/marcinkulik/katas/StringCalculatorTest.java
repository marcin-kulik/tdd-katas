package com.marcinkulik.katas;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCalculatorTest {

	@Test
	public void addEmptyString() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(0, stringCalculator.add(""));
	}
	
	@Test
	public void addOneNumberOne() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(1, stringCalculator.add("1"));
	}
	
	@Test
	public void addOneNumberTwo() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(2, stringCalculator.add("2"));
	}
	
	@Test
	public void addOneNumberThree() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("3"));
	}
	
	@Test
	public void addTwoNumbersWithSumEqualsTwo() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(2, stringCalculator.add("1,1"));
	}
	
	@Test
	public void addTwoNumbersWithSumEqualsThree() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(3, stringCalculator.add("1,2"));
	}
	
	@Test
	public void addTwoNumbersWithSumEqualsTen() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(10, stringCalculator.add("3,7"));
	}
	
	@Test
	public void addThreeNumbersWithSumEqualsFive() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(5, stringCalculator.add("1,2,2"));
	}
	
	@Test
	public void addTenNumbersWithSumEqualsTen() {
		StringCalculator stringCalculator = new StringCalculator();
		assertEquals(10, stringCalculator.add("1,1,1,1,1,1,1,1,1,1"));
	}
}