/* Design GUI in java, add checkbox, radio button, combo box, 
change background colours add list. */

import java.awt.*;

class MyFrame
{
    MyFrame(){
        Frame fr = new Frame("Experiment 6");
        fr.setLayout(new FlowLayout());

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male", cg, false);
        Checkbox c2 = new Checkbox("Female", cg, false);
        c1.setBounds(100, 100,  50, 50);
        c2.setBounds(100, 100,  50, 50);

        Checkbox ch1 = new Checkbox("Lab 1");
        Checkbox ch2 = new Checkbox("Lab 2");
        ch1.setBounds(100, 100,  50, 50);
        ch2.setBounds(100, 100,  50, 50);

        Choice ch = new Choice();
        ch.addItem("CST");
        ch.addItem("IT");
        ch.addItem("ENC");
        ch.setBounds(50, 100, 100, 50);

        List l = new List();
        l.add("CST");
        l.add("IT");
        l.setBounds(50, 100, 100, 50);

        Button b1=new Button("Button 1");
        Button b2=new Button("Button 2");
        
        TextField t1 = new TextField("I enjoy Java");    
        t1.setBounds(50, 100, 200, 30); 

        TextArea area = new TextArea("I enjoy Java"); 

        Label l1 = new Label("First Label");  

        fr.add(c1);
        fr.add(c2);
        fr.add(ch1);
        fr.add(ch2);
        fr.add(ch);
        fr.add(l);
        fr.add(b1);
        fr.add(b2);
        fr.add(t1);
        fr.add(area);
        fr.add(l1);
        fr.setVisible(true);
        fr.setSize(700, 400);
    }
    public static void main(String arg[]){
        MyFrame obj = new MyFrame();
    }
}