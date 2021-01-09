import java.applet.Applet;
import java.awt.Graphics;

public class Draw extends Applet{
    public void paint(Graphics g){
        int x[] = { 10, 30, 40, 50, 110, 140 }; 
        int y[] = { 140, 110, 50, 40, 30, 10 }; 
        int n = 6; 

        g.drawLine(25, 300, 50, 100);
        g.drawRect(40, 40, 50, 50);
        g.fillRect(100, 100, 50, 50);
        g.drawRoundRect(160, 160, 50, 50, 20, 20);
        g.fillRoundRect(220, 220, 50, 50, 50, 20);
        g.drawOval(400,400, 50, 30);
        g.fillOval(300, 300, 50, 30);
        g.drawPolygon(x,y,n);
    }
    
}
/*<APPLET CODE = "Draw.class" NAME = " LAB applet" WIDTH="500" HEIGHT="500"></APPLET>*/