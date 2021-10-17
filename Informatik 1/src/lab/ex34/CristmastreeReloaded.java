package lab.ex34;

import hdm.shared.Toolbox;

public class CristmastreeReloaded {
	public static void main(String[] args) {

		// Base program
		int heightSquare = Toolbox.readInt("Höhe des Rechecks: ");
		for (int row = 1; row <= heightSquare; row++) {
			for (int star = 1; star <= heightSquare; star++) {
				System.out.print("*");
			}
			System.out.println(); // Start new line
		}

		// Extension 1
		System.out.println("\n---------------------------------------------");
		int heightTriangle = Toolbox.readInt("Höhe des Dreiecks: ");
		for (int row = 1; row <= heightTriangle; row++) {
			for (int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println(); // Start new line
		}

		// Extension 2
		System.out.println("\n---------------------------------------------");
		int heightChristmasTree = Toolbox.readInt("Höhe des Weihnachtsbaumes (ohne Stamm und Boden): ");

		// Draw tree top (triangle)
		for (int row = 1; row <= heightChristmasTree; row++) {
			int spacesInThisRow = heightChristmasTree - row;
			for (int space = 0; space < spacesInThisRow; space++) {
				System.out.print(" ");
			}
			int starsInThisRow = (2 * row) - 1;
			for (int star = 0; star < starsInThisRow; star++) {
				System.out.print("*");
			}

			System.out.println(); // Start new line
		}

		// Draw tree trunk
		for (int spacesInThisRow = 0; spacesInThisRow < heightChristmasTree - 1; spacesInThisRow++) {
			System.out.print(" ");
		}
		System.out.println("|");

		// Draw tree base
		for (int base = 0; base < (2 * heightChristmasTree - 1); base++) {
			System.out.print("=");
		}

	}

}
