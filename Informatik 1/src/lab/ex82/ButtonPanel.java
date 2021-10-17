package lab.ex82;

import javax.swing.JButton;
import javax.swing.JPanel;

import hdm.shared.MyBasicFrame;

public class ButtonPanel extends JPanel {
	public static void main(String[] args) {
		ButtonPanel panel = new ButtonPanel();
		new MyBasicFrame("MyBasicFrame Demo", 300, 100, panel);
	}

	public ButtonPanel() {
		JButton button = new JButton("Drück mich");
		this.add(button);
	}
}