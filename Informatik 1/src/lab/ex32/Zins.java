package lab.ex32;

import hdm.shared.Toolbox;

public class Zins {
	public static void main(String[] args) {

		double anlagesumme = Toolbox.readInt("Anlagesumme (EUR): ");
		double zinssatz = Toolbox.readDouble("Zinssatz (in %): ");
		int laufzeit = Toolbox.readInt("Laufzeit (Jahre): ");

		for (int aktuellesJahr = 1; aktuellesJahr <= laufzeit; aktuellesJahr++) {

			anlagesumme = anlagesumme + anlagesumme * (zinssatz / 100);

			System.out.printf("Nach Jahr %2d: %,16.2f\n", aktuellesJahr, anlagesumme);
		}

	}

}

/*
 * bei anlagesumme 100€ für ein Jahr mit Zins 10%:
 *
 * anlagesumme / 100 * Zins = zins für erstes jahr 1.
 *
 * anlagesumme + zins für erstes Jahr = neue Anlegesumme
 *
 *
 *
 *
 */