import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonEvent extends Applet implements ActionListener {
    Button b1 = new Button("Click");
    String S = "";

    public void init(){
        add(b1);
        b1.addActionListener(this);
    }

    public void paint(Graphics g){
        g.drawString(S, 100, 100);
    }

    public void actionPerformed(ActionEvent e){
        S = "ButtonClicked";
        repaint();
    }
}

/*<APPLET CODE = "ButtonEvent.class" , NAME = "LAB APPLET PROGRAM", HEIGHT ="400",WIDTH = "400"></APPLET> */
