package ui;

import fc.Variables;

import java.awt.*;
<<<<<<< HEAD
=======
import java.awt.event.KeyEvent;
import java.util.*;
>>>>>>> 6cb1e4b4023bf2175e15f3389c243b09044b83d9
import javax.swing.*;

public class Window extends JFrame{

    private JMenuBar mb = new JMenuBar();
    private JMenuBar mb2 = new JMenuBar();
    private JMenu menu = new JMenu("Pays");
<<<<<<< HEAD
    private JMenu menu2 = new JMenu("Championnat");
    Interaction interaction;
    public Window(){
        run();
    }

    public void run(){
=======
    private JButton button = new JButton("Valider");

    public Window(Variables variable){
>>>>>>> 6cb1e4b4023bf2175e15f3389c243b09044b83d9


        setTitle("Actu' Foot");
        setSize(400,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

<<<<<<< HEAD
        JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel content2 = new JPanel(new FlowLayout());
=======
        JPanel panel = new JPanel(new FlowLayout());

>>>>>>> 6cb1e4b4023bf2175e15f3389c243b09044b83d9


        JLabel label = new JLabel("Bienvenue sur notre application Actu' Foot de résultats sportifs !");

<<<<<<< HEAD
        content.add(label);

        JMenuItem item1 = new JMenuItem("France");
        JMenuItem item2 = new JMenuItem("Espagne");
        JMenuItem item3 = new JMenuItem("Italie");
        JMenuItem item4 = new JMenuItem("Allemagne");
        JMenuItem item5 = new JMenuItem("Angleterre");
        JMenuItem[] listItem = {item1, item2, item3, item4, item5};


        for(int i = 0; i < listItem.length; i++){
            menu.add(listItem[i]);
        }

        mb.add(menu);
        mb.setLocation(0,0);
        content.add(mb);
=======
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
>>>>>>> 6cb1e4b4023bf2175e15f3389c243b09044b83d9

        JMenuItem item6 = new JMenuItem("Championnat 1");
        JMenuItem item7 = new JMenuItem("Championnat 2");
        JMenuItem item8 = new JMenuItem("Championnat 3");

        JMenuItem[] listItem2 = {item6, item7, item8};


        for(int i = 0; i < listItem2.length; i++){
            menu2.add(listItem2[i]);
        }

        mb2.add(menu2);
        mb2.setLocation(0,0);
        content.add(mb2);

        content.setPreferredSize(new Dimension(100,200));
        add(content, BorderLayout.CENTER);
    }



}
