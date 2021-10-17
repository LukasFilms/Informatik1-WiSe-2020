package lab.ex25;

import hdm.shared.Toolbox;

public class TrainTicketMachine {
	public static void main(String[] args) {

		// read all inputs
		short ageInYears = Toolbox.readShort("Bitte Alter eingeben: ");
		int distanceInKM = Toolbox.readInt("Wie weit fahren Sie?: ");
		byte weekday = Toolbox.readByte("Welcher Tag ist Heite? (Mo = 1, ... So = 7): ");
		boolean reservation = Toolbox.readBoolean("Wollen Sie eine Platz reservieren? (j = Ja, n = nein): ");

		// 0,10€ Each KM
		double ticketprice = distanceInKM * 0.10;

		// Calcualte Day costs
		if (weekday == 2) {
			ticketprice = ticketprice + 5.0;
		} else if ((weekday == 6) || (weekday == 7)) {
			ticketprice = ticketprice - 10.0;
		}

		// claculate price with reservation
		if (reservation == true) {
			ticketprice = ticketprice + 2.0;
		}

		// calculate price age
		if (ageInYears <= 21) {
			double young = ((ticketprice / 100) * 30);
			ticketprice = ticketprice - young;
		}

		// limit price
		if (ticketprice >= 50) {
			ticketprice = 49.99;
		} else if (ticketprice <= 3) {
			ticketprice = 3.00;
		}

		// outprint price
		System.out.println("------------------------");
		System.out.printf("Ihr Ticket kostet: %.2f Euro\n", ticketprice);

	}

}
