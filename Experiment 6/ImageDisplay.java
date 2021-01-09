

import java.applet.Applet;
import java.awt.*;

public class ImageDisplay extends Applet{
    Image image;

    public void init()
    {
     image = getImage(getDocumentBase(), "image.png");
    }
   
    public void paint(Graphics g) 
    {
       g.drawImage(image,50, 50, this);
    }
    
}

/*<APPLET CODE = "ImageDisplay.class" NAME = " LAB applet" WIDTH="500" HEIGHT="500"></APPLET>*/
