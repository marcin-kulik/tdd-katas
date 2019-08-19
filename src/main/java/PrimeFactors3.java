import java.util.ArrayList;
import java.util.List;

public class PrimeFactors3 {

	public static List<Integer> of(int n) {
	    
		List factors = new ArrayList<Integer>();		
		
		for(int divisor = 2;n>1;divisor++) 			
			for(;n%divisor==0;n/=divisor) 
				factors.add(divisor);				
		
		return factors;
	}

}
