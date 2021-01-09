import java.applet.Applet;
import java.awt.Font;
import java.awt.Graphics;

public class FontType extends Applet{
    public Font font;
    public void init(){
         font = new Font("Forte",Font.BOLD,24);  
    }

    public void paint(Graphics g){
        String original = "Original String";
        g.drawString(original, 100, 50);
        g.setFont(font);
        g.drawString(original, 200, 50);

    }
    
}

/*<APPLET CODE = "FontType.class" NAME = " LAB applet" WIDTH="400" HEIGHT="200"></APPLET>*/
