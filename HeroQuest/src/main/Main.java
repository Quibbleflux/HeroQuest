package main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import main.Menus.*;
import javax.swing.JFrame;

/**
 * 
 * @author Matts
 * @version Alpha
 */
public class Main {
    private static JFrame mainFrame;
    private static Game game;

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        Main.game = game;
    }
    
    // For some reason it refuses to properly pack to any preferred size aside from Main Menu
    public static void repack() {
        mainFrame.pack();
    }
    
    public static void main(String[] args) {
        mainFrame = new JFrame("HeroQuest");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setMinimumSize(new Dimension(800,600));
        mainFrame.setSize(new Dimension(800,600));
//        mainFrame.add(new gameMenu());
//        mainFrame.add(new DebugMenu());
        mainFrame.add(new HeroMenu());
        mainFrame.add(new MainMenu());
        mainFrame.setVisible(true);
    }
}
