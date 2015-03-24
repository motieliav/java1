package Prime_simple;

public class prime1 {
	public static void main(String args[]) {
		System.out.println("Starting computing......");
		
		PrimeCalc p = new PrimeCalc(1000000);
		p.compute();
		p.print_results();
		
		System.out.println("\nDONE computing.");
	}
}
