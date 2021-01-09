import java.applet.*;
import java.awt.*;

public class Control extends Applet {
    //Checkbox group
    CheckboxGroup cg = new CheckboxGroup();
    Checkbox c1 = new Checkbox("Android",cg,false);
    Checkbox c2 = new Checkbox("Web",cg,false);
    //Checkbox
    Checkbox c3 = new Checkbox("single checkbox",false);
    //Choice
    Choice choice = new Choice();
    //Button
    Button b1 = new Button("Button");
    //Label 
    Label label =new Label("practical6");
    //TextField
    TextField T1 = new TextField(10);
    //TextArea
    TextArea T2 =new TextArea(5,10);

    public void init(){
        add(c1);
        add(c2);
        add(c3);

        choice.addItem("java");
        choice.addItem("kotlin");
        add(choice);
        add(b1);
        add(label);
        add(T1);
        add(T2);

    }

    public void paint(Graphics g){
        showStatus("custom status"); 
    }
    
}

/*<APPLET CODE = "Control.class" NAME = " LAB applet" WIDTH="500" HEIGHT="500"></APPLET>*/
