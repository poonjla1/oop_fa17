package com.company;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class Main extends JPanel {

    private Color color1;
    private Color color2;
    private JButton button;

    Main(Color color1,Color color2){
        this.color1= color1;
        this.color2= color2;
        button= new JButton();
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });



    }

    public void paint(Graphics g){
        g.setColor(color1);
        g.fillRect(200, 200 ,800, 800);
        g.setColor(color2);

        for (int i=200;i<=800;i+=200){
            for(int j=200;j<=800;j+=200){
                g.fillRect(i,j,100,100);
            }
        }
       for(int i=300;i<=900;i+=200){
            for(int j=300;j<=900;j+=200){
                g.fillRect(i,j,100,100);
            }
        }
    }


    public static void main(String[] args) {
        Random rand = new Random();
        JFrame f=new JFrame();
        f.setSize(1200,1200);
       final Main panel =  new Main(Color.black, Color.white);
        f.getContentPane().add(panel);
        f.setLocationRelativeTo(null);
        f.setBackground(Color.lightGray);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        JPanel x = new JPanel();
        JButton button= new JButton("Press Here");
        f.getContentPane().add(button,"North");
        button.setSize(20,20);
        button.addActionListener(new ActionListener(){

            boolean colorchanger = true;

            @Override
            public void actionPerformed(ActionEvent e) {
               colorchanger =! colorchanger ;

                float r = rand.nextFloat();
                float g = rand.nextFloat();
                float b = rand.nextFloat();
                Color randomColor = new Color(r, g, b);
                Color randomColor1 = new Color(g, r, b);
                if ( colorchanger) panel.color1 = randomColor;
                else panel.color2 = randomColor;

                panel.repaint();


            }
        });






    }
}


