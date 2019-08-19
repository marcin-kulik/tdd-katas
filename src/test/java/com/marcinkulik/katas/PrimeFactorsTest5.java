package com.marcinkulik.katas;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import com.marcinkulik.katas.PrimeFactors5;

class PrimeFactorsTest5 {

	@Test
	void primeFactors() throws Exception{
		assertEquals(Arrays.asList(), PrimeFactors5.of(1));
		assertEquals(Arrays.asList(2), PrimeFactors5.of(2));
		assertEquals(Arrays.asList(3), PrimeFactors5.of(3));
		assertEquals(Arrays.asList(2,2), PrimeFactors5.of(4));
		assertEquals(Arrays.asList(5), PrimeFactors5.of(5));
		assertEquals(Arrays.asList(2,3), PrimeFactors5.of(6));
		assertEquals(Arrays.asList(7), PrimeFactors5.of(7));
		assertEquals(Arrays.asList(2,2,2), PrimeFactors5.of(8));
		assertEquals(Arrays.asList(3,3), PrimeFactors5.of(9));
		assertEquals(Arrays.asList(2,5), PrimeFactors5.of(10));
		assertEquals(Arrays.asList(11), PrimeFactors5.of(11));
		assertEquals(Arrays.asList(2,2,3), PrimeFactors5.of(12));
		assertEquals(Arrays.asList(13), PrimeFactors5.of(13));
		assertEquals(Arrays.asList(2,7), PrimeFactors5.of(14));
		assertEquals(Arrays.asList(3,5), PrimeFactors5.of(15));
		assertEquals(Arrays.asList(2,2,3,3,5,7,11,11,13), PrimeFactors5.of(2*2*3*3*5*7*11*11*13));


		
	}

}
