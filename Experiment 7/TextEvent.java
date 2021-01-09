import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class TextEvent extends Applet implements ActionListener { 
    TextField tf = new TextField(10); 
    Button b1 = new Button("Click");
    String Str ;
    
    public void init() {  
        add(b1);
        //
        add(tf);   
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){  
             Str = tf.getText();
             showStatus(Str);
             repaint()  ;
    }  
}

 /*<APPLET CODE = "TextEvent.class" , NAME = "LAB APPLET PROGRAM", HEIGHT ="200",WIDTH = "350"></APPLET> */