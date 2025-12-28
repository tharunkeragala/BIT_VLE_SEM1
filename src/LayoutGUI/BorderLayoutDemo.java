package LayoutGUI;

import javax.swing.*;
import java.awt.*;

class BorderLayoutDemo {
        public static void main(String[] args) {
            JFrame jf1 = new JFrame();
            //jf1.setSize(400,400);
            jf1.setBounds(300,300,400,400);
            jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            jf1.setLayout(new BorderLayout());

            JButton b1 = new JButton("NORTH");
            JButton b2 = new JButton("SOUTH");
            JButton b3 = new JButton("EAST");
            JButton b4 = new JButton("WEST");
            JButton b5 = new JButton("CENTER");

            jf1.add(b1,BorderLayout.NORTH);
            jf1.add(b2,BorderLayout.SOUTH);
            jf1.add(b3,BorderLayout.EAST);
            jf1.add(b4,BorderLayout.WEST);
            jf1.add(b5,BorderLayout.CENTER);

            jf1.setVisible(true);
        }
}
