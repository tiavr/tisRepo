package ui;

import fc.Variables;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.*;

public class Window extends JFrame{

    private JMenuBar mb = new JMenuBar();
    private JMenuBar mb2 = new JMenuBar();
    private JMenu menu = new JMenu("Pays");
    private JMenu menu2 = new JMenu("Championnat");
    Interaction interaction;
    public Window(){

        run();
    }

    public void run(){
        setTitle("Actu' Foot");
        setSize(400,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel panel = new JPanel(new FlowLayout());

        JLabel label = new JLabel("Bienvenue sur notre application Actu' Foot de résultats sportifs !");

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
        menu.setMnemonic(KeyEvent.VK_F);
        mb.add(menu);
        mb.setLocation(0,0);
        content.add(mb);



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
