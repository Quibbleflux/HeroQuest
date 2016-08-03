package main.Menus;

import java.awt.GridLayout;

/**
 * 
 * @author Matthew Wallace
 */
public class MainMenu extends Menu {
    public MainMenu() {
        this.setMenucode(MenuCode.MAIN_MENU);
        this.setLayout(new GridLayout(0,1,10,10));
        
        this.addButton("New Game", (e) -> {
            this.swapMenu(MenuCode.DEBUG_MENU);
        });
        this.addButton("Load Game", (e) -> {});
        
        this.setVisible(true);
        Menu.menulist.add(this);
    }   
}
