

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeFactorsTest4 {

	@Test
	void primeFactors() throws Exception{
		assertEquals(Arrays.asList(), PrimeFactors4.of(1));
		assertEquals(Arrays.asList(2), PrimeFactors4.of(2));
		assertEquals(Arrays.asList(3), PrimeFactors4.of(3));
		assertEquals(Arrays.asList(2,2), PrimeFactors4.of(4));
		assertEquals(Arrays.asList(5), PrimeFactors4.of(5));
		assertEquals(Arrays.asList(2,3), PrimeFactors4.of(6));
		assertEquals(Arrays.asList(7), PrimeFactors4.of(7));
		assertEquals(Arrays.asList(2,2,2), PrimeFactors4.of(8));
		assertEquals(Arrays.asList(3,3), PrimeFactors4.of(9));
		assertEquals(Arrays.asList(2,5), PrimeFactors4.of(10));
		assertEquals(Arrays.asList(11), PrimeFactors4.of(11));
		assertEquals(Arrays.asList(2,2,3), PrimeFactors4.of(12));
		assertEquals(Arrays.asList(13), PrimeFactors4.of(13));
		assertEquals(Arrays.asList(2,7), PrimeFactors4.of(14));
		assertEquals(Arrays.asList(3,5), PrimeFactors4.of(15));
		assertEquals(Arrays.asList(2,2,3,3,5,7,11,11,13), PrimeFactors4.of(2*2*3*3*5*7*11*11*13));
	}

}
