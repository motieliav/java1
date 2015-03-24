package Prime_simple;

import java.lang.*;

public class PrimeCalc {
	
	private int max_prime;
	private boolean[] primes_array;
	
	public PrimeCalc(int max) {
		max_prime 	= max;
		primes_array = new boolean[max+1];
	}
	
	boolean check_prime(int candidate) {
		boolean is_prime 	= true;
		int 	i_sqrt 		= (int) Math.sqrt(candidate) + 1;

		for (int i=2; i<i_sqrt; i++)
			if ((candidate != i) && (candidate % i == 0))
				is_prime = false;
		
		return is_prime;
	}
	
	public void compute() {
		for (int i=2; i <= max_prime; i++)
			primes_array[i] = this.check_prime(i);
				 
	}

	public void print_results() {
		int counter = 1;
		for (int i=2; i <= max_prime; i++)
			if (primes_array[i])
				System.out.println(counter++ + ". " + i);
	}
	
}
