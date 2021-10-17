package lab.ex56;

import processing.core.PApplet;

public class kaleidoscope extends PApplet {

	public static void main(String args[]) {

		PApplet.main(new String[] { kaleidoscope.class.getName() });
	}

	public void settings() {

		size(800, 800);

	}

	public void setup() {

		background(255);

	}

	public void draw() {

		if (mousePressed) {
			int x = mouseX - (width / 2);
			int y = mouseY - (height / 2);
			int px = pmouseX - (width / 2);
			int py = pmouseY - (height / 2);

			translate((width / 2), (height / 2));
			pushMatrix();
			final int STEPS = 20;
			for (int step = 0; step < STEPS; step++) {
				line(x, y, px, py);
				rotate(TWO_PI / STEPS);
			}
			popMatrix();

		}
	}

}
