import java.awt.*;

class LayoutBorder
{
    LayoutBorder(){
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Frame fr = new Frame("CST");
        fr.setLayout(new BorderLayout());
        fr.add(b1, BorderLayout.NORTH);
        fr.add(b2, BorderLayout.SOUTH);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
	public static void main(String arg[]) {
		LayoutBorder obj = new LayoutBorder();
	}
}
