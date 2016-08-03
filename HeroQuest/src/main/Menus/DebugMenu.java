package main.Menus;

import java.awt.GridLayout;

/**
 *
 * @author Matthew
 */
public class DebugMenu extends Menu {
    public DebugMenu() {        
        this.setMenucode(MenuCode.DEBUG_MENU);
        this.setLayout(new GridLayout(1,1,10,10));
        
        this.addButton("Test", (e) -> {
           System.out.println("Testing"); 
        });

                       
        this.setVisible(false);
        Menu.menulist.add(this);
    }
}
