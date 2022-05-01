import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class JTabbedPaneDemo extends JPanel {

	public JTabbedPaneDemo() {
		ImageIcon icon = new ImageIcon("java-swing-tutorial.JPG");
		JTabbedPane jtbExample = new JTabbedPane();
		JPanel jplInnerPanel1 = createInnerPanel("Tab 1");
		jtbExample.addTab("One", icon, jplInnerPanel1, "Tab 1");
		jtbExample.setSelectedIndex(0);
		JPanel jplInnerPanel2 = createInnerPanel("Tab 2");
		jtbExample.addTab("Two", icon, jplInnerPanel2);
		JPanel jplInnerPanel3 = createInnerPanel("Tab 3");
		jtbExample.addTab("Three", icon, jplInnerPanel3, "Tab 3");
		JPanel jplInnerPanel4 = createInnerPanel("Tab 4");
		jtbExample.addTab("Four", jplInnerPanel4);
		// Add the tabbed pane to this panel.
		setLayout(new GridLayout(1, 1));
		add(jtbExample);

	jplInnerPanel1.setToolTipText("HI I have click it");}
	protected JPanel createInnerPanel(String text) {
		JPanel jplPanel = new JPanel();
		JLabel jlbDisplay = new JLabel(text);
		jlbDisplay.setHorizontalAlignment(JLabel.CENTER);
		jplPanel.setLayout(new GridLayout(1, 1));
		jplPanel.add(jlbDisplay);
		return jplPanel;
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("TabbedPane");
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(new JTabbedPaneDemo(),
				BorderLayout.CENTER);
		frame.setSize(400, 125);
		frame.setVisible(true);
	}
}