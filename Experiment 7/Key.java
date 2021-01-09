import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Key extends Applet implements KeyListener{
    char ch;
    String str;
    public void init()          {
      addKeyListener(this);
    }

    public void keyPressed(KeyEvent e)   {   }
    public void keyReleased(KeyEvent e)  {   }
    public void keyTyped(KeyEvent e){   
      ch = e.getKeyChar();
      if(ch == 'a')
        str = "a for apple";    
      else if(ch == 'e')
        str = "e for elephant";    
      else if(ch == 'i')
        str = "i for igloo";    
      else if(ch == 'o')
        str = "o for ox";    
      else if(ch == 'u')
        str = "u for umbrella";    
      else
        str = "Type only vowels a, e, i, o, u only";    
    
      repaint();
    }    
  
    public void paint(Graphics g){
      g.drawString(str, 100, 150);
      showStatus("You typed " + ch + " character");
    }
}

/*<APPLET CODE = "Key.class" , NAME = "LAB APPLET PROGRAM", HEIGHT ="400",WIDTH = "400"></APPLET> */