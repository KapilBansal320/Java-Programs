import java.awt.*;
import java.awt.event.*;


public class frame{
  public static void main (String args[]){
    Frame frame = new Frame("Frame Java Example"); 
    frame.setSize(300,250);
    frame.addWindowListener(new WindowAdapter(){ 
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });

    frame.setVisible(true);
  } 
} 
