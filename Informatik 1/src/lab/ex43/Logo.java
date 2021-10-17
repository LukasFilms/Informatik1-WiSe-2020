package lab.ex43;

import java.text.SimpleDateFormat;
import processing.core.PFont; 
import processing.core.PApplet;

/**
 * Minimal skeleton code for a Processing-based Java application
 */
public class Logo extends PApplet {
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public static void main(String args[]) {
		// Note: Method PApplet.main can take additional arguments, e.g.
		// "--present" for activating full screen mode.
		PApplet.main(new String[] { Logo.class.getName() });
	}

	@Override
	public void settings() {
		// Setup size of output window
		size(109, 100);
	}

	@Override
	public void setup() {
		background(255, 255, 255);
		noStroke();
	}

	@Override
	public void draw() {
		// draw rectangles 
		fill(229, 20, 51);
		rect(10,6,6,41);  //rect left
		rect(23,22,6,25); //rect netxt left
		rect(39,22,6,25); //rect right from middle
		rect(52,6,6,41);  //rect Middle
		rect(68,22,6,25); //rect left from Middle
		rect(81,22,6,25); //rect next to right
		rect(94,22,6,25); //rect right
		
		// draw Font
		fill(63, 72, 71);
		noStroke();
		smooth();
		PFont font = createFont("Arial",13);
		textFont(font);
		textSize(13);
		text("HOCHSCHULE", 10, 50 + 15 + 7);
		text("DER   MEDIEN", 10, 50 + 15 + 7 + 4 + 15);
	}
}
