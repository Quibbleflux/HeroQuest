package main;

import main.Classes.Hero;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matts
 */
public class Party {
    private List<Hero> roster = new ArrayList();
    
    public Party() {
        
    }

    public List<Hero> getRoster() {
        return roster;
    }

    public void setRoster(List<Hero> roster) {
        this.roster = roster;
    }
    
    public void addHero(Hero hero) {
        roster.add(hero);
    }
}
