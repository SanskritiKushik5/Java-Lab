import javax.swing.*; 
import java.awt.*;
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class edittext implements ActionListener
{
    Frame f = new Frame("Operation"); 
    JTextField t1 = new JTextField(); 
    JTextField t2 = new JTextField(); 
    Label l1 = new Label("Text Field 1: ");
    Label l2 = new Label("Text Field 2: ");
    Button b1=new Button("Select"); 
    Button b2=new Button("Replace"); 
    Button b3=new Button("Copy"); 
    Button b4=new Button("Insert"); 
    Button b5=new Button("Append");

    edittext()
    {
        l1.setBounds(50,100,70,30);
        t1.setBounds(120,100,300,30);
        l2.setBounds(50,140,70,30); 
        t2.setBounds(120,140,300,30); 
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        b1.setBounds(90,190,70,30);
        b2.setBounds(190,190,70,30); 
        b3.setBounds(290,190,70,30); 
        b4.setBounds(140,240,70,30); 
        b5.setBounds(240,240,70,30);

        b1.addActionListener(this); 
        b2.addActionListener(this); 
        b3.addActionListener(this); 
        b4.addActionListener(this); 
        b5.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);

        f.setSize(500,500); 
        f.setLayout(null); 
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1){
            t1.selectAll(); 
            t1.requestFocus();
        }
        if(e.getSource()==b2){
            t1.setText("");
        }
        if(e.getSource()==b3){
            t1.copy();
        }
        if(e.getSource()==b4){
            t2.setText(t1.getText());
        }
        if(e.getSource()==b5){
            t1.selectAll();
            t1.copy();
            t2.paste(); 
        }
    }
    public static void main(String[] args)
    {
        edittext frame = new edittext();
    }
}
