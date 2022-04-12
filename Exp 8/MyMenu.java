/* Design a menu bar  with file contaiing new, open,save, save as and 
edit containing cut, copy, paste.Also add features : 
separator,check box, shortcut keys and sub menu in java */
import java.awt.*;
import java.awt.event.*;

class MyMenu   
{
    MyMenu(){
        Frame fr = new Frame("CST");

        MenuBar mb = new MenuBar();
        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");

        MenuShortcut menushortcut_1 = new MenuShortcut(KeyEvent.VK_N, false);
        MenuShortcut menushortcut_2 = new MenuShortcut(KeyEvent.VK_O, false);
        MenuShortcut menushortcut_3 = new MenuShortcut(KeyEvent.VK_C, false);
        MenuShortcut menushortcut_4 = new MenuShortcut(KeyEvent.VK_X, false);
        MenuShortcut menushortcut_5 = new MenuShortcut(KeyEvent.VK_V, false);

        MenuItem new1 = new MenuItem("New", menushortcut_1);
        MenuItem open = new MenuItem("Open", menushortcut_2);

        Menu submenu = new Menu("Save");
        MenuItem m1 = new MenuItem(".java");
        MenuItem m2 = new MenuItem(".py");
        MenuItem m3 = new MenuItem(".c");
        submenu.add(m1);
        submenu.add(m2);
        submenu.add(m3);

        CheckboxMenuItem saveas = new CheckboxMenuItem("Save as");
        MenuItem cut = new MenuItem("Cut", menushortcut_3);
        MenuItem copy = new MenuItem("Copy", menushortcut_4);
        MenuItem paste = new MenuItem("Paste", menushortcut_5);

        file.add(new1);
        file.add(open);
        file.addSeparator();
        file.add(submenu);
        file.add(saveas);

        edit.add(cut);
        edit.add(copy);
        edit.add(paste);

        mb.add(file);
        mb.add(edit);

        fr.setMenuBar(mb);
        fr.setVisible(true);
        fr.setSize(700, 700);
    }
    public static void main(String arg[]){
        MyMenu obj = new MyMenu();
    }
}