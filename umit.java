import java.awt.*;
import java.applet.*; 
import javax.swing.*;

public class umit extends Applet
{
    public static void main(String[] args)
    {
        Frame f=new Frame("UMIT"); 
        f.setSize(400,400); 
        f.setLayout(null); 
        f.setVisible(true);

        Label l1,l2,l3;
        l1=new Label("UMIT"); 
        l1.setBounds(150,50, 100,30); 
        l2=new Label("Name"); 
        l2.setBounds(50,100, 100,30); 
        l3=new Label("Branch");
        l3.setBounds(50,150,100,30); 
        f.add(l1);
        f.add(l2);
        f.add(l3);

        TextField tx = new TextField(10); 
        tx.setBounds(75,105,200,20); 
        f.add(tx);

        Choice c = new Choice(); 
        c.setBounds(150,150,100,50); 
        c.add("CST");
        c.add("IT");
        c.add("ENC");
        c.add("EE"); 
        f.add(c);

        Checkbox cb = new Checkbox(" ",true); 
        cb.setBounds(50,175,50,30);
        f.add(cb);

        JRadioButton r=new JRadioButton(" ", true); 
        r.setBounds(50,220,50,30);
        ButtonGroup bg=new ButtonGroup(); 
        bg.add(r);
        f.add(r);
    }
}
