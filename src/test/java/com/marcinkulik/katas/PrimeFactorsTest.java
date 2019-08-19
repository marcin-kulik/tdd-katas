package com.marcinkulik.katas;


import org.junit.jupiter.api.Test;
import com.marcinkulik.katas.PrimeFactors;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest {

	@Test
	void primeFactors() throws Exception{
		assertEquals(Arrays.asList(), PrimeFactors.of(1));
		assertEquals(Arrays.asList(2), PrimeFactors.of(2));
		assertEquals(Arrays.asList(3), PrimeFactors.of(3));
		assertEquals(Arrays.asList(2,2), PrimeFactors.of(4));
		assertEquals(Arrays.asList(5), PrimeFactors.of(5));
		assertEquals(Arrays.asList(2,3), PrimeFactors.of(6));
		assertEquals(Arrays.asList(7), PrimeFactors.of(7));
		assertEquals(Arrays.asList(2,2,2), PrimeFactors.of(8));
		assertEquals(Arrays.asList(3,3), PrimeFactors.of(9));
		assertEquals(Arrays.asList(2,5), PrimeFactors.of(10));
		assertEquals(Arrays.asList(11), PrimeFactors.of(11));
		assertEquals(Arrays.asList(2,2,3), PrimeFactors.of(12));
		assertEquals(Arrays.asList(13), PrimeFactors.of(13));
		assertEquals(Arrays.asList(2,7), PrimeFactors.of(14));
		assertEquals(Arrays.asList(3,5), PrimeFactors.of(15));
		}

}
