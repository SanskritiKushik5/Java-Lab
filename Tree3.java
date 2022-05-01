import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.tree.*;
import javax.swing.event.*;

public class Tree3
{
    public static void main(String... ar)
    {
    SwingUtilities.invokeLater(new Runnable() {
        public void run(){
            new A();
        }
    });

    }//Closing the main method
    }//Closing the class Combo

    class A implements TreeSelectionListener
    {
    Object [] index;
    JFrame jf;
    JTree tree1; 
    DefaultTreeModel dTree;
    JLabel label1, label2;

    A()
    {
        index= new Object[]{"Local Disk (C:)", "Local Disk (D:)", "Local Disk (E:)"};


        
        jf= new JFrame("JTree");
        label1 = new JLabel("Displaying tree");
        label2 = new JLabel();


        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode("My Computer");

        //Creating 3 children of the root node, My Computer.
        DefaultMutableTreeNode cDrive = new DefaultMutableTreeNode("Local Disk (C:)");
        DefaultMutableTreeNode dDrive = new DefaultMutableTreeNode("Local Disk (D:)");
        DefaultMutableTreeNode eDrive = new DefaultMutableTreeNode("Local Disk (E:)");

        //Adding 3 children - C, D, and E Drive to the root note, My Computer
        rootNode.add(cDrive);
        rootNode.add(dDrive);
        rootNode.add(eDrive);


        //Creating 3 children of C drive
        DefaultMutableTreeNode cDriveChild1 = new DefaultMutableTreeNode("Documents and Settings");
        DefaultMutableTreeNode cDriveChild2 = new DefaultMutableTreeNode("Windows");
        DefaultMutableTreeNode cDriveChild3 = new DefaultMutableTreeNode("Java");

        //Adding 3 children to C drive
        cDrive.add(cDriveChild1);
        cDrive.add(cDriveChild2);
        cDrive.add(cDriveChild3);


        //Creating two children of D Drive
        DefaultMutableTreeNode dDriveChild1 = new DefaultMutableTreeNode("Games");
        DefaultMutableTreeNode dDriveChild2 = new DefaultMutableTreeNode("Music");

        //Adding two child of D Drive to D Drive.
        dDrive.add(dDriveChild1);
        dDrive.add(dDriveChild2);


        //Creating and adding one child of E Drive.
        DefaultMutableTreeNode eDriveChild1 = new DefaultMutableTreeNode("Movies");
        eDrive.add(eDriveChild1);


        dTree= new DefaultTreeModel(rootNode);

        //Creating a JTree from DefaultTreeModel, implementer of TreeModel Interface.
        JTree tree = new JTree(dTree);


        //Registering A class to listen to JTree events.
        tree.addTreeSelectionListener(this);

        //Adding JTree to JScrollPane
        JScrollPane scrollP = new JScrollPane(tree);

        scrollP.setBorder(BorderFactory.createEmptyBorder()); //How to remove the border of JScrollPane.
        scrollP.setPreferredSize(new Dimension(300, 190));


        jf.add(label1);
        jf.add(scrollP);
        jf.add(label2);

        jf.setLayout(new FlowLayout());
        jf.setSize(400,300);
        jf.setVisible(true);
    }

    public void valueChanged(TreeSelectionEvent treeEvent)
    {
        label2.setText("Path selected : " + treeEvent.getPath()); //Returns TreePath object, whose toString() method is called to display the selected path
        System.out.println("path selected");
    }

}