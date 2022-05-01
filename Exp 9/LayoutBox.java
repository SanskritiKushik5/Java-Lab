import java.awt.*;
import java.awt.FlowLayout;

class LayoutBox
{
    LayoutBox(){
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Frame fr = new Frame("CST");
        fr.setLayout(new FlowLayout());
        fr.add(b1, FlowLayout.LEFT);
        fr.add(b2, FlowLayout.RIGHT);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
	public static void main(String arg[]) {
		LayoutBox obj = new LayoutBox();
	}
}
