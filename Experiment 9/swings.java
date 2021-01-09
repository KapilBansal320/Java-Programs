import java.awt.*;
import javax.swing.*;

public class swings extends JFrame{
  swings(){
    JLabel label_l1;
    label_l1=new JLabel("Your Name");  
    label_l1.setBounds(50,50, 200,30);  
    add(label_l1); 
    setSize(300,300);  
    setVisible(true);  

    JTextField jtf = new JTextField(20);  
    add(jtf);                            
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(400, 400);

    JTextArea textArea_area=new JTextArea("Write here ...... ");  
    textArea_area.setBounds(50,300,500,500);
    add(textArea_area);
    setSize(400,400); 
    setLayout(null);  
    setVisible(true); 

    JButton bt1 = new JButton("Submit");             
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)     ;
    setLayout(new FlowLayout());          
    setSize(400, 400);                   
    add(bt1);

    setVisible(true);
  }
  public static void main(String[] args){
    new swings();
  }
}
