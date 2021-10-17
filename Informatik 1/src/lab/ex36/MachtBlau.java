package lab.ex36;

/**
 * Prints all prime numbers between 1 and 100 and their total count.
 */
public class MachtBlau {
	public static void main(String[] args) {
		
		final int UPPER_LIMIT = 100;

		System.out.println("-----------------------------------------------");
		System.out.println("Willkommen zum mysteriösen Programm ohne Namen.");
		System.out.println("-----------------------------------------------");
		
		int CountPrimes = 0;
		for (int CurrentNumber = 1; CurrentNumber < UPPER_LIMIT; CurrentNumber++) {	
			for (int factor = 2; factor <= CurrentNumber; factor++) {
				if (CurrentNumber % factor == 0) {
					if (CurrentNumber == factor) {
						System.out.println(factor);
						CountPrimes++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println("Es wurden " + CountPrimes + " Zahlen gefunden.");
	}
}
