import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
//class that implements MouseListener interface
public class JMouseListenerExample extends Frame implements MouseListener
{
public JMouseListenerExample( )
{
//method for frame linking
addMouseListener(this);
//set the size where width and height is 350
setSize(350,350);
//set the visibility as true
setVisible(true);
}
//implementation of mousePressed method
public void mousePressed(MouseEvent ev)
{
//on pressing the mouse, background color will be green
setBackground(Color.green);
//text to print
System.out.println("Pressing Mouse");
}
//implementation of mouseReleased method
public void mouseReleased(MouseEvent ev)
{
//on pressing the mouse, background color will be pink
setBackground(Color.pink);
//text to print
System.out.println("Released the mouse");
}
//implementation of mouseClicked method
public void mouseClicked(MouseEvent ev)
{
//on clicking the mouse, background color will be yellow
setBackground(Color.yellow);
//text to print
System.out.println("Clicked");
}
//implementation of mouseEntered method
public void mouseEntered(MouseEvent ev)
{
//on entering the window, background color will be red
setBackground(Color.red);
//text to print
System.out.println("Entered the window");
}
//implementation of mouseExited method
public void mouseExited(MouseEvent ev)
{
//on exiting the window, background color will be white
setBackground(Color.white);
//text to print
System.out.println("Mouse left the window");
}
//main method
public static void main(String args[])
{
new JMouseListenerExample();
}
}