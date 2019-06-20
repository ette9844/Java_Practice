package homework9;

import java.awt.*;
import java.awt.event.*;

public class Exercise5 {

	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.addWindowListener((WindowListener) new EventHandler() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}
}

class EventHandler extends WindowAdapter { }