import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Banner extends Applet implements Runnable {
    String str = "Moving Banner !! Moving Banner !! Moving Banner ";
    Thread t ;
    boolean b;
    
    public void init() {
       setBackground(Color.gray);
       setForeground(Color.yellow);
    }
    public void start() {
       t = new Thread(this);
       b = false;
       t.start();
    }
    public void run () {
       char ch;
       for( ; ; ) {
       try {
          repaint();
          Thread.sleep(250);
          ch = str.charAt(0);
          str = str.substring(1, str.length());
          str = str + ch;
       }
       catch(InterruptedException e) {}
       }
    }
    public void paint(Graphics g) {
       g.drawRect(1,1,300,150);
       g.setColor(Color.YELLOW);
       g.fillRect(1,1,300,150);
       g.setColor(Color.RED);
       g.drawString(str, 1, 150);
    }
 }

/*<APPLET CODE = "Banner.class" NAME = " LAB applet" WIDTH="300" HEIGHT="200"></APPLET>*/
