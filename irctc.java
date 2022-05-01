import java.awt.*; import java.applet.*; import javax.swing.*;

public class irctc extends Applet
{
public static void main(final String[] args)
{
Frame f = new Frame("IRCTC"); f.setSize(400, 400); f.setLayout(null); f.setVisible(true);

Label l1, l2, l3, l4, l5, l6, l7, l8;
l1 = new Label("Name of passenger : "); l1.setBounds(50, 50, 120, 30);
l2 = new Label("Source station :"); l2.setBounds(50, 80, 120, 30);
l3 = new Label("Destination station : "); l3.setBounds(50, 110, 120, 30);
l4 = new Label("Date"); l4.setBounds(50, 140, 120, 30); l5 = new Label("Class"); l5.setBounds(50, 170, 120, 30); l6 = new Label("Availability"); l6.setBounds(50, 200, 120, 30); l7 = new Label("Book Ticket "); l7.setBounds(50, 230, 120, 30); l8 = new Label("Pay"); l8.setBounds(50, 260, 120, 30); f.add(l1);
f.add(l2);
f.add(l3);




f.add(l4);
f.add(l5);
f.add(l6);
f.add(l7);
f.add(l8);

TextField tx1 = new TextField(10); tx1.setBounds(200, 55, 200, 20); TextField tx2 = new TextField(10); tx2.setBounds(200, 85, 200, 20); TextField tx3 = new TextField(10); tx3.setBounds(200, 115, 200, 20); TextField tx4 = new TextField(10); tx4.setBounds(200, 145, 200, 20); TextField tx5 = new TextField(10); tx5.setBounds(200, 200, 200, 20); TextField tx6 = new TextField(10); tx6.setBounds(200, 270, 200, 20);

f.add(tx1);
f.add(tx2);
f.add(tx3);
f.add(tx4);
f.add(tx5);
f.add(tx6);

Choice c = new Choice(); c.setBounds(200, 170, 100, 50); c.add("First");
c.add("Second");
c.add("Third"); f.add(c);

JRadioButton r1 = new JRadioButton("Yes"); r1.setBounds(200, 230, 50, 30); JRadioButton r2 = new JRadioButton("No"); r2.setBounds(260, 230, 50, 30);
f.add(r1);
f.add(r2);





Button b = new Button("CONFIRM"); b.setBounds(150,300,100,40); f.add(b);
}
}