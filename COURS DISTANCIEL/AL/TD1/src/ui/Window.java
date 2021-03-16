package ui;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Window extends JFrame{

    private JMenuBar mb = new JMenuBar();
    private JMenu menu = new JMenu("Pays");

    public Window(){


        setTitle("Actu' Foot");
        setSize(400,500);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel content = new JPanel(new FlowLayout(FlowLayout.CENTER));



        JLabel label = new JLabel("Bienvenue sur notre application Actu' Foot de résultats sportifs !");

        content.add(label);

        mb.add(menu);
        mb.setLocation(0,0);
        content.add(mb);
        content.setPreferredSize(new Dimension(100,200));
        getContentPane().add(content, BorderLayout.CENTER);

        setVisible(true);
    }




}
