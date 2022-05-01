import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.awt.*;
import java.awt.event.*;
class FileRead implements ActionListener{
Frame fr;
TextField t;
Label l;
//TextArea ta;
Button b;
FileRead()

{
 fr=new Frame();
 t=new TextField(20);
b=new Button("Read");
//ta=new TextArea(4,4);
 l=new Label(" Enter file name");
fr.setLayout(new FlowLayout());
fr.add(l);
fr.add(t);fr.add(b);
//fr.add(ta);
b.addActionListener(this);
fr.setVisible(true);
fr.setSize(400,400);
}
public void actionPerformed(ActionEvent ae)
{
if (ae.getSource()==b)
{try{
 // Creates a FileInputStream
      FileInputStream file = new FileInputStream(t.getText());

      // Creates a BufferedInputStream
      BufferedInputStream input = new BufferedInputStream(file);

      // Reads first byte from file
      int i = input .read();

      while (i != -1) {
        System.out.print((char) i);
//ta.setText(i);
        // Reads next byte from the file
        i = input.read();
      }} catch(Exception e){}
      //input.close();
}
}
  public static void main(String[] args) {
FileRead f=new FileRead();
  }
}