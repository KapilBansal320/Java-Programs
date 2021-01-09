

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.text.AttributeSet.ColorAttribute;

public class HelloWorld extends Applet {
    public void init(){
        setBackground(Color.YELLOW);
        setForeground(Color.RED);
    } 

    public void paint(Graphics g){
        g.drawString("Hello World!!", 100, 50);
    }
    
}

<APPLET CODE = "HelloWorld.class" NAME = "LAB applet" WIDTH="300" HEIGHT="200"></APPLET>
