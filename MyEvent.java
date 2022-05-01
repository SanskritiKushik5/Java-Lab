import java.awt.*;
import java.awt.event.*;
class MyEvent implements ActionListener
{
    Button  b1,b2;
    TextField t1,t2,t3;
    Label l1,l2;
    MyEvent()
    {
        l1=new Label("Enter no.: ");  
        l1.setBounds(150, 100, 50, 25);
        t1=new TextField(15);
        t1.setBounds(220, 100, 75, 25);
        l2=new Label("Enter no.: ");  
        l2.setBounds(150, 150, 50, 25);
        t2=new TextField(15);
        t2.setBounds(220, 150, 75, 25);
        b1=new Button("ADD"); 
        b1.setBounds(70, 200, 50, 25);
        b2=new Button("SUBTRACT");
        b2.setBounds(140, 200, 75, 25); 
        t3=new TextField(15);
        t3.setBounds(250, 200, 75, 25);
        b1.addActionListener(this);
        b2.addActionListener(this);

         
        Frame fr=new Frame();  
        fr.add(l1);
        fr.add(t1);
        fr.add(l2);
        fr.add(t2);
        fr.add(b1);
        fr.add(b2);
        fr.add(t3);

        fr.setLayout(null);
        fr.setVisible(true);
        fr.setSize(500,500);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(a+b));
        }
        if(ae.getSource()==b2){
            int a = Integer.parseInt(t1.getText());
            int b = Integer.parseInt(t2.getText());
            t3.setText(Integer.toString(a-b));
        }
    }
    public static void main(String arg[])
    {
        MyEvent obj=new MyEvent();
    }

}