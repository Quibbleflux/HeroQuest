package main.Menus;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * Menu Class
 * @author Matts
 */

public abstract class Menu extends JPanel {

    public static ArrayList<Menu> menulist = new ArrayList();
    
    private MenuCode menucode;
    public final MenuCode getMenucode() {
        return menucode;
    }
    public final void setMenucode(MenuCode menucode) {
        this.menucode = menucode;
    }
    
    public final void swapMenu(MenuCode i) {
        for (Menu menu : menulist) {
            if (menu.getMenucode() == i) {
                menu.updateMenu();
                menu.setVisible(true);
                this.setVisible(false);
            }
        }
    }
    
    public void updateMenu() {};
    
    public final void addButton (String name, ActionListener e) {
        JButton button = new JButton(name);
        button.addActionListener(e);
        button.addActionListener((f) -> {System.out.println(name + " clicked.");});
        this.add(button);
    }
    
}
