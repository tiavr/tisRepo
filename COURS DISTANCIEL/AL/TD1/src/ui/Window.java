package ui;

import fc.Variables;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;

public class Window extends JFrame{

    private JMenuBar mb = new JMenuBar();
    private JMenu menu = new JMenu("Pays");
    private JButton button = new JButton("Valider");

    public Window(Variables variable){


        setTitle("Actu' Foot");
        setSize(400,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());



        JLabel label = new JLabel("Bienvenue sur notre application Actu' Foot de résultats sportifs !");

        menu.setMnemonic(KeyEvent.VK_F);
        panel.add(label);
        for(int i = 0; i < variable.getPays().length; i++){
            JMenuItem item = new JMenuItem(variable.getPays()[i]);
            item.addActionListener((event) -> System.exit(0));
            menu.add(item);
        }
        mb.add(menu);
        mb.setLocation(0,0);
        panel.add(mb);

        panel.setPreferredSize(new Dimension(100,200));
        getContentPane().add(panel, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);

        setVisible(true);
    }




}
