package lab.ex31;

public class Floor {
	public static void main(String[] args) {

		final double PRICE_PER_SQUARE_METER = 36.99;

		System.out.print("    ");
		for (double height = 1; height <= 5; height++) {
			System.out.printf("%8.0f M", height);
		}
		System.out.println();

		
		
		
		
		
		
		
		
		for (double width = 2; width <= 20; width += 2) {
			System.out.printf("%2.0f m", width);

			for (double height = 1; height <= 5; height++) {
				double price = (height * width) * PRICE_PER_SQUARE_METER;
				System.out.printf("%10.2f", price);
			}

			System.out.println();

		}

	}

}
