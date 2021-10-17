package lab.ex42;

import java.text.SimpleDateFormat;
import java.util.Date;

import processing.core.PApplet;

/**
 * Minimal skeleton code for a Processing-based Java application
 */
public class HelloProcessing extends PApplet {
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	public static void main(String args[]) {
		// Note: Method PApplet.main can take additional arguments, e.g.
		// "--present" for activating full screen mode.
		PApplet.main(new String[] { HelloProcessing.class.getName() });
	}

	@Override
	public void settings() {
		// Setup size of output window
		size(600, 200);
	}

	@Override
	public void setup() {
		// Add one-time setup code here...

		// Make window resizable.
		surface.setResizable(true);

		textAlign(CENTER);
	}

	@Override
	public void draw() {
		// Add per-frame code here...
		background(mouseX, mouseY, 100);
		textSize(20);
		text("Wow, es funktioniert!", width / 2, 30);
		textSize(40);
		text(dateFormat.format(new Date()), width / 2, height / 2);
		textSize(15);
		text("Tipp: Bewegen Sie die Maus über diesem Fenster\n und verändern Sie die Fenstergröße.", width / 2,
				height - 50);
	}
}
