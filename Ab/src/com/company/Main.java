
package com.company;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
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
        JFrame f=new JFrame("task");
        f.setSize(900,900);

        //final Main panel= new Main(Color.black, Color.white);
        //f.getContentPane().add(panel);
        JButton Right=new JButton("Right");
        JButton Left=new JButton("Left");
        JButton Up=new JButton("Up");
        JButton Down=new JButton("Down");
        JPanel mainPanel=new JPanel(new BorderLayout());
        JPanel buttonpanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonpanel.add(Right);
        buttonpanel.add(Left);
        buttonpanel.add(Up);
        buttonpanel.add(Down);
        buttonpanel.setBorder(BorderFactory.createLineBorder(Color.lightGray));
        mainPanel.add(buttonpanel,BorderLayout.SOUTH);
        f.add(mainPanel);

        f.setLocationRelativeTo(null);
        f.setBackground(Color.lightGray);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Right.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Left.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Up.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        Down.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        f.setVisible(true);





    }
        }

