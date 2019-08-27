package com.marcinkulik.katas;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class StringCalculatorTest {

	private StringCalculator stringCalculator;
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Before
	public void setup() {
		stringCalculator = new StringCalculator();
	}
	
	@Test
	public void addEmptyString() {
		assertEquals(0, stringCalculator.add(""));
	}
	
	@Test
	public void addOneNumberOne() {
		assertEquals(1, stringCalculator.add("1"));
	}
	
	@Test
	public void addOneNumberTwo() {
		assertEquals(2, stringCalculator.add("2"));
	}
	
	@Test
	public void addOneNumberThree() {
		assertEquals(3, stringCalculator.add("3"));
	}
	
	@Test
	public void addTwoNumbersWithSumEqualsTwo() {
		assertEquals(2, stringCalculator.add("1,1"));
	}
	
	@Test
	public void addTwoNumbersWithSumEqualsThree() {
		assertEquals(3, stringCalculator.add("1,2"));
	}
	
	@Test
	public void addTwoNumbersWithSumEqualsTen() {
		assertEquals(10, stringCalculator.add("3,7"));
	}
	
	@Test
	public void addThreeNumbersWithSumEqualsFive() {
		assertEquals(5, stringCalculator.add("1,2,2"));
	}
	
	@Test
	public void addTenNumbersWithSumEqualsTen() {
		assertEquals(10, stringCalculator.add("1,1,1,1,1,1,1,1,1,1"));
	}
	
	@Test
	public void handleNewLineBetweenNumbers( ) {
		assertEquals(2, stringCalculator.add("1\n1"));
	}
	
	@Test
	public void handleNewLineAndComma( ) {
		assertEquals(3, stringCalculator.add("1\n1,1"));
	}
	
	@Test
	public void handleTwoNewLinesAndComma( ) {
		assertEquals(10, stringCalculator.add("5\n1,2\n2"));
	}
	
	@Test
	public void handleAddedDelimiter() {
		assertEquals(3, stringCalculator.add("//;\n1;2"));
	}
	
	@Test
	public void handleAddedDelimiterAndComma() {
		assertEquals(8, stringCalculator.add("//;\n1;2,5"));
	}
	
	@Test
	public void handleDifferentAddedDelimiter() {
		assertEquals(3, stringCalculator.add("//+\n1+2"));
	}
	
	@Test
	public void handleDifferentAddedDelimiterAndComma() {
		assertEquals(8, stringCalculator.add("//+\n1+2,5"));
	}
	
	@Test
	public void handleDifferentAddedDelimiterAndCommaAndNewLine() {
		assertEquals(20, stringCalculator.add("//+\n1+2,5\n2+10"));
	}
	
	@Test(expected = IllegalArgumentException.class)
    public void addingNegativeNumberThrowsIllegalArgumentException() {
		stringCalculator.add("1,-2");
    }
	
	@Test
	public void exceptionHasRequiredMessageWithOneNegativeNumber() throws Exception {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negatives not allowed : -2");
		stringCalculator.add("1,-2");
	}
	
	@Test
	public void exceptionHasRequiredMessageWithListOfTwoNegativeNumbers() throws Exception {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negatives not allowed : -2,-3");
		stringCalculator.add("1,-2,-3");
	}
	
	@Test
	public void exceptionHasRequiredMessageWithListOfFourNegativeNumbers() throws Exception {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negatives not allowed : -2,-3,-9,-8");
		stringCalculator.add("1,-2,6,-3\n-9,4\n-8");
	}
	
	@Test
	public void exceptionHasRequiredMessageWithListOfFourNegativeNumbersAndChosenDelimiter() throws Exception {
		expectedException.expect(IllegalArgumentException.class);
		expectedException.expectMessage("negatives not allowed : -2,-3,-9,-8");
		stringCalculator.add("//+\n1+-2,6+-3\n-9,4\n-8");
	}
}