package lab.ex29;

public class ForLoopI {
	public static void main(String[] args) {

		int i = 7;
		for (i = 7; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Fertig.");

	}

}
