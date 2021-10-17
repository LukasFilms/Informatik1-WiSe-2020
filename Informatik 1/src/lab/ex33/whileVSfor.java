package lab.ex33;

public class whileVSfor {
	public static void main(String[] args) {
		
		// Aufg. A) adds every even Number from 0-100 to sum and prints the outcome
		
		System.out.println("Calculates the sum of all even numbers in [0;100]");
		
		int sum = 0;
		
		for (int i = 0; i <= 100; i += 2 ) { //counts every even number from 0 - 100
			System.out.println("Addiere " + i + "...");
			sum += i; //adds every even number to sum
		}
		
		System.out.println("Summe der gerade Nummern" + sum); //prints the complete sum
		
		
		System.out.println(); // spacer
		System.out.println();
		System.out.println();
		
		
		
		// Aufg. B) adds every square like (2*2=4 + 3*3=9) = 13 + ...
		System.out.println("Calculates the sum of all squares of [0;10[.");
		
		int sumSquares = 0;
		int i = 0;
		
		while (i < 10) {
			System.out.println("Addiere " + (i*i) + "...");
			sumSquares += (i * i);
			i += 1;
		}
		System.out.println("Summe der Quadrate: " + sumSquares);
		
	}

}
