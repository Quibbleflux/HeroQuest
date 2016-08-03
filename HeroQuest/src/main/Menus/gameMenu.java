package main.Menus;

import java.awt.GridLayout;

/**
 * MainMenu class extending Menu.
 * @author Matthew Wallace
 */
public class gameMenu extends Menu {
    public gameMenu() {
        this.setMenucode(MenuCode.GAME_MENU);
        this.setLayout(new GridLayout(0,1,10,10));
        
        this.setVisible(true);
        Menu.menulist.add(this);
    }   
}
