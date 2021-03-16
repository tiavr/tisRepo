package notification.ui;

import notification.fc.*;

import javax.security.auth.callback.Callback;
import javax.swing.*;
import javax.swing.JLabel;

public class Window extends JFrame implements Callback {
	JLabel label = new JLabel("0123456789");
	
	Window() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(label);
		pack();
		setVisible(true);
	}
	
	public void valueChange(double value) {

		label.setText(Double.toString(value));
	}
}
