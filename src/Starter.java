//package com.javacourse;

import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.JButton;

public class Starter
{
    public  static void main(String[] args) {
        MyFrame fr = new MyFrame();
        JButton btn1 = new JButton("Push");
        fr.add(btn1, BorderLayout.NORTH);
        JButton btn2 = new JButton("Жми");
        fr.add(btn2, BorderLayout.SOUTH);
        fr.setTitle("Forms");
        fr.setBounds(100, 100, 700, 400);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true);
    }
}
