package main.Menus;

import java.awt.GridLayout;
import javax.swing.JButton;

/**
 * MainMenu class extending Menu.
 * @author Matthew Wallace
 */
public class MainMenu extends Menu {
    /**
     * Constructs the elements of the Main Menu.
     */
    public MainMenu() {
        // Instantiate each of the buttons to be displayed.
        JButton newGame = new JButton("New Game");
        JButton loadGame = new JButton("Load Game");
        
        // Set the menuCode for MainMenu to 1.
        this.setMenucode(1);
        
        // Set the Layout Manager for MainMenu to GridLayout with one column.
        this.setLayout(new GridLayout(0,1,10,10));

        
        // Add buttons to the panel.
        this.add(newGame);
        this.add(loadGame);
        this.setVisible(true);
        Menu.menulist.add(this);
    }   
}
