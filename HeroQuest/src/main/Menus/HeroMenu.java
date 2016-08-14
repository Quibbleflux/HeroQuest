package main.Menus;

import java.awt.Dimension;
import java.awt.GridLayout;
import main.Classes.*;
import main.Main;

/**
 *
 * @author Matt
 */
public class HeroMenu extends Menu {
        public HeroMenu() {
        this.setMenucode(MenuCode.HERO_MENU);
        this.setLayout(new GridLayout(2,2,10,10));
//        this.setMinimumSize(new Dimension(800,600));
//        this.setSize(800,600);
        this.setPreferredSize(new Dimension(800,600));
        this.addButton("Warrior", (e) -> {
            Main.getGame().getParty().addHero(new Warrior());
            this.swapMenu(MenuCode.GAME_MENU);
        });
        this.addButton("Mage", (e) -> {
            Main.getGame().getParty().addHero(new Mage());
            this.swapMenu(MenuCode.GAME_MENU);
        });
        this.addButton("Rogue", (e) -> {
            Main.getGame().getParty().addHero(new Rogue());
            this.swapMenu(MenuCode.GAME_MENU);
        });
        this.addButton("Cleric", (e) -> {
            Main.getGame().getParty().addHero(new Cleric());
            this.swapMenu(MenuCode.GAME_MENU);
        });
        
        this.setVisible(false);
        Menu.menulist.add(this);
    }   
}
