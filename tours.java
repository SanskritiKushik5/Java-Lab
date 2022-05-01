import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*;
import javax.swing.ButtonGroup; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

public class tours extends JFrame implements ActionListener
{
    JRadioButton r1=new JRadioButton(" North "); 
    JRadioButton r2=new JRadioButton(" West "); 
    JRadioButton r3=new JRadioButton(" East "); 
    JRadioButton r4=new JRadioButton(" South "); 
    ButtonGroup editableGroup = new ButtonGroup(); 
    TextField tx1 = new TextField(10);
    Label l1 = new Label("Kesari Tours & Travels"); 
    Label l2 = new Label("Total");
    Label l3 = new Label("Kashmir"); 
    Label l4 = new Label("Manali"); 
    Label l5 = new Label("Shimla"); 
    Label l6 = new Label("Dehradun"); 
    Label l7 = new Label("Mumbai"); 
    Label l8 = new Label("Gujarat"); 
    Label l9 = new Label("Amritsar"); 
    Label l10 = new Label("Rajasthan"); 
    Label l11= new Label("Orissa"); 
    Label l12= new Label("Kolkata"); 
    Label l13= new Label("Myanmar"); 
    Label l14= new Label("Jharkhand"); 
    Label l15= new Label("Kerala"); 
    Label l16= new Label("Banglore"); 
    Label l17= new Label("Hyderabad"); 
    Label l18= new Label("Tamil Nadu");

    private JPanel PnlOne = new JPanel(new FlowLayout()); 
    private JPanel PnlTwo = new JPanel(new GridLayout(4, 0)); 
    private JPanel PnlThree = new JPanel(new GridLayout(18 ,0)); 
    private JPanel PnlFour = new JPanel(new FlowLayout());

    public tours()
    {
        setLayout(new BorderLayout()); 
        add(PnlOne, BorderLayout.NORTH); 
        add(PnlTwo, BorderLayout.WEST); 
        add(PnlThree, BorderLayout.EAST); 
        add(PnlFour, BorderLayout.SOUTH);

        l1.setBounds(80, 0, 200, 30); 
        PnlOne.add(l1);
        l2.setBounds(80, 0, 50, 30); 
        PnlFour.add(l2); 
        tx1.setBounds(150, 0, 100, 30); 
        PnlFour.add(tx1);

        r1.setBounds(30,100,100,100); 
        r1.addActionListener(this); 
        r2.setBounds(30,200,100,100); 
        r2.addActionListener(this); 
        r3.setBounds(30,300,100,100); 
        r3.addActionListener(this); 
        r4.setBounds(30,400,100,100); 
        r4.addActionListener(this); 
        PnlTwo.add(r1); 
        PnlTwo.add(r2); 
        PnlTwo.add(r3); 
        PnlTwo.add(r4);

        editableGroup.add(r1); 
        editableGroup.add(r2); 
        editableGroup.add(r3);

        editableGroup.add(r4);

        l3.setBounds(30, 50, 50, 30);
        l4.setBounds(30, 80, 50, 30);
        l5.setBounds(30, 110, 50, 30);
        l6.setBounds(30, 140, 50, 30);
        l7.setBounds(30, 50, 50, 30);
        l8.setBounds(30, 80, 50, 30);
        l9.setBounds(30, 110, 50, 30);
        l10.setBounds(30, 140, 50, 30);
        l11.setBounds(30, 50, 50, 30);
        l12.setBounds(30, 80, 50, 30);
        l13.setBounds(30, 110, 50, 30);
        l14.setBounds(30, 140, 50, 30);
        l15.setBounds(30, 50, 50, 30);
        l16.setBounds(30, 80, 50, 30);
        l17.setBounds(30, 110, 50, 30);
        l18.setBounds(30, 140, 50, 30); 
        PnlThree.add(l3); 
        PnlThree.add(l4); 
        PnlThree.add(l5); 
        PnlThree.add(l6); 
        PnlThree.add(l7); 
        PnlThree.add(l8); 
        PnlThree.add(l9); 
        PnlThree.add(l10); 
        PnlThree.add(l11); 
        PnlThree.add(l12); 
        PnlThree.add(l13); 
        PnlThree.add(l14); 
        PnlThree.add(l15); 
        PnlThree.add(l16); 
        PnlThree.add(l17); 
        PnlThree.add(l18);
    
        l3.setVisible(false);
        l4.setVisible(false);
        l5.setVisible(false);
        l6.setVisible(false);
        l7.setVisible(false);
        l8.setVisible(false);
        l9.setVisible(false); 
        l10.setVisible(false); 
        l11.setVisible(false); 
        l12.setVisible(false); 
        l13.setVisible(false); 
        l14.setVisible(false); 
        l15.setVisible(false); 
        l16.setVisible(false); 
        l17.setVisible(false); 
        l18.setVisible(false);

        setSize(500,500); setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        
        l3.setVisible(false); 
        l4.setVisible(false); 
        l5.setVisible(false); 
        l6.setVisible(false); 
        l7.setVisible(false); 
        l8.setVisible(false); 
        l9.setVisible(false); 
        l10.setVisible(false); 
        l11.setVisible(false); 
        l12.setVisible(false); 
        l13.setVisible(false); 
        l14.setVisible(false); 
        l15.setVisible(false); 
        l16.setVisible(false); 
        l17.setVisible(false); 
        l18.setVisible(false);

        if (e.getSource() == r1)
        {
            l3.setVisible(true); 
            l4.setVisible(true);
            l5.setVisible(true); 
            l6.setVisible(true); 
            tx1.setText("50000");
        }
        if (e.getSource() == r2){
            l7.setVisible(true); 
            l8.setVisible(true); 
            l9.setVisible(true); 
            l10.setVisible(true); 
            tx1.setText("40000");
        }
        if (e.getSource() == r3){
            l11.setVisible(true); 
            l12.setVisible(true); 
            l13.setVisible(true); 
            l14.setVisible(true); 
            tx1.setText("20000");
        }
        if (e.getSource() == r4){
            l15.setVisible(true); 
            l16.setVisible(true); 
            l17.setVisible(true); 
            l18.setVisible(true); 
            tx1.setText("30000");
        }
    }
    public static void main(String[] args)
    { 
        tours frame = new tours();
    }
}
