package main;

import main.Menus.MainMenu;
import javax.swing.JFrame;
import main.Menus.DebugMenu;

/**
 * 
 * @author Matts
 * @version Alpha
 */
public class Main {

    public static void main(String[] args) {
        JFrame mainFrame = new JFrame("Test");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.add(new DebugMenu());
        mainFrame.add(new MainMenu());
        mainFrame.setSize(800, 600);
        mainFrame.setVisible(true);
    }
}
