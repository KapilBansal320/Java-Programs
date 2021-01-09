import java.applet.Applet;
import java.awt.Graphics;

public class LifeCycle extends Applet{
    public void init(){
        System.out.println("Init() method called");
    }
    public void start(){
        System.out.println("Start() method called");
    }
    public void paint(Graphics g){
        System.out.println("Paint() method called");
    }
    public void stop(){
        System.out.println("Stop() method called");
    }
    public void destroy(){
        System.out.println("Destroy() method called");
    }
}

/*<APPLET CODE = "LifeCycle.class" NAME = " LAB applet" WIDTH="300" HEIGHT="200"></APPLET>*/