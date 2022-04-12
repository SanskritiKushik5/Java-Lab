import java.awt.*;
public class MyFrame
{
    public static void main(String arg[])
    {
        Frame fr=new Frame("Java Lab 5 - Frames&AWT");

        Button b1=new Button("Submit");
        Button b2=new Button("Back");
        Button b3=new Button("Next");

        fr.setLayout(new FlowLayout());

        fr.add(b1);
        fr.add(b2);
        fr.add(b3);

        fr.setVisible(true);
        fr.setSize(400,400);

        Checkbox checkbox1 = new Checkbox("Lab 1");
        Checkbox checkbox2 = new Checkbox("Lab 2");
        Checkbox checkbox3 = new Checkbox("Lab 3");
        Checkbox checkbox4 = new Checkbox("Lab 4");

        checkbox1.setBounds(100, 100,  50, 50);
        checkbox2.setBounds(100, 100,  50, 50);
        checkbox3.setBounds(100, 100,  50, 50);
        checkbox4.setBounds(100, 100,  50, 50);

        fr.add(checkbox1);  
        fr.add(checkbox2);   
        fr.add(checkbox3);  
        fr.add(checkbox4);  


        TextField t1=new TextField("Welcome to Java UML Lab");
        t1.setBounds(50, 100, 200, 30);
        fr.add(t1); 

        TextArea a1 = new TextArea("Enter your name and roll number:\n");
        a1.setBounds(10, 30, 300, 300);  
        fr.add(a1);
    
    }
}