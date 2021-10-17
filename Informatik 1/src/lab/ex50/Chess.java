package lab.ex50;

import processing.core.PApplet;

public class Chess extends PApplet {
	
	public static void main(String args[]) {
		PApplet.main(new String[] { Chess.class.getName() });
	}
	
	public void settings() {
		size (320,320);
	}
	
	public void setup() {
		background(0,0,0);
		noStroke();
		
		final int QUADRATE = 10;
		float HOEHE_DER_QUADRATE = (float) height / QUADRATE;
		float BREITE_DER_QUADRATE = (float) width / QUADRATE; 
		
		for (int y = 0; y < QUADRATE; y++) {
			for (int x = 0; x < QUADRATE; x++) {
				
				if ((x + y) % 2 == 0) {
					fill(255, 255, 255);
				} else {
					fill(0, 0, 0);
				}
				
				rect (x * BREITE_DER_QUADRATE, y * HOEHE_DER_QUADRATE, BREITE_DER_QUADRATE, HOEHE_DER_QUADRATE);
				
			}
		} 
	}


}
