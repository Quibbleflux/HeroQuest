package main;

import java.util.ArrayList;
import javax.swing.JPanel;

/**
 * Menu Class
 * @author Matts
 */
public abstract class Menu extends JPanel {
    
    /**
     * ArrayList that stores all generated menus to allow cross referencing
     * between menus once they're initialized.
     */
    public static ArrayList<Menu> menulist = new ArrayList();
    
    private int menucode;
    public final int getMenucode() {
        return menucode;
    }
    public final void setMenucode(int menucode) {
        this.menucode = menucode;
    }
    
    /**
     * Using the menuCode passed to it, hides current menu and displays
     * requested menu.
     * @param i menuCode
     */
    public final void swapMenu(int i) {
        for (Menu menu : menulist) {
            if (menu.getMenucode() == i) {
                menu.updateMenu();
                menu.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    
    public void updateMenu() {};
    
}
