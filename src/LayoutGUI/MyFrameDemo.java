package LayoutGUI;

import javax.swing.JFrame;

class MyFrameDemo {
    public static void main(String[] args) {
        JFrame jf1 = new JFrame();
        //jf1.setSize(400,400);
        jf1.setBounds(300,300,400,400);
        jf1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf1.setVisible(true);
    }
}