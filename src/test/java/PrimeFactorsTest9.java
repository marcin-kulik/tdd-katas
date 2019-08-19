

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest9 {

	@Test
	void primeFactors() throws Exception{
        assertEquals(Arrays.asList(), PrimeFactors9.of(1));
        assertEquals(Arrays.asList(2), PrimeFactors9.of(2));
        assertEquals(Arrays.asList(3), PrimeFactors9.of(3));
        assertEquals(Arrays.asList(2, 2), PrimeFactors9.of(4));
        assertEquals(Arrays.asList(5), PrimeFactors9.of(5));
        assertEquals(Arrays.asList(2,3), PrimeFactors9.of(6));
        assertEquals(Arrays.asList(7), PrimeFactors9.of(7));
        assertEquals(Arrays.asList(2,2,2), PrimeFactors9.of(8));
        assertEquals(Arrays.asList(3,3), PrimeFactors9.of(9));

    }
}
