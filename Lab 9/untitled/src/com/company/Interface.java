package com.company;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface {

    private JLabel label;
    private JTextField textfield;
    private JButton button;
    private JPanel panel;


    public Interface() throws InterruptedException {
        JFrame frame = new JFrame("Lab Task 9");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 260);
        //JPanel buttonPane = new JPanel();
        textfield = new JTextField();
        textfield.setColumns(100);
        panel = new JPanel();
        panel.add(textfield);
        button=new JButton("Text Field/Press Again for Result");
        //panel.revalidate();
        //panel.repaint();
        //JTextField xt = new JTextField();
        //JButton button = new JButton("Text Field/Press Again for Result");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //panel.removeAll();
                //panel.add(textfield);
                //panel.add(label);
                panel.revalidate();
                panel.repaint();
                String text = textfield.getText();

                String Rt = reverse.reverseIt(text);
                System.out.println();
                label.setText("Your reverse Text is this: "+ "\n" + Rt);

            }
        });


        panel.add(button);
        //frame.add(buttonPane, BorderLayout.NORTH);
        label = new JLabel("Press Here");
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
    }
}