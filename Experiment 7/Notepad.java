import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Notepad extends Applet implements ActionListener{
     TextArea tf =new TextArea(500,500);
     String title = "Custom Notepad";
     Choice font = new Choice();
     Choice foreground = new Choice();
     Choice background = new Choice();
     Button set = new Button("set");

     public void init(){
        setLayout(new FlowLayout(FlowLayout.LEFT,5,2));
        font.addItem("Serif");
        font.addItem("SansSerif");
        font.addItem("");

        foreground.addItem("ForeGround");
        foreground.addItem("White");
        foreground.addItem("Black");

        background.addItem("Background");
        background.addItem("White");
        background.addItem("Blackclear");

        set.addActionListener(this);
        add(font);
        add(foreground);
        add(background);
        add(set);
        add(tf);
     }

     public void paint(Graphics g){
        showStatus(title);
     }

     public void actionPerformed(ActionEvent e){
        String new_font = font.getItem(font.getSelectedIndex());
        String new_foreground = foreground.getItem(font.getSelectedIndex());
        String new_background = background.getItem(font.getSelectedIndex());

        tf.setFont(new Font(new_font,Font.PLAIN,20));
     }
}

/*<APPLET CODE = "Notepad.class" , NAME = "LAB APPLET PROGRAM", HEIGHT ="500",WIDTH = "500"></APPLET> */