package Prime_simple;

import Prime_simple.PrimeCalc;

public class prime1 {
	public static void main(String args[]) {
		System.out.println("Starting computing......");
		
		PrimeCalc p = new PrimeCalc(1000000);
		p.compute();
		p.print_results();
		
		System.out.println("\nDONE prime computing.");
	}
}
