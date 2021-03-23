package ui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

import fc.Function;

public class Main extends JFrame {
	JList list;
	Grapher grapher;
	DefaultListModel<Function> model;
	
	Main(String title) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// window content
		model = new DefaultListModel<Function>();
		list = new JList(model);
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
			public void actionPerformed(ActionEvent event) {
				add_function();
			}
		};
		final int create_key = KeyEvent.VK_N;
		creater.putValue(Action.ACCELERATOR_KEY, 
		                 KeyStroke.getKeyStroke(create_key, modifier));
		creater.putValue(Action.MNEMONIC_KEY, create_key);
		Action delete = new AbstractAction("Delete...") {
			@Override
			public void actionPerformed(ActionEvent e) {
				remove_function();
			}
		};
		final int delete_key = KeyEvent.VK_R;
		delete.putValue(Action.ACCELERATOR_KEY,
				KeyStroke.getKeyStroke(delete_key, modifier));
		delete.putValue(Action.MNEMONIC_KEY, delete_key);


		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu menu = new JMenu("Expression");
		menu.add(creater);
		menu.add(delete);
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
			model.addElement(f);

			repaint();
		}
	}

	void remove_function(){
		Object[] values = {Function.COS, Function.SIN, Function.TAN, Function.EXP, Function.LOG};
		Function f = (Function)JOptionPane.showInputDialog(
				this,
				"Choose one", "Expression",
				JOptionPane.INFORMATION_MESSAGE, null,
				values, values[0]
		);
		if(f != null) {
			model.removeElement(f);

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
