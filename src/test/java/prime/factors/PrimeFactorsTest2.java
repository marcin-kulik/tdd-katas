package prime.factors;


import org.junit.jupiter.api.Test;
import prime.factors.PrimeFactors;
import prime.factors.PrimeFactors2;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorsTest2 {

	@Test
	void primeFactors() throws Exception{
		assertEquals(Arrays.asList(), PrimeFactors2.of(1));
		assertEquals(Arrays.asList(2), PrimeFactors2.of(2));
		assertEquals(Arrays.asList(3), PrimeFactors2.of(3));
		assertEquals(Arrays.asList(2,2), PrimeFactors2.of(4));
		assertEquals(Arrays.asList(5), PrimeFactors2.of(5));
		assertEquals(Arrays.asList(2,3), PrimeFactors2.of(6));
		assertEquals(Arrays.asList(7), PrimeFactors2.of(7));
		assertEquals(Arrays.asList(2,2,2), PrimeFactors2.of(8));
		assertEquals(Arrays.asList(3,3), PrimeFactors2.of(9));
		assertEquals(Arrays.asList(2,5), PrimeFactors.of(10));
		assertEquals(Arrays.asList(11), PrimeFactors.of(11));
		assertEquals(Arrays.asList(2,2,3), PrimeFactors.of(12));
		assertEquals(Arrays.asList(13), PrimeFactors.of(13));
		assertEquals(Arrays.asList(2,7), PrimeFactors.of(14));
		assertEquals(Arrays.asList(3,5), PrimeFactors.of(15));
		assertEquals(Arrays.asList(2,2,3,3,5,7,11,11,13), PrimeFactors.of(2*2*3*3*5*7*11*11*13));
	}

}
