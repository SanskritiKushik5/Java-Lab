import java.awt.*;

class LayoutGrid
{
    LayoutGrid(){
        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 2");
        Button b3 = new Button("Button 3");
        Frame fr = new Frame("CST");
        fr.setLayout(new GridLayout(2, 2));
        fr.add(b1);
        fr.add(b2);
        fr.add(b3);
        fr.setSize(400, 400);
        fr.setVisible(true);
    }
	public static void main(String arg[]) {
		LayoutGrid obj = new LayoutGrid();
	}
}
