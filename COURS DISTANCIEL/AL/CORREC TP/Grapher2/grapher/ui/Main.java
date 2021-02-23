package grapher.ui;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import javax.swing.Action;
import javax.swing.AbstractAction;
import java.awt.event.*;

import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.KeyStroke;

import javax.swing.SwingUtilities;

import grapher.fc.Function;

public class Main extends JFrame {
	JList list;
	Grapher grapher;
	
	Main(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// window content
		list = new JList();
		grapher = new Grapher(list);

		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		split.setContinuousLayout(true);
		split.setDividerLocation(100);
		split.add(list);
		split.add(grapher);
		add(split);
		pack();
		
		// menu
		final int modifier = Toolkit.getDefaultToolkit().getMenuShortcutKeyMask();
		Action creater = new AbstractAction("Add…") {
			public void actionPerformed(ActionEvent event) { add_function(); }
		};
		final int create_key = KeyEvent.VK_N;
		creater.putValue(Action.ACCELERATOR_KEY, 
		                 KeyStroke.getKeyStroke(create_key, modifier));
		creater.putValue(Action.MNEMONIC_KEY, create_key);

		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu menu = new JMenu("Expression");
		menu.add(creater);
		menubar.add(menu);		
	}
	
	void add_function() {
		Object[] values = {Function.COS, Function.SIN, Function.TAN, Function.EXP, Function.LOG};
		Function f = (Function)JOptionPane.showInputDialog(
			this, 
			"Choose one", "Expression",
			JOptionPane.INFORMATION_MESSAGE, null,
			values, values[0]
		);
		
		if(f != null) {
			grapher.addElement(f);
                        repaint();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Main("grapher").setVisible(true); 
			}
		});
	}
}
