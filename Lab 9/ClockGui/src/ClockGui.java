import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class ClockGui extends JFrame implements MouseListener{

    private static JFrame frame;
    private int status=0;
    private static final int spacing = 35;
    private static final float radPerSecMin = (float)(Math.PI / 30.0);
    private static final float radPerNum = (float)(Math.PI/ -6);
    private int size;
    private int centerX;
    private int centerY;

    SimpleDateFormat sf;

    Calendar cal;
    int hour;
    int minute;
    int second;
    Color colorSecond,colorMHour,colorNumber;

    Timer timer;
    TimeZone timeZone;

    public static void main(String args[]){
        frame = new ClockGui();
        frame.setTitle("Analog Clock GUI");
        frame.setVisible(true);
    }

    public ClockGui() {
        // TODO Auto-generated constructor stub
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(700, 100, 400, 430);
        getContentPane().setBackground(new Color(212, 234, 255));

        addMouseListener(this);

        timer = new Timer();
        timeZone = TimeZone.getDefault();
        timer.schedule(new TickTimerTask(), 0, 1000); //after 1s once repaint
    }
    class TickTimerTask extends TimerTask{

        @Override
        public void run() {
            // TODO Auto-generated method stub
            cal = (Calendar) Calendar.getInstance(timeZone);
            repaint();
        }

    }
    @Override
    public void paint(Graphics g) {
        // TODO Auto-generated method stub
        super.paint(g);


            g.setColor(new Color(124, 136, 162));
            g.fillOval(25, spacing, 350, 350);
            g.setColor(Color.WHITE);
            g.fillOval(35, spacing+10, 330, 330);


        size = 400 -spacing;
        centerX = 400/2;
        centerY = 400/2+10;

        //clock face
        drawClockFace(g);

        //get system time
        cal = Calendar.getInstance();
        hour = cal.get(Calendar.HOUR);
        minute = cal.get(Calendar.MINUTE);
        second = cal.get(Calendar.SECOND);

        //draw hands
        drawHands(g,hour,minute,second,colorSecond.RED,colorMHour.BLACK);
    }

    /*-------------Clock Face----------------*/
    private void drawClockFace(Graphics g) {
        // tick marks
        for (int sec = 0; sec<60; sec++) {
            int ticStart;
            if (sec%5 == 0) {
                ticStart = size/2-10;
            }else{
                ticStart = size/2-5;
            }

            if(status ==2){
                drawRadius(g, centerX, centerY, radPerSecMin*sec, ticStart-20, size/2-20,colorNumber.YELLOW);
            }else{
                drawRadius(g, centerX, centerY, radPerSecMin*sec, ticStart-20, size/2-20,colorNumber.BLACK);
            }

        }
    }

    private void drawRadius(Graphics g, int x, int y, double angle,
                            int minRadius, int maxRadius, Color colorNumber) {
        float sine = (float)Math.sin(angle);
        float cosine = (float)Math.cos(angle);
        int dxmin = (int)(minRadius * sine);
        int dymin = (int)(minRadius * cosine);
        int dxmax = (int)(maxRadius * sine);
        int dymax = (int)(maxRadius * cosine);
        g.setColor(colorNumber);
        g.drawLine(x+dxmin, y+dymin, x+dxmax, y+dymax);
    }

    /*----------------Clock Hands--------------------*/
    private void drawHands(Graphics g, double hour, double minute, double second, Color colorSecond, Color colorMHour) {
        double rsecond = (second*6)*(Math.PI)/180;
        double rminute = ((minute + (second / 60)) * 6) * (Math.PI) / 180;
        double rhours = ((hour + (minute / 60)) * 30) * (Math.PI) / 180;

        g.setColor(colorSecond);
        g.drawLine(centerX, centerY, centerX + (int) (150 * Math.cos(rsecond - (Math.PI / 2))), centerY + (int) (150 * Math.sin(rsecond - (Math.PI / 2))));
        g.setColor(colorMHour);
        g.drawLine(centerX, centerY, centerX + (int) (120 * Math.cos(rminute - (Math.PI / 2))), centerY + (int) (120 * Math.sin(rminute - (Math.PI / 2))));
        g.drawLine(centerX, centerY, centerX + (int) (90 * Math.cos(rhours - (Math.PI / 2))), centerY + (int) (90 * Math.sin(rhours - (Math.PI / 2))));
    }
	/*-------------------------------------------------*/

    // event change interface clock
    @Override
    public void mouseClicked(MouseEvent arg0) {
    }
    @Override
    public void mouseEntered(MouseEvent arg0) {}

    @Override
    public void mouseExited(MouseEvent arg0) {}

    @Override
    public void mousePressed(MouseEvent arg0) {}

    @Override
    public void mouseReleased(MouseEvent arg0) {}
}