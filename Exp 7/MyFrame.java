/* Design GUI in java, add checkbox, radio button, combo box, 
change background colours add list. */

import java.awt.*;

class MyFrame
{
    MyFrame(){
        Frame fr = new Frame("Experiment 5");
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

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        p1.add(c1);
        p1.add(c2);
        p1.add(ch1);
        p1.add(ch2);
        p2.add(ch);
        p2.add(l);
        p1.setBackground(Color.YELLOW);
        p2.setBackground(Color.GREEN);
        fr.add(p1);
        fr.add(p2);
        fr.setVisible(true);
        fr.setSize(700, 700);
    }
    public static void main(String arg[]){
        MyFrame obj = new MyFrame();
    }
}