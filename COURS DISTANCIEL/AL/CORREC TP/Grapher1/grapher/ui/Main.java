package grapher.ui;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import grapher.fc.Function;

public class Main extends JFrame {
	Main(String title, Function[] functions) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Grapher grapher = new Grapher();
		for(Function function: functions) {
			grapher.add(function);
		}
		add(grapher);
		pack();
	}
	
	public static void main(String[] args) {
		final Function[] functions = {Function.COS, Function.SIN};
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main("grapher", functions).setVisible(true); 
			}
		});
	}
}
