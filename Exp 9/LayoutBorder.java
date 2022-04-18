import java.awt.*;

class LayoutBorder
{
    LayoutBorder(){
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Button b4 = new Button("Button 4");
        Button b5 = new Button("Button 5");
        Frame fr = new Frame("CST");
        fr.setLayout(new BorderLayout());
        fr.add(b1, BorderLayout.NORTH);
        fr.add(b2, BorderLayout.SOUTH);
        fr.add(b3, BorderLayout.EAST);
        fr.add(b4, BorderLayout.WEST);
        fr.add(b5, BorderLayout.CENTER);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
	public static void main(String arg[]) {
		LayoutBorder obj = new LayoutBorder();
	}
}
