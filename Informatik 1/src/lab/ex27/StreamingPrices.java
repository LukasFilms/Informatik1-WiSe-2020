package lab.ex27;

import hdm.shared.Toolbox;

public class StreamingPrices {
	public static void main(String[] args) {

		// User informations
		int user = Toolbox.readInt("Wie viele Geräte wollen Sie nutzen?: ");
		char duration = Toolbox.readChar("Wie lang soll das Abonement andauern? (T = Tag, M = Monat, J = Jahr): ");
		char quality = Toolbox.readChar("Welche Qualität soll das Bild haben? H = HD, oder U = UHD?: ");

		switch (user) {
		case 1:

			switch (quality) {
			case 'H':

				switch (duration) {
				case 'T':
					System.out.println("1 Nutzer, in HD, für 1 Tag: 0,99€");
					break;
				case 'M':
					System.out.println("1 Nutzer, in HD, für 1 Monat: 9,99€");
					break;
				case 'J':
					System.out.println("1 Nutzer, in HD, für 1 Jahr: 49,00");
					break;
				default:
					System.out.println("Ungültige Längenangabe");
				}
				break;

			case 'U':

				switch (duration) {
				case 'T':
					System.out.println("1 Nutzer, in UHD, für 1 Tag: 1,99€");
					break;
				case 'M':
					System.out.println("1 Nutzer, in UHD, für 1 Monat: 12,00€");
					break;
				case 'J':
					System.out.println("1 Nutzer, in UHD, für 1 Jahr: 55,00");
					break;
				default:
					System.out.println("Ungültige Längenangabe");
				}
				break;

			default:
				System.out.println("Ungültige Qualitätsangabe");
			}
			break;

		// now we are back to user
		case 2:

			switch (quality) {
			case 'H':

				switch (duration) {
				case 'T':
					System.out.println("2 Nutzer, in HD, für 1 Tag: 1,29€");
					break;
				case 'M':
					System.out.println("2 Nutzer, in HD, für 1 Monat: 12,90€");
					break;
				case 'J':
					System.out.println("2 Nutzer, in HD, für 1 Jahr: 55,00");
					break;
				default:
					System.out.println("Ungültige Längenangabe");
				}
				break;

			case 'U':

				switch (duration) {
				case 'T':
					System.out.println("2 Nutzer, in UHD, für 1 Tag: 1,29€");
					break;
				case 'M':
					System.out.println("2 Nutzer, in UHD, für 1 Monat: 15,00€");
					break;
				case 'J':
					System.out.println("2 Nutzer, in UHD, für 1 Jahr: 60,00");
					break;
				default:
					System.out.println("Ungültige Längenangabe");
				}
				break;

			default:
				System.out.println("Ungültige Qualitätsangabe");
			}
			break;

		// now we are back to user
		default: // more than 1/2 user

			switch (quality) {
			case 'H':

				switch (duration) {
				case 'T':
					System.out.println("Mehr als 2 Nutzer, in HD, für 1 Tag: 1,59€");
					break;
				case 'M':
					System.out.println("Mehr als 2 Nutzer, in HD, für 1 Monat: 15,99€");
					break;
				case 'J':
					System.out.println("Mehr als 2 Nutzer, in HD, für 1 Jahr: 59,00");
					break;
				default:
					System.out.println("Ungültige Längenangabe");
				}
				break;

			case 'U':

				switch (duration) {
				case 'T':
					System.out.println("Mehr als 2 Nutzer, in UHD, für 1 Tag: 1,59€");
					break;
				case 'M':
					System.out.println("Mehr als 2 Nutzer, in UHD, für 1 Monat: 19,00€");
					break;
				case 'J':
					System.out.println("Mehr als 2 Nutzer, in UHD, für 1 Jahr: 70,00");
					break;
				default:
					System.out.println("Ungültige Längenangabe");
				}
				break;

			default:
				System.out.println("Ungültige Qualitätsangabe");
			}

		}

	}

}
